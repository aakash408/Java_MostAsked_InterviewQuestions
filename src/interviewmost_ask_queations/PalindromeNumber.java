package interviewmost_ask_queations;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// Java program to find Palindrome number

		Scanner scr = new Scanner(System.in);
		System.out.println("Enter thw number : ");
		int number = scr.nextInt();

		if (isPalindrom(number)) {
			System.out.println(number + " is a Palindrome Number");
		} else {
			System.err.println(number + " is not a Palindrome Number");
		}
	}

	public static boolean isPalindrom(int num) {
		int orinum = num;
		int revnum = 0;

		while (num != 0) {
			int digit = num % 10;
			revnum = revnum * 10 + digit;
			num = num / 10;
		}

		return orinum == revnum;

	}
}
