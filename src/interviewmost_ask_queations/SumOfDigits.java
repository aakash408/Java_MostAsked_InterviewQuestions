package interviewmost_ask_queations;

import java.security.PublicKey;

public class SumOfDigits {

	public static void main(String[] args) {
		// Java program to calculate the sum of digits of a number

		int number = 12345;

		int sumofdigit = calculatesumogdigit(number);

		System.out.println("Sum of digits of : " + number + " : is " + sumofdigit);

	}

	public static int calculatesumogdigit(int number) {

		int sum = 0;
		while (number > 0) {
			int digit = number % 10; // Extract the last digit
			sum = sum + digit; // Add the digit to sum
			number = number / 10; // Remove last digit from Number

		}
		return number;
	}

}
