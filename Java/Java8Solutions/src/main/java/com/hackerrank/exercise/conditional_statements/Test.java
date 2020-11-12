package com.hackerrank.exercise.conditional_statements;

public interface Test {
	
	@FunctionalInterface
	static interface TestBoolean {
		boolean isOdd(int testNumber);
	}
	
	@FunctionalInterface
	static interface ValidateResult {
		String resultString(int validationInput);
	}
	
}
