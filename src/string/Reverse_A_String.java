package string;

import java.util.Scanner;

public class Reverse_A_String {

	//Java program to reverse a string
	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		System.err.println("Enter the Number :");
		String in = scr.next();
		char c;
		String s = "";
		for (int i = 0; i < in.length(); i++) {
			c=in.charAt(i);
			s=c+s;
		}
		System.out.println("Reverse String is : " + s);
	}
}
