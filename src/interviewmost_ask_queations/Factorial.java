package interviewmost_ask_queations;

import java.io.InputStream;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// Find Factorial on given Number

		int fac = 1;

		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = 5;
		fac=scr.nextInt();

		for (int i = 1; i <= num; i++) {
			fac = fac * i;
		}

		System.out.println("Factorial number is : " + fac);

	}

}
