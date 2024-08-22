package interviewmost_ask_queations;

import java.io.InputStream;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// Find Factorial on given Number

		int fac = 1;

		Scanner scr = Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = 5;

		for (int i = 1; i <= num; i++) {
			fac = fac * i;
		}

		System.out.println("Factorial number is : " + fac);

	}

	private static Scanner Scanner(InputStream in) {
		// TODO Auto-generated method stub
		return null;
	}

}
// wrong out put need to check 