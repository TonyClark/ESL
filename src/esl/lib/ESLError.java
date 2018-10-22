package esl.lib;

public class ESLError extends Error {
	
	public ESLVal value;

	public ESLError(ESLVal value) {
		super(value.toString());
		this.value = value;
	}

}
