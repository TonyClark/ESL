package esl.lib;

import java.io.Serializable;

public interface LetRec extends Serializable {
	public ESLVal get(String name);
}