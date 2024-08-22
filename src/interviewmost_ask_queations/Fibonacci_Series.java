package interviewmost_ask_queations;

import java.io.InputStream;
import java.util.Scanner;

public class Fibonacci_Series {

	public static void main(String[] args) {
		// Find Fibonacci series upto a given number range

		Scanner scr = Scanner(System.in);
		System.out.println("Enter a Number : ");

		int number = 6;
		int first = 0, second = 1, next;

		System.out.println("Fibonacci series is : ");

		for (int i = 0; i <= number; i++) {

			System.out.println(first + "");
			next = second + first;
			first = second;
			second = next;
		}

	}

	private static Scanner Scanner(InputStream in) {
		// TODO Auto-generated method stub
		return null;
	}

}
