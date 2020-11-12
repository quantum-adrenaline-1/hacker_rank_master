package com.hackerrank.exercise.stdin_stdout;

import java.util.Scanner;

public interface Test {
	
	@FunctionalInterface
	static interface UserInput {
		void userInput(Scanner scanner);
	}
	
	@FunctionalInterface
	static interface Output {
		void output();
	}

}
