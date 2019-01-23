package edb.editor.esl;

public class ESLWarning {
	
	int start;
	int length;
	String message;
	
	public ESLWarning(int start, int length, String message) {
		super();
		this.start = start;
		this.length = length;
		this.message = message;
	}

	public int getStart() {
		return start;
	}

	public int getLength() {
		return length;
	}

	public String getMessage() {
		return message;
	}

}
