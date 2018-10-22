package esl.lib;

import java.util.Arrays;

public abstract class Function extends Named {
	
	public ESLVal self;

	public Function(ESLVal name,ESLVal self) {
		super(name);
		this.self = self;
	}

	public abstract ESLVal apply(ESLVal... args);

	public ESLVal getSelf() {
		return self;
	}

	public void setSelf(ESLVal self) {
		this.self = self;
	}

}