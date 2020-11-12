package com.hackerrank.exercise.stdin_stdout;

import java.util.Scanner;
import static java.lang.System.out;

public class StandardInputStandardOutput {
	
	private static int userIntergerInput;
	private static double userDoubleInput;
	private static String userStringInput;
	
	
	private static void userInput(Scanner scanner) {
		Test.UserInput userInputImpl = (inputScanner) -> {
			userIntergerInput = inputScanner.nextInt();
			userDoubleInput = inputScanner.nextDouble();
			inputScanner.nextLine();
			userStringInput = inputScanner.nextLine();
		};
		
		userInputImpl.userInput(scanner);
	}
	
	private static void userOutput() {
		Test.Output outputImpl = () -> {
			out.println(String.format("String: %s\nDouble: %s\nInt: %d", userStringInput, Double.valueOf(userDoubleInput).toString(), userIntergerInput));
		};
		
		outputImpl.output();
	}

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			userInput(scanner);
			userOutput();
		}
	}

}
