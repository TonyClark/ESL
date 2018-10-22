package esl.lib;

abstract class Named {

	ESLVal name;

	public Named(ESLVal name) {
		this.name = name;
	}
	
	public ESLVal getName() {
		return name;
	}

}