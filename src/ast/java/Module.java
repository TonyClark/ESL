package ast.java;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashSet;
import java.util.Stack;
import java.util.Vector;

import ast.actors.Act;
import ast.actors.ActorDynamicRef;
import ast.actors.Become;
import ast.actors.DynamicRef;
import ast.actors.ExportedName;
import ast.actors.Grab;
import ast.actors.New;
import ast.actors.NewJava;
import ast.actors.Self;
import ast.actors.Send;
import ast.actors.VarDynamicRef;
import ast.binding.Binding;
import ast.binding.Let;
import ast.binding.Letrec;
import ast.binding.TypeBind;
import ast.binding.Update;
import ast.binding.Var;
import ast.cmp.BQual;
import ast.cmp.Cmp;
import ast.cmp.PQual;
import ast.cmp.Qualifier;
import ast.control.Block;
import ast.control.Now;
import ast.control.Throw;
import ast.data.Apply;
import ast.data.ApplyType;
import ast.data.BinExp;
import ast.data.Fold;
import ast.data.Fun;
import ast.data.Not;
import ast.data.Null;
import ast.data.Ref;
import ast.general.AST;
import ast.java.types.NamedType;
import ast.java.types.Record;
import ast.lists.For;
import ast.patterns.PApplyType;
import ast.patterns.PBagCons;
import ast.patterns.PCons;
import ast.patterns.PInt;
import ast.patterns.PNil;
import ast.patterns.PNull;
import ast.patterns.PTerm;
import ast.patterns.PVar;
import ast.patterns.Pattern;
import ast.tests.BArm;
import ast.tests.Case;
import ast.tests.Probably;
import ast.types.Bag;
import ast.types.Field;
import ast.types.Forall;
import ast.types.Int;
import ast.types.Rec;
import ast.types.Term;
import ast.types.Type;
import ast.types.Union;
import env.Env;
import list.List;

public class Module {

	String						name;
	Vector<String>		exports				= new Vector<String>();
	Vector<String>		imports				= new Vector<String>();
	Vector<Dec>				declarations	= new Vector<Dec>();
	HashSet<Integer>	funs					= new HashSet<Integer>();
	Vector<Behaviour>	behaviours		= new Vector<Behaviour>();
	Vector<Record>		records				= new Vector<Record>();

	public Module(String name) {
		super();
		this.name = name;
	}

	private Exp applyNth(AST[] args, ast.modules.Module module, List<Dec> decs, Env<String, Type> typeEnv) {
		AST list = args[0];
		AST index = args[1];
		return new Nth(processExp(list, module, decs, typeEnv), processExp(index, module, decs, typeEnv));
	}

	private Dec find(String name, List<Dec> decs) {
		if (decs.isNil())
			return null;
		else if (decs.getHead().getName().equals(name))
			return decs.getHead();
		else
			return find(name, decs.getTail());
	}

	private String getActorName(Type type, Env<String, Type> typeEnv) {
		for (Behaviour b : behaviours) {
			if (Type.equals(type, b.getType(), typeEnv)) return b.getName();
		}
		return null;
	}

	private ast.java.types.Type getActorType(ast.types.Act type, Env<String, Type> typeEnv) {
		for (int i = 0; i < behaviours.size(); i++) {
			if (Type.equals(type, behaviours.get(i).getType(), typeEnv)) return new NamedType(behaviours.get(i).getName());
		}
		throw new Error("cannot find actor type " + type);
	}

	private String getClassName() {
		java.io.File file = new java.io.File(name);
		String n = file.getName().replace(".esl", "");
		// String[] names = name.replace(".esl", "").split("/");
		// int length = names.length;
		// String n = names[length - 1];
		return initialUpper(n);
	}

	private List<Dec> getDecs(Env<String, Type> newEnv, Env<String, Type> oldEnv) {
		List<Dec> decs = new list.Nil();
		Vector<String> declaredVars = newEnv.dom();
		declaredVars.removeAll(oldEnv.dom());
		for (String declaredName : declaredVars) {
			decs = decs.cons(new Dec(toJavaType(newEnv.lookup(declaredName), newEnv), declaredName, null));
		}
		return decs;
	}

	private String getFileName() {
		return getClassName() + ".java";
	}

	private BArm[] getMessageArms(BArm[] arms) {
		Vector<BArm> messageArms = new Vector<BArm>();
		for (BArm a : arms) {
			PTerm term = (PTerm) a.getPatterns()[0];
			if (!term.getName().equals("Time")) messageArms.add(a);
		}
		BArm[] a = new BArm[messageArms.size()];
		return messageArms.toArray(a);
	}

	private BArm[] getTimeArms(BArm[] arms) {
		Vector<BArm> timeArms = new Vector<BArm>();
		for (BArm a : arms) {
			PTerm term = (PTerm) a.getPatterns()[0];
			if (term.getName().equals("Time")) timeArms.add(a);
		}
		BArm[] a = new BArm[timeArms.size()];
		return timeArms.toArray(a);
	}

	private Vector<BArm> getTimeHandlers(BArm[] arms) {
		Vector<BArm> handlers = new Vector<BArm>();
		for (BArm arm : arms) {
			if (isTimeHandler(arm)) handlers.add(arm);
		}
		return handlers;
	}

	private String initialUpper(String n) {
		return n.substring(0, 1).toUpperCase() + n.substring(1).toLowerCase();
	}

	private boolean isBuiltin(Exp op) {
		if (op instanceof ast.java.Var) {
			ast.java.Var v = (ast.java.Var) op;
			return v.name.equals("builtin");
		} else
			return false;
	}

	private boolean isEmptyTimeHandler(BArm[] timeArms) {
		if (timeArms.length == 0)
			return true;
		else if (timeArms.length == 1) {
			BArm arm = timeArms[0];
			if (arm.exp instanceof Block) {
				Block block = (Block) arm.exp;
				return block.exps.length == 0;
			} else
				return false;
		} else
			return false;
	}

	private boolean isNth(Exp op) {
		if (op instanceof ast.java.Var) {
			ast.java.Var v = (ast.java.Var) op;
			return v.name.equals("nth");
		} else
			return false;
	}

	private boolean isParse(Exp op) {
		if (op instanceof ast.java.Var) {
			ast.java.Var v = (ast.java.Var) op;
			return v.name.equals("parse");
		} else
			return false;
	}

	private boolean isSimpleTimeBinding(BArm[] timeArms) {
		if (timeArms.length == 1 && timeArms[0].patterns[0] instanceof PTerm) {
			PTerm term = (PTerm) timeArms[0].patterns[0];
			return term.getPatterns()[0] instanceof PVar;
		} else
			return false;
	}

	private boolean isTimeHandler(BArm arm) {
		Pattern p = arm.patterns[0];
		if (p instanceof PTerm) {
			PTerm term = (PTerm) p;
			return term.getName().equals("Time") && term.getPatterns().length == 1;
		} else
			return false;
	}

	public void process(ast.modules.Module module, List<Dec> decs, Env<String, Type> typeEnv) {
		processExports(module);
		processImports(module);
		processModuleBindings(module, decs, typeEnv);
	}

	private void processModuleBindings(ast.modules.Module module, List<Dec> decs, Env<String, Type> typeEnv) {
		for (Binding b : module.getDefs()) {
			if (b instanceof TypeBind) {
				TypeBind tb = (TypeBind) b;
				processTypeBinding(tb, module, decs, typeEnv);
			} else {
				Dec dec = processValueBinding(b, module, decs, typeEnv);
				declarations.add(dec);
				decs = decs.cons(dec);
			}
		}
	}

	private Exp processAct(Act a, ast.modules.Module module, List<Dec> decs, Env<String, Type> typeEnv) {
		ast.types.Act type = (ast.types.Act) a.type(typeEnv);
		typeEnv = typeEnv.bind("self", type);
		String name = register(type, typeEnv);
		Binding[] bindings = a.getBindings();
		Dec[] localDecs = new Dec[bindings.length];
		typeEnv = Binding.typeBindingsRec(bindings, typeEnv);
		for (int i = 0; i < bindings.length; i++) {
			Binding b = bindings[i];
			Dec dec = processValueBinding(b, module, decs, typeEnv);
			decs = decs.cons(dec);
			localDecs[i] = dec;
			// typeEnv = typeEnv.bind(b.getName(), b.getDeclaredType());
		}
		BArm[] allArms = a.getArms();
		BArm[] messageArms = getMessageArms(allArms);
		BArm[] timeArms = getTimeArms(allArms);
		typeEnv = typeEnv.bind("message", new ast.types.Var(0, 0, "$$Message$$", null));
		Dec dec = new Dec(ast.java.types.Type.TERM, "message", null);
		Var var = new Var(0, 0, "message", null, null);
		AST[] values = new AST[] { var };
		ast.java.Case case_ = processCase(values, messageArms, ast.java.types.Type.OBJ, module, decs.cons(dec), typeEnv);
		TimeHandler timeHandler = processTime(timeArms, module, decs, typeEnv);
		case_.toMessageHandler();
		Exp init = processExp(a.init, module, decs, typeEnv);
		return new Actor(name, localDecs, init, case_, timeHandler);
	}

	private Exp processApply(Apply a, ast.modules.Module module, List<Dec> decs, Env<String, Type> typeEnv) {
		ast.java.Exp op = processExp(a.op, module, decs, typeEnv);
		if (isBuiltin(op))
			return processBuiltin(a.args, module, decs, typeEnv);
		else if (isNth(op))
			return applyNth(a.args, module, decs, typeEnv);
		else if (isCirclePos(a.op))
			return applyCirclePos(a.args, module, decs, typeEnv);
		else if (isParse(op))
			return applyParse(a.args, module, decs, typeEnv);
		else
			return processApply(op, a, module, decs, typeEnv);
	}

	private Exp applyCirclePos(AST[] args, ast.modules.Module module, List<Dec> decs, Env<String, Type> typeEnv) {
		Exp[] exps = new Exp[args.length];
		for (int i = 0; i < args.length; i++) {
			exps[i] = processExp(args[i], module, decs, typeEnv);
		}
		return new ApplyBuiltin("circlePos", exps);
	}

	private Exp applyParse(AST[] args, ast.modules.Module module, List<Dec> decs, Env<String, Type> typeEnv) {
		Exp[] exps = new Exp[args.length];
		for (int i = 0; i < args.length; i++) {
			exps[i] = processExp(args[i], module, decs, typeEnv);
		}
		return new ApplyBuiltin("parse", exps);
	}

	private boolean isCirclePos(AST op) {
		// This is not really correct since edb.math.circlePos is first class...
		if (op instanceof Ref) {
			Ref ref1 = (Ref) op;
			if (ref1.getName().getString().equals("circlePos") && ref1.getNamespace() instanceof Ref) {
				Ref ref2 = (Ref) ref1.getNamespace();
				if (ref2.getName().getString().equals("math") && ref2.getNamespace() instanceof Var) {
					Var var = (Var) ref2.getNamespace();
					return var.getName().equals("edb");
				} else
					return false;
			} else
				return false;
		} else
			return false;
	}

	private Exp processApply(Exp op, Apply a, ast.modules.Module module, List<Dec> decs, Env<String, Type> typeEnv) {
		ast.java.Exp[] args = new ast.java.Exp[a.args.length];
		for (int i = 0; i < args.length; i++) {
			args[i] = processExp(a.getArgs()[i], module, decs, typeEnv);
		}
		return new ast.java.Apply(op, args);
	}

	private Exp processApplyType(ApplyType exp, ast.modules.Module module, List<Dec> decs, Env<String, Type> typeEnv) {
		return processExp(exp.op, module, decs, typeEnv);
	}

	private CaseArm processArm(AST[] exps, BArm bArm, ast.modules.Module module, List<Dec> decs, Env<String, Type> typeEnv) {
		Pattern[] patterns = bArm.patterns;
		Stack<Pattern> patternStack = new Stack<Pattern>();
		Stack<Exp> expStack = new Stack<Exp>();
		AST guard = bArm.guard;
		AST body = bArm.exp;
		for (int i = patterns.length - 1; i >= 0; i--) {
			patternStack.push(patterns[i]);
			expStack.push(new ast.java.Var("var" + i, find("var" + i, decs)));
		}
		return processArm(expStack, patternStack, guard, body, module, decs, typeEnv);
	}

	private CaseArm processArm(Stack<Exp> exps, Stack<Pattern> patterns, AST guard, AST body, ast.modules.Module module, List<Dec> decs, Env<String, Type> typeEnv) {
		if (patterns.isEmpty())
			return new CaseBody(processExp(guard, module, decs, typeEnv), processExp(body, module, decs, typeEnv), toJavaType(body.type(typeEnv), typeEnv));
		else {
			Pattern p = patterns.pop();
			Exp e = exps.pop();
			if (p instanceof PTerm)
				return processPTerm((PTerm) p, e, exps, patterns, guard, body, module, decs, typeEnv);
			else if (p instanceof PInt)
				return processPInt((PInt) p, e, exps, patterns, guard, body, module, decs, typeEnv);
			else if (p instanceof PVar)
				return processPVar((PVar) p, e, exps, patterns, guard, body, module, decs, typeEnv);
			else if (p instanceof PCons)
				return processPCons((PCons) p, e, exps, patterns, guard, body, module, decs, typeEnv);
			else if (p instanceof PNil)
				return processPNil((PNil) p, e, exps, patterns, guard, body, module, decs, typeEnv);
			else if (p instanceof PBagCons)
				return processPBagCons((PBagCons) p, e, exps, patterns, guard, body, module, decs, typeEnv);
			else if (p instanceof PNull)
				return processPNull((PNull) p, e, exps, patterns, guard, body, module, decs, typeEnv);
			else if (p instanceof PApplyType)
				return processPApplyType((PApplyType) p, e, exps, patterns, guard, body, module, decs, typeEnv);
			else
				throw new Error("unknown pattern: " + p);
		}
	}

	private Exp processBinExp(BinExp b, ast.modules.Module module, List<Dec> decs, Env<String, Type> typeEnv) {
		if (b.getOp().equals(".."))
			return new To(processExp(b.left, module, decs, typeEnv), processExp(b.right, module, decs, typeEnv));
		else {
			Exp left = processExp(b.left, module, decs, typeEnv);
			Exp right = processExp(b.right, module, decs, typeEnv);
			Type leftType = b.left.type(typeEnv);
			Type rightType = b.right.type(typeEnv);
			return new ast.java.BinExp(left, toJavaType(leftType, typeEnv), b.op, right, toJavaType(rightType, typeEnv));
		}
	}

	private Exp processBlock(Block exp, ast.modules.Module module, List<Dec> decs, Env<String, Type> typeEnv) {
		Exp[] exps = new Exp[exp.exps.length];
		for (int i = 0; i < exps.length; i++) {
			exps[i] = processExp(exp.exps[i], module, decs, typeEnv);
		}
		ast.java.types.Type type = exps.length == 0 ? ast.java.types.Type.OBJ : toJavaType(exp.exps[exps.length - 1].type(typeEnv), typeEnv);
		return new ast.java.Block(exps, type);
	}

	private Exp processBQual(BQual q, AST exp, Type sourceType, ast.modules.Module module, List<Dec> decs, Env<String, Type> typeEnv) {
		Flatten[] result = new Flatten[1];
		String name = "mapElement";
		Var var = new Var(0, 0, name, sourceType, null);
		AST list = q.exp;
		sourceType = ((ast.types.List) list.type(typeEnv)).type;
		Pattern p = q.getPattern();
		BArm matchArm = new BArm(new Pattern[] { p }, new ast.data.Bool(true), new ast.lists.List(0, 0, exp), false);
		ApplyType[] apply = new ApplyType[1];
		p.type(typeEnv, (env, type) -> {
			apply[0] = new ApplyType(new ast.lists.List(), exp.type(env));
		});
		BArm elseArm = new BArm(new Pattern[] { new PVar("else_", sourceType) }, new ast.data.Bool(true), apply[0], false);
		Case case_ = new Case(0, 0, new ast.binding.Dec[0], new AST[] { var }, new BArm[] { matchArm, elseArm });
		Env<String, Type> newTypeEnv = typeEnv.bind("mapElement", sourceType);
		Type targetType = case_.type(newTypeEnv);
		decs = decs.cons(new Dec(toJavaType(sourceType, typeEnv), "mapElement", null));
		Exp listExp = processExp(list, module, decs, typeEnv);
		Map map = new Map(listExp, processExp(case_, module, decs, newTypeEnv), toJavaType(sourceType, typeEnv), toJavaType(targetType, typeEnv));
		return new Flatten(map, toJavaType(targetType, typeEnv));
	}

	private Exp processBuiltin(AST[] args, ast.modules.Module module, List<Dec> decs, Env<String, Type> typeEnv) {
		ast.data.Str name = (ast.data.Str) args[1];
		return new Builtin(name.getValue());
	}

	private ast.java.Case processCase(AST[] exps, BArm[] arms, ast.java.types.Type type, ast.modules.Module module, List<Dec> decs, Env<String, Type> typeEnv) {
		CaseArm[] caseArms = new CaseArm[arms.length];
		Dec[] caseDecs = new Dec[exps.length];
		for (int i = exps.length - 1; i >= 0; i--) {
			caseDecs[i] = new Dec(toJavaType(exps[i].type(typeEnv), typeEnv), "var" + i, processExp(exps[i], module, decs, typeEnv));
			decs = decs.cons(caseDecs[i]);
		}
		for (int i = 0; i < arms.length; i++) {
			caseArms[i] = processArm(exps, arms[i], module, decs, typeEnv);
		}
		funs.add(exps.length);
		return new ast.java.Case(caseDecs, caseArms, type);
	}

	private Exp processCmp(Cmp cmp, ast.modules.Module module, List<Dec> decs, Env<String, Type> typeEnv) {
		ast.types.List listType = (ast.types.List) cmp.type(typeEnv);
		if (cmp.qualifiers.length == 1)
			return processQual(cmp.qualifiers[0], cmp.exp, listType.type, module, decs, typeEnv);
		else {
			Qualifier[] quals = new Qualifier[cmp.qualifiers.length - 1];
			for (int i = 1; i < cmp.qualifiers.length; i++) {
				quals[i - 1] = cmp.qualifiers[i];
			}
			return new Flatten(processExp(new Cmp(0, 0, new Cmp(0, 0, cmp.exp, quals), new Qualifier[] { cmp.qualifiers[0] }), module, decs, typeEnv),
			    toJavaType(listType.type, typeEnv));
		}
	}

	private Cnstr processCnstr(Term term, Env<String, Type> typeEnv) {
		String name = term.getName();
		ast.java.types.Type[] types = new ast.java.types.Type[term.getArity()];
		for (int i = 0; i < types.length; i++) {
			Type type = term.getTypes()[i];
			types[i] = toJavaType(type, typeEnv);
		}
		return new Cnstr(name, types);
	}

	private TimeHandler processComplexTime(BArm[] timeArms, ast.modules.Module module, List<Dec> decs, Env<String, Type> typeEnv) {
		typeEnv = typeEnv.bind("time_", ast.types.Int.INT);
		timeArms = stripTime(timeArms);
		Dec dec = new Dec(ast.java.types.Type.INT, "time_", null);
		Var var = new Var(0, 0, "time_", null, null);
		AST[] values = new AST[] { var };
		ast.java.Case case_ = processCase(values, timeArms, ast.java.types.Type.OBJ, module, decs.cons(dec), typeEnv);
		case_.toMessageHandler();
		return new TimeHandler("time_", case_);
	}

	private Exp processDot(Ref ref, ast.modules.Module module, List<Dec> decs, Env<String, Type> typeEnv) {
		AST exp = ref.namespace;
		Type type = ref.type(typeEnv);
		String name = ref.name.getString();
		return new Dot(toJavaType(type, typeEnv), processExp(exp, module, decs, typeEnv), name);
	}

	private Exp processExp(AST exp, ast.modules.Module module, List<Dec> decs, Env<String, Type> typeEnv) {
		if (exp instanceof Var) {
			return processVar((Var) exp, module, decs, typeEnv);
		} else if (exp instanceof ast.data.Int) {
			ast.data.Int i = (ast.data.Int) exp;
			return new ast.java.Int(i.value);
		} else if (exp instanceof ast.data.Str) {
			ast.data.Str s = (ast.data.Str) exp;
			return new ast.java.Str(s.value);
		} else if (exp instanceof ast.data.Float) {
			ast.data.Float s = (ast.data.Float) exp;
			return new ast.java.Float(new Double(new String(s.n + "." + s.m)).doubleValue());
		} else if (exp instanceof ast.data.Bool) {
			ast.data.Bool b = (ast.data.Bool) exp;
			return new ast.java.Bool(b.value);
		} else if (exp instanceof ast.data.BinExp) {
			return processBinExp((ast.data.BinExp) exp, module, decs, typeEnv);
		} else if (exp instanceof ast.tests.If) {
			ast.tests.If i = (ast.tests.If) exp;
			if (i.alwaysTrue())
				return processExp(i.conseq, module, decs, typeEnv);
			else if (i.alwaysFalse())
				return processExp(i.alt, module, decs, typeEnv);
			else
				return new ast.java.If(processExp(i.test, module, decs, typeEnv), processExp(i.conseq, module, decs, typeEnv), processExp(i.alt, module, decs, typeEnv));
		} else if (exp instanceof ast.data.Apply) {
			return processApply((ast.data.Apply) exp, module, decs, typeEnv);
		} else if (exp instanceof ast.data.Fun) {
			ast.data.Fun f = (ast.data.Fun) exp;
			return processFunExp(f, module, decs, typeEnv);
		} else if (exp instanceof ast.lists.List) {
			ast.lists.List l = (ast.lists.List) exp;
			return processListExp(l, module, decs, typeEnv);
		} else if (exp instanceof Case) {
			Case c = (Case) exp;
			Type type = c.type(typeEnv);
			ast.java.types.Type jtype = toJavaType(type, typeEnv);
			return processCase(c.exps, c.arms, jtype, module, decs, typeEnv);
		} else if (exp instanceof ast.data.Term) {
			ast.data.Term t = (ast.data.Term) exp;
			return processTerm(t, module, decs, typeEnv);
		} else if (exp instanceof ast.actors.Act) {
			ast.actors.Act a = (ast.actors.Act) exp;
			return processAct(a, module, decs, typeEnv);
		} else if (exp instanceof New) {
			return processNew((New) exp, module, decs, typeEnv);
		} else if (exp instanceof Send) {
			return processSend((Send) exp, module, decs, typeEnv);
		} else if (exp instanceof Block) {
			return processBlock((Block) exp, module, decs, typeEnv);
		} else if (exp instanceof ApplyType) {
			return processApplyType((ApplyType) exp, module, decs, typeEnv);
		} else if (exp instanceof ast.binding.Update) {
			return processUpdate((ast.binding.Update) exp, module, decs, typeEnv);
		} else if (exp instanceof Ref) {
			return processDot((Ref) exp, module, decs, typeEnv);
		} else if (exp instanceof NewJava) {
			return processNewJava((NewJava) exp, module, decs, typeEnv);
		} else if (exp instanceof Null) {
			return new ast.java.Null();
		} else if (exp instanceof Cmp) {
			return processCmp((Cmp) exp, module, decs, typeEnv);
		} else if (exp instanceof For) {
			return processFor((For) exp, module, decs, typeEnv);
		} else if (exp instanceof Self) {
			return processSelf((Self) exp, module, decs, typeEnv);
		} else if (exp instanceof Grab) {
			return processGrab((Grab) exp, module, decs, typeEnv);
		} else if (exp instanceof Probably) {
			return processProbably((Probably) exp, module, decs, typeEnv);
		} else if (exp instanceof Throw) {
			return processThrow((Throw) exp, module, decs, typeEnv);
		} else if (exp instanceof Let) {
			return processLet((Let) exp, module, decs, typeEnv);
		} else if (exp instanceof Letrec) {
			return processLetrec((Letrec) exp, module, decs, typeEnv);
		} else if (exp instanceof Not) {
			return processNot((Not) exp, module, decs, typeEnv);
		} else if (exp instanceof Fold) {
			return processFold((Fold) exp, module, decs, typeEnv);
		} else if (exp instanceof Now) {
			return processNow((Now) exp, module, decs, typeEnv);
		} else if (exp instanceof Become) {
			return processBecome((Become) exp, module, decs, typeEnv);
		} else
			throw new Error("unknown type of exp: " + exp);
	}

	private Exp processBecome(Become exp, ast.modules.Module module, List<Dec> decs, Env<String, Type> typeEnv) {
		AST behaviour = exp.behaviour;
		return new ast.java.Become(processExp(behaviour, module, decs, typeEnv));
	}

	private Exp processNow(Now exp, ast.modules.Module module, List<Dec> decs, Env<String, Type> typeEnv) {
		return new ast.java.Now();
	}

	private Exp processFold(Fold exp, ast.modules.Module module, List<Dec> decs, Env<String, Type> typeEnv) {
		return processExp(exp.exp, module, decs, typeEnv);
	}

	private void processExports(ast.modules.Module module) {
		ast.actors.Export export = module.getExports();
		for (ExportedName x : export.getNames()) {
			exports.add(x.getName());
		}
	}

	private Exp processFor(For f, ast.modules.Module module, List<Dec> decs, Env<String, Type> typeEnv) {
		Pattern p = f.pattern;
		if (p instanceof PVar) {
			return processSimpleFor((PVar) p, f, module, decs, typeEnv);
		} else
			return processPatternFor(p, f, module, decs, typeEnv);
	}

	private Exp processFunExp(Fun f, ast.modules.Module module, List<Dec> decs, Env<String, Type> typeEnv) {
		ast.binding.Dec[] args = f.getArgs();
		AST body = f.getBody();
		Type type = f.type(typeEnv);
		if (type instanceof ast.types.Fun)
			return processGroundFunExp((ast.types.Fun) type, args, body, module, decs, typeEnv);
		else if (type instanceof ast.types.Forall)
			return processGenericFunExp((ast.types.Forall) type, args, body, module, decs, typeEnv);
		else
			throw new Error("unknown fun type: " + f + "::" + type);
	}

	private Exp processGenericFunExp(Forall type, ast.binding.Dec[] args, AST body, ast.modules.Module module, List<Dec> decs, Env<String, Type> typeEnv) {
		return processGroundFunExp((ast.types.Fun) type.type, args, body, module, decs, typeEnv);
	}

	private Dec processGenericValueBinding(String name, Forall type, AST exp, ast.modules.Module module, List<Dec> decs, Env<String, Type> typeEnv) {
		String[] names = type.getNames();
		for (String n : names) {
			typeEnv = typeEnv.bind(n, new ast.types.Var(0, 0, n, null));
		}
		GenericDec dec = new GenericDec(names, toJavaType(type.type, typeEnv), name, processExp(exp, module, decs, typeEnv));
		return dec;
	}

	private Exp processGrab(Grab exp, ast.modules.Module module, List<Dec> decs, Env<String, Type> typeEnv) {
		Lock[] locks = new Lock[exp.vars.length];
		for (int i = 0; i < locks.length; i++) {
			DynamicRef ref = exp.vars[i];
			if (ref instanceof VarDynamicRef) {
				VarDynamicRef var = (VarDynamicRef) ref;
				locks[i] = new VarLock(var.name.name);
			} else if (ref instanceof ActorDynamicRef) {
				throw new Error("DynamicRef not implemented.");
			} else
				throw new Error("unknown type of ref : + ref)");
		}
		return new ast.java.Grab(locks, processExp(exp.body, module, decs, typeEnv), toJavaType(exp.body.type(typeEnv), typeEnv));
	}

	private Exp processGroundFunExp(ast.types.Fun type, ast.binding.Dec[] args, AST body, ast.modules.Module module, List<Dec> decs, Env<String, Type> typeEnv) {
		funs.add(args.length);
		Dec[] jargs = new Dec[args.length];
		for (int i = 0; i < args.length; i++) {
			jargs[i] = new Dec(toJavaType(args[i].getDeclaredType(), typeEnv), args[i].getName(), null);
			typeEnv = typeEnv.bind(args[i].name, args[i].getDeclaredType());
			decs = decs.cons(jargs[i]);
		}
		ast.java.types.Type range = toJavaType(type.getRange(), typeEnv);
		return new ast.java.Fun(jargs, range, processExp(body, module, decs, typeEnv));
	}

	private Dec processGroundValueBinding(String name, ast.java.types.Type type, AST exp, ast.modules.Module module, List<Dec> decs, Env<String, Type> typeEnv) {
		Dec dec = new Dec(type, name, null);
		Exp jexp = processExp(exp, module, decs.cons(dec), typeEnv);
		dec.exp = jexp;
		return dec;
	}

	private void processImports(ast.modules.Module module) {
		for (String i : module.getImported().keySet()) {
			System.out.println("[ import " + i + "]");
			ast.modules.Module m = module.getImported().get(i);
			Module imported = m.getModuleClass();
			imports.add(imported.getClassName());
			imported.write("new_esl/java", false);
			imports.add(imported.getClassName());
		}
	}

	private Exp processLet(Let let, ast.modules.Module module, List<Dec> decs, Env<String, Type> typeEnv) {
		Binding[] bindings = let.bindings;
		Dec[] letDecs = new Dec[bindings.length];
		AST body = let.exp;
		Env<String, Type> newTypeEnv = typeEnv;
		for (int i = 0; i < bindings.length; i++) {
			Binding b = bindings[i];
			newTypeEnv = newTypeEnv.bind(b.name, b.declaredType);
			Dec dec = new Dec(toJavaType(b.declaredType, typeEnv), b.name, processExp(b.getValue(), module, decs, newTypeEnv));
			decs = decs.cons(dec);
			letDecs[i] = dec;
		}
		return new ast.java.Let(letDecs, false, toJavaType(body.type(newTypeEnv), newTypeEnv), processExp(body, module, decs, newTypeEnv));
	}

	private Exp processLetrec(Letrec let, ast.modules.Module module, List<Dec> decs, Env<String, Type> typeEnv) {
		Binding[] bindings = let.bindings;
		Dec[] letDecs = new Dec[bindings.length];
		AST body = let.exp;
		Env<String, Type> newTypeEnv = typeEnv;
		for (int i = 0; i < bindings.length; i++) {
			Binding b = bindings[i];
			newTypeEnv = newTypeEnv.bind(b.name, b.declaredType);
			Dec dec = new RecDec(toJavaType(b.declaredType, typeEnv), b.name, null);
			decs = decs.cons(dec);
		}
		for (int i = 0; i < bindings.length; i++) {
			Binding b = bindings[i];
			Exp exp = processExp(b.getValue(), module, decs, newTypeEnv);
			Dec dec = find(b.getName(), decs);
			dec.exp = exp;
			letDecs[i] = dec;
		}
		return new ast.java.Let(letDecs, true, toJavaType(body.type(newTypeEnv), newTypeEnv), processExp(body, module, decs, newTypeEnv));
	}

	private Exp processListExp(ast.lists.List l, ast.modules.Module module, List<Dec> decs, Env<String, Type> typeEnv) {
		if (l.elements.length == 0)
			return ast.java.Nil.NIL;
		else {
			AST[] exps = l.elements;
			Type type = exps[0].type(typeEnv);
			Exp[] javaExps = new Exp[exps.length];
			for (int i = 0; i < exps.length; i++) {
				javaExps[i] = processExp(exps[i], module, decs, typeEnv);
			}
			return new ast.java.List(toJavaType(type, typeEnv), javaExps);
		}
	}

	private Exp processNew(New n, ast.modules.Module module, List<Dec> decs, Env<String, Type> typeEnv) {
		AST op = n.getOp();
		AST[] args = n.getArgs();
		Exp[] exps = new Exp[args.length];
		for (int i = 0; i < exps.length; i++) {
			exps[i] = processExp(args[i], module, decs, typeEnv);
		}
		return new ast.java.New(processExp(op, module, decs, typeEnv), exps);
	}

	private Exp processNewJava(NewJava exp, ast.modules.Module module, List<Dec> decs, Env<String, Type> typeEnv) {
		Exp[] exps = new Exp[exp.args.length];
		for (int i = 0; i < exps.length; i++) {
			exps[i] = processExp(exp.args[i], module, decs, typeEnv);
		}
		return new ast.java.NewJava(exp.className, toJavaType(exp.type, typeEnv), exps);
	}

	private Exp processNot(Not exp, ast.modules.Module module, List<Dec> decs, Env<String, Type> typeEnv) {
		return new ast.java.Not(processExp(exp.exp, module, decs, typeEnv));
	}

	private CaseArm processPApplyType(PApplyType p, Exp e, Stack<Exp> exps, Stack<Pattern> patterns, AST guard, AST body, ast.modules.Module module, List<Dec> decs,
	    Env<String, Type> typeEnv) {
		exps.push(e);
		patterns.push(p.pattern);
		return processArm(exps, patterns, guard, body, module, decs, typeEnv);
	}

	private Exp processPatternFor(Pattern p, For f, ast.modules.Module module, List<Dec> decs, Env<String, Type> typeEnv) {
		AST list = f.list;
		AST body = f.body;
		ast.types.List listType = (ast.types.List) list.type(typeEnv);
		ast.java.For[] jfor = new ast.java.For[1];
		String name = "forElement";
		Var var = new Var(0, 0, name, listType.type, null);
		BArm matchArm = new BArm(new Pattern[] { p }, new ast.data.Bool(true), new Block(0, 0, body, new Block(0, 0)), false);
		BArm elseArm = new BArm(new Pattern[] { new PVar("else_", listType.type) }, new ast.data.Bool(true), new Block(0, 0), false);
		Case case_ = new Case(0, 0, new ast.binding.Dec[0], new AST[] { var }, new BArm[] { matchArm, elseArm });
		Env<String, Type> newTypeEnv = typeEnv.bind("forElement", listType.type);
		p.type(newTypeEnv, (env, type) -> {
			List<Dec> newDecs = getDecs(env, typeEnv).append(decs).cons(new Dec(toJavaType(listType.type, typeEnv), "forElement", null));
			jfor[0] = new ast.java.For(name, p, processExp(list, module, newDecs, typeEnv), toJavaType(listType.type, env), processExp(case_, module, newDecs, env));
		});
		return jfor[0];
	}

	private CaseArm processPBagCons(PBagCons p, Exp e, Stack<Exp> exps, Stack<Pattern> patterns, AST guard, AST body, ast.modules.Module module, List<Dec> decs,
	    Env<String, Type> typeEnv) {
		throw new Error("PBagCons not implemented.");
	}

	private CaseArm processPCons(PCons pcons, Exp e, Stack<Exp> exps, Stack<Pattern> patterns, AST guard, AST body, ast.modules.Module module, List<Dec> decs,
	    Env<String, Type> typeEnv) {
		Env<String, Type>[] env = new Env[] { typeEnv };
		Pattern[] ps = new Pattern[] { pcons.head, pcons.tail };
		for (int i = ps.length - 1; i >= 0; i--) {
			Pattern p = ps[i];
			final int index = i;
			p.type(env[0], (env1, type) -> {
				env[0] = env1;
				patterns.push(ps[index]);
				exps.push(index == 0 ? new ConsHead(e, toJavaType(type, typeEnv)) : new ConsTail(e, toJavaType(type, typeEnv)));
			});
		}
		return new CaseCheckCons(pcons, e, toJavaType(body.type(env[0]), env[0]), processArm(exps, patterns, guard, body, module, decs, env[0]));
	}

	private CaseArm processPInt(PInt p, Exp e, Stack<Exp> exps, Stack<Pattern> patterns, AST guard, AST body, ast.modules.Module module, List<Dec> decs, Env<String, Type> typeEnv) {
		return new CaseCheckInt(p.value, e, toJavaType(body.type(typeEnv), typeEnv), processArm(exps, patterns, guard, body, module, decs, typeEnv));
	}

	private CaseArm processPNil(PNil p, Exp e, Stack<Exp> exps, Stack<Pattern> patterns, AST guard, AST body, ast.modules.Module module, List<Dec> decs, Env<String, Type> typeEnv) {
		return new CaseCheckNil(e, toJavaType(body.type(typeEnv), typeEnv), processArm(exps, patterns, guard, body, module, decs, typeEnv));
	}

	private CaseArm processPNull(PNull p, Exp e, Stack<Exp> exps, Stack<Pattern> patterns, AST guard, AST body, ast.modules.Module module, List<Dec> decs,
	    Env<String, Type> typeEnv) {
		return new CaseCheckNull(e, toJavaType(body.type(typeEnv), typeEnv), processArm(exps, patterns, guard, body, module, decs, typeEnv));

	}

	private Exp processPQual(PQual q, AST exp, Type type, ast.modules.Module module, List<Dec> decs, Env<String, Type> typeEnv) {
		return new PredList(processExp(q.exp, module, decs, typeEnv), processExp(exp, module, decs, typeEnv), toJavaType(type, typeEnv));
	}

	private Exp processProbably(Probably exp, ast.modules.Module module, List<Dec> decs, Env<String, Type> typeEnv) {
		return new ast.java.Probably(processExp(exp.exp, module, decs, typeEnv), processExp(exp.body, module, decs, typeEnv), processExp(exp.alt, module, decs, typeEnv));
	}

	private CaseArm processPTerm(PTerm term, Exp e, Stack<Exp> exps, Stack<Pattern> patterns, AST guard, AST body, ast.modules.Module module, List<Dec> decs,
	    Env<String, Type> typeEnv) {
		Env<String, Type>[] env = new Env[] { typeEnv };
		for (int i = term.patterns.length - 1; i >= 0; i--) {
			Pattern p = term.patterns[i];
			final int index = i;
			p.type(env[0], (env1, type) -> {
				env[0] = env1;
				patterns.push(term.patterns[index]);
				exps.push(new TermRef(e, toJavaType(type, typeEnv), index));
			});
		}
		return new CaseCheckTerm(term, e, toJavaType(body.type(env[0]), env[0]), processArm(exps, patterns, guard, body, module, decs, env[0]));
	}

	private CaseArm processPVar(PVar p, Exp e, Stack<Exp> exps, Stack<Pattern> patterns, AST guard, AST body, ast.modules.Module module, List<Dec> decs, Env<String, Type> typeEnv) {
		Type[] type = new Type[1];
		Env<String, Type>[] env = new Env[1];
		p.type(typeEnv, (env1, type1) -> {
			type[0] = type1;
			env[0] = env1;
		});
		ast.java.types.Type jtype = toJavaType(body.type(env[0]), env[0]);
		Dec dec = new Dec(jtype, p.getName(), null);
		return new CaseBind(p, toJavaType(type[0], env[0]), jtype, e, processArm(exps, patterns, guard, body, module, decs.cons(dec), env[0]));
	}

	private Exp processQual(Qualifier q, AST exp, Type type, ast.modules.Module module, List<Dec> decs, Env<String, Type> typeEnv) {
		if (q instanceof BQual)
			return processBQual((BQual) q, exp, type, module, decs, typeEnv);
		else
			return processPQual((PQual) q, exp, type, module, decs, typeEnv);
	}

	private Exp processSelf(Self self, ast.modules.Module module, List<Dec> decs, Env<String, Type> typeEnv) {
		Type type = typeEnv.lookup("self");
		String name = getActorName(type, typeEnv);
		if (name != null) {
			return new This(name);
		} else
			throw new Error("no self for " + type);
	}

	private Exp processSend(Send send, ast.modules.Module module, List<Dec> decs, Env<String, Type> typeEnv) {
		Exp target = processExp(send.target, module, decs, typeEnv);
		Exp arg = processExp(send.arg, module, decs, typeEnv);
		if (send.target instanceof Self)
			return new SendSelf(arg);
		else if (isSendEDB(send.target))
			return processSendEDB(arg);
		else
			return new ast.java.Send(target, arg);
	}

	private Exp processSendEDB(Exp arg) {
		return new ApplyBuiltin("sendEDB", new Exp[] { arg });
	}

	private boolean isSendEDB(AST target) {
		if (target instanceof Var) {
			Var var = (Var) target;
			return var.name.equals("edb");
		} else
			return false;
	}

	private Exp processSimpleFor(PVar p, ast.lists.For f, ast.modules.Module module, List<Dec> decs, Env<String, Type> typeEnv) {
		String name = p.getName();
		Type varType = p.getDeclaredType();
		AST list = f.list;
		AST body = f.body;
		Dec dec = new Dec(toJavaType(varType, typeEnv), name, null);
		return new SimpleFor(name, toJavaType(varType, typeEnv), processExp(list, module, decs, typeEnv), processExp(body, module, decs.cons(dec), typeEnv.bind(name, varType)));
	}

	private TimeHandler processSimpleTime(BArm bArm, ast.modules.Module module, List<Dec> decs, Env<String, Type> typeEnv) {
		PTerm term = (PTerm) bArm.patterns[0];
		PVar var = (PVar) term.getPatterns()[0];
		String name = var.getName();
		typeEnv = typeEnv.bind(name, ast.types.Int.INT);
		Dec dec = new Dec(ast.java.types.Type.INT, name, null);
		decs = decs.cons(dec);
		return new TimeHandler(name,
		    new If(processExp(bArm.guard, module, decs, typeEnv), processExp(bArm.exp, module, decs, typeEnv), new ast.java.Block(new Exp[0], ast.java.types.Type.OBJ)));
	}

	private Exp processTerm(ast.data.Term t, ast.modules.Module module, List<Dec> decs, Env<String, Type> typeEnv) {
		String name = t.getName();
		AST[] args = t.values;
		Exp[] exps = new Exp[args.length];
		for (int i = 0; i < args.length; i++) {
			exps[i] = processExp(args[i], module, decs, typeEnv);
		}
		return new ast.java.Term(name, exps);
	}

	private Exp processThrow(Throw exp, ast.modules.Module module, List<Dec> decs, Env<String, Type> typeEnv) {
		return new ast.java.Throw(processExp(exp.value, module, decs, typeEnv));
	}

	private TimeHandler processTime(BArm[] timeArms, ast.modules.Module module, List<Dec> decs, Env<String, Type> typeEnv) {
		// Turn into code that expects a variable n of time int...
		if (isEmptyTimeHandler(timeArms))
			return null;
		else if (isSimpleTimeBinding(timeArms))
			return processSimpleTime(timeArms[0], module, decs, typeEnv);
		else
			return processComplexTime(timeArms, module, decs, typeEnv);
	}

	private void processTypeBinding(TypeBind b, ast.modules.Module module, List<Dec> decs, Env<String, Type> typeEnv) {
		String name = b.getName();
		Type type = b.getDeclaredType();
		if (type instanceof ast.types.Act) {
			ast.types.Act act = (ast.types.Act) type;
			register(act, typeEnv);
		}
	}

	private Exp processUpdate(Update exp, ast.modules.Module module, List<Dec> decs, Env<String, Type> typeEnv) {
		String name = exp.name;
		AST value = exp.value;
		Dec dec = find(name, decs);
		if (dec != null) {
			dec.setModified(true);
		} else
			System.err.println("cannot find variable declaration: " + name);
		return new ast.java.Update(name, processExp(value, module, decs, typeEnv));
	}

	private Dec processValueBinding(Binding b, ast.modules.Module module, List<Dec> decs, Env<String, Type> typeEnv) {
		String name = b.getName();
		AST exp = b.getValue();
		Type type = exp.type(typeEnv);
		if (type instanceof Forall) {
			return processGenericValueBinding(name, (Forall) type, exp, module, decs, typeEnv);
		} else
			return processGroundValueBinding(name, toJavaType(b.getDeclaredType(), typeEnv), exp, module, decs, typeEnv);
	}

	private Exp processVar(Var var, ast.modules.Module module, List<Dec> decs, Env<String, Type> typeEnv) {
		Dec dec = find(var.getName(), decs);
		if (dec != null)
			return new ast.java.Var(var.getName(), dec);
		else {
			// Currently recursive definitions are not handled properly...
			return new ast.java.Var(var.getName(), null);
		}
	}

	private String register(ast.types.Act type, Env<String, Type> typeEnv) {
		for (int i = 0; i < behaviours.size(); i++) {
			if (Type.equals(type, behaviours.get(i).getType(), typeEnv)) return behaviours.get(i).getName();
		}
		int index = behaviours.size();
		ast.binding.Dec[] decs = type.getDecs();
		Dec[] jdecs = new Dec[decs.length];
		for (int i = 0; i < decs.length; i++) {
			jdecs[i] = new Dec(toJavaType(decs[i].getDeclaredType(), typeEnv), decs[i].getName(), null);
		}
		behaviours.add(new Behaviour("Actor" + index, jdecs, type));
		return "Actor" + index;
	}

	private Vector<BArm> remove(Vector<BArm> v1, BArm[] v2) {
		Vector<BArm> v = new Vector<BArm>();
		for (BArm b : v2) {
			if (!v1.contains(b)) v.add(b);
		}
		return v;
	}

	private BArm stripTime(BArm arm) {
		return new BArm(new Pattern[] { stripTime((PTerm) arm.getPatterns()[0]) }, arm.guard, arm.exp, false);
	}

	private BArm[] stripTime(BArm[] timeArms) {
		BArm[] arms = new BArm[timeArms.length];
		for (int i = 0; i < arms.length; i++) {
			arms[i] = stripTime(timeArms[i]);
		}
		return arms;
	}

	private Pattern stripTime(PTerm pTerm) {
		return pTerm.getPatterns()[0];
	}

	private ast.java.types.Type toJavaBag(Bag bag, Env<String, Type> typeEnv) {
		return new ast.java.types.Bag(toJavaType(bag.type, typeEnv));
	}

	private ast.java.types.Type toJavaForallType(Forall type, Env<String, Type> typeEnv) {
		return toJavaType(type.type, typeEnv);
	}

	private ast.java.types.Type toJavaFun(ast.types.Fun type, Env<String, Type> typeEnv) {
		int arity = type.getDomain().length;
		funs.add(arity);
		ast.java.types.Type[] domain = new ast.java.types.Type[type.getDomain().length];
		for (int i = 0; i < domain.length; i++) {
			domain[i] = toJavaType(type.getDomain()[i], typeEnv);
		}
		return new ast.java.types.Fun(domain, toJavaType(type.getRange(), typeEnv));
	}

	private ast.java.types.Type toJavaList(ast.types.List list, Env<String, Type> typeEnv) {
		Type type = list.getType();
		return new ast.java.types.List(toJavaType(type, typeEnv));
	}

	private ast.java.types.Type toJavaRecType(Rec type, Env<String, Type> typeEnv) {
		return toJavaType(type.type, typeEnv);
	}

	private ast.java.types.Type toJavaType(Type type, Env<String, Type> typeEnv) {
		if (Type.equals(type, Int.INT, typeEnv))
			return ast.java.types.Type.INT;
		else if (Type.equals(type, ast.types.Str.STR, typeEnv))
			return ast.java.types.Type.STR;
		else if (Type.equals(type, ast.types.Bool.BOOL, typeEnv))
			return ast.java.types.Type.BOOL;
		else if (type instanceof ast.types.Fun)
			return toJavaFun((ast.types.Fun) type, typeEnv);
		else if (type instanceof ast.types.List)
			return toJavaList((ast.types.List) type, typeEnv);
		else if (type instanceof Union)
			return ast.java.types.Type.TERM;
		else if (type instanceof ast.types.Var)
			return toJavaTypeVar((ast.types.Var) type, typeEnv);
		else if (type instanceof ast.types.Act)
			return ast.java.types.Type.ACTOR;
		else if (type instanceof ast.types.Void)
			return ast.java.types.Type.OBJ;
		else if (type instanceof Rec)
			return toJavaRecType((Rec) type, typeEnv);
		else if (type instanceof Forall)
			return toJavaForallType((Forall) type, typeEnv);
		else if (type instanceof Term)
			return ast.java.types.Type.TERM;
		else if (type instanceof ast.types.Float)
			return ast.java.types.Type.FLOAT;
		else if (type instanceof ast.types.Bag)
			return toJavaBag((ast.types.Bag) type, typeEnv);
		else if (type instanceof ast.types.Record)
			return toJavaRecord((ast.types.Record) type, typeEnv);
		else
			throw new Error("unknown type: " + type + ":" + type.getClass());
	}

	private ast.java.types.Type toJavaRecord(ast.types.Record record, Env<String, Type> typeEnv) {
		if (hasRecord(record, typeEnv))
			return getRecord(record, typeEnv);
		else {
			Record r = new Record(record);
			for (Field field : record.getFields()) {
				r.addField(field.getName(), toJavaType(field.getType(), typeEnv));
			}
			return r;
		}
	}

	private boolean hasRecord(ast.types.Record record, Env<String, Type> typeEnv) {
		return getRecord(record, typeEnv) != null;
	}

	private Record getRecord(ast.types.Record record, Env<String, Type> typeEnv) {
		for (Record r : records) {
			if (Type.equals(record, r.getRecord(), typeEnv)) return r;
		}
		return null;
	}

	private ast.java.types.Type toJavaTypeVar(ast.types.Var type, Env<String, Type> typeEnv) {
		if (type.getName().equals("$$Message$$"))
			return ast.java.types.Type.TERM;
		else if (typeEnv.binds(type.getName())) {
			Type t = ast.types.Type.eval(type, typeEnv);
			if (t instanceof ast.types.Var) {
				ast.types.Var v = (ast.types.Var) t;
				if (v.name.equals(type.name))
					return new ast.java.types.NamedType(v.name);
				else
					return toJavaType(ast.types.Type.eval(type, typeEnv), typeEnv);
			} else
				return toJavaType(t, typeEnv);
		} else
			return ast.java.types.Type.OBJ;
	}

	public void write(String path, boolean isMain) {
		try {
			PrintWriter out = new PrintWriter(new FileOutputStream(path + "/" + getFileName()));
			write(out, isMain);
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void write(PrintWriter out, boolean isMain) {
		out.println("package esl;");
		out.println("import runtime.data.Term;");
		out.println("import static esl.Library.*;");
		for (String i : imports) {
			out.println("import static esl." + i + ".*;");
		}
		out.println("import list.*;");
		out.println("public class " + getClassName() + " {");
		writeFail(out);
		writeFuns(out);
		writeRecords(out);
		writeDecs(out);
		if (isMain) writeMain(out);
		out.println("}");
		out.close();
	}

	public String getString() {
		StringWriter out = new StringWriter();
		write(new PrintWriter(out), true);
		return out.getBuffer().toString();
	}

	private void writeRecords(PrintWriter out) {
		for (Record record : records) {
			record.writeDef(out);
		}
	}

	private void writeBehaviours(PrintWriter out) {
		for (Behaviour b : behaviours) {
			b.write(out);
		}
	}

	private void writeDecs(PrintWriter out) {
		for (Dec dec : declarations) {
			dec.writeTopLevel(out, exports.contains(dec.getName()));
		}
	}

	private void writeFail(PrintWriter out) {
		out.println("public interface Fail<T> { public T fail(); }");
	}

	private void writeFun(int i, PrintWriter out) {
		out.println("interface Fun" + i + "<T");
		for (int j = 0; j < i; j++) {
			out.print(",T" + j);
		}
		out.println("> {");
		out.println("T apply(");
		for (int j = 0; j < i; j++) {
			out.print("T" + j + " x" + j);
			if (j < i - 1) out.print(",");
		}
		out.println("); }");
	}

	private void writeFuns(PrintWriter out) {
		for (int i : funs) {
			if (i > 1) writeFun(i, out);
		}
	}

	private void writeMain(PrintWriter out) {
		out.println("public static void main(String[] args) {");
		out.println("  new " + getClassName() + "().main.apply();");
		out.println("}");
	}

}
