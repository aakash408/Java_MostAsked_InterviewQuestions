package interviewmost_ask_queations;

import java.io.InputStream;
import java.util.Scanner;

public class SwapTwoNmbers {

	public static void main(String[] args) {
		// swap two numbers without using third variable

		Scanner scr = Scanner(System.in);
		System.out.println("Enter the first number : ");
		int a = 5;
		System.out.println("Enter the second number : ");
		int b = 10;

		System.out.println("Before swapping : a = " + a + ", b = " + b);

		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swapping : a = " + a + ", b = " + b);
	}

	private static Scanner Scanner(InputStream in) {
		// TODO Auto-generated method stub
		return null;
	}

}
