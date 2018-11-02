package ast.types;

import java.util.HashSet;

import ast.binding.Dec;
import env.Env;
import exp.BoaConstructor;

@BoaConstructor(fields = { "parent", "decs", "handlers" })
public class ExtendedAct extends Type {

	public Type						parent;
	public Dec[]					decs;
	public MessageType[]	handlers;

	public ExtendedAct() {
	}

	@Override
	public void check(Env<String, Type> env) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void FV(HashSet<String> vars) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Type substType(Type type, String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
