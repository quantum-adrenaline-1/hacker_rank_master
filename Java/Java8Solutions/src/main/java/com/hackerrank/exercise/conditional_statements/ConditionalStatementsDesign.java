package com.hackerrank.exercise.conditional_statements;

import static java.lang.System.out;

import java.util.Scanner;


/**
 * This class involves if-else statement implementation with efficient construction of if-else ladder based on the conditions in the question
 * 
 * @author yogiraj
 *
 */
public class ConditionalStatementsDesign {

	private static boolean isOdd(int currentTestNumber) {
		Test.TestBoolean isOddImpl = (testNumber) -> testNumber % 2 != 0;
		
		return isOddImpl.isOdd(currentTestNumber);
	}
	
	private static String validateResult(int validationInput) {
		Test.ValidateResult resultStringImpl = (testInput) -> {
			String resultString = null;
			if (!isOdd(testInput)) {
				if (testInput > 20)
					resultString = "Not Weird";
				if (testInput >= 6 && testInput <= 20)
					resultString = "Weird";
				if (testInput >= 2 && testInput <= 5)
					resultString = "Not Weird";
			} else {
				resultString = "Weird";
			}
			return resultString;
		};
		
		return resultStringImpl.resultString(validationInput);
	}
	
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			out.print("Enter a number: ");
			int userInput = scanner.nextInt();
			out.println("The result is: \n\n");
			out.println(validateResult(userInput));
		}
	}
	
}
