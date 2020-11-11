package com.hackerrank.exercise.calculate_sum;

import java.util.Scanner;

public class CalculateSum {
	
	/**
	 * This function implements the function of the Functional Interface Addition to add two numbers
	 * The result of this implementation is returned
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	private static int sumByImplementingFunctionalInterface(int a, int b) {
		Addition add = (x, y) -> x + y;
		return add.addition(a, b);
	};
	
	private static Addition lambdaReferenceForFunctionalInterface = (a, b) -> { return a + b; };
	
	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)) {
			System.out.println("Please enter the first integer: ");
			int firstNumber = scanner.nextInt();
			System.out.println("Please enter the second integer: ");
			int secondNumber = scanner.nextInt();
			
			System.out.println(String.format("The sum of %d and %d is %d", 
					firstNumber, secondNumber, sumByImplementingFunctionalInterface(firstNumber, secondNumber)));
			
			System.out.println(String.format("The sum of %d and %d is %d", 
					firstNumber, secondNumber, lambdaReferenceForFunctionalInterface.addition(firstNumber, secondNumber)));
		}
	}
	
}
