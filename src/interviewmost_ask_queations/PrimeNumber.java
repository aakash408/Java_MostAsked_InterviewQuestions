package interviewmost_ask_queations;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		// Java program to find Prime number

		Scanner scr = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number = scr.nextInt();

		if (isPrime(number)) {
			System.out.println(number + " is a Prime Number");
		} else {
			System.out.println(number + " is not a Prime number");
		}

	}

	public static boolean isPrime(int num) {
		for (int i = 2; i <= num; i++) {
			if (num / i == 0) {
				return false;
			}
		}
		return true;
	}

}
