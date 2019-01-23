package ast.binding;

public class BindingsOrDecs {

	Binding[]	bindings;
	Dec[]			decs;

	public BindingsOrDecs(Binding[] bindings, Dec[] decs) {
		super();
		this.bindings = bindings;
		this.decs = decs;
	}

	public Binding[] getBindings() {
		return bindings;
	}

	public Dec[] getDecs() {
		return decs;
	}

}
