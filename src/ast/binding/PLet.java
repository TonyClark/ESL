package ast.binding;

import java.util.Arrays;
import java.util.HashSet;

import ast.binding.declarations.DecContainer;
import ast.binding.declarations.DeclaringLocation;
import ast.general.AST;
import ast.types.Type;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import exp.BoaConstructor;
import instrs.data.Pop;
import instrs.vars.NewDynamic;
import instrs.vars.PopDynamic;
import instrs.vars.SetFrame;
import list.List;
import runtime.functions.CodeBox;

@BoaConstructor(fields = { "bindings", "exp" })

public class PLet extends AST implements DecContainer {

  public Binding[] bindings;
  public AST       exp;

  public PLet() {
  }

  public PLet(int lineStart, int lineEnd, Binding[] bindings, AST exp) {
    super(lineStart, lineEnd);
    this.bindings = bindings;
    this.exp = exp;
  }

  public String toString() {
    return "PLet(" + Arrays.toString(bindings) + "," + exp + ")";
  }

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return null;
	}

  public DeclaringLocation[] getContainedDecs() {
    return bindings;
  }

	@Override
	public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DV(HashSet<String> vars) {
		// TODO Auto-generated method stub
	}

	@Override
	public void FV(HashSet<String> vars) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int maxLocals() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setPath(String path) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public AST subst(AST ast, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Type type(Env<String, Type> env) {
		// TODO Auto-generated method stub
		return null;
	}

}
