package ast.query;

import ast.query.value.Value;

public class QueryError extends Error {
	
	Value value;

	public QueryError(Value value) {
		super();
		this.value = value;
	}

	public Value getValue() {
		return value;
	}

}
