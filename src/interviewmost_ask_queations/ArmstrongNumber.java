package interviewmost_ask_queations;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// Java program to find Armstrong

		int arm = 0, a, b, c, d, no;

		Scanner scr = new Scanner(System.in);
		System.err.println("Entet the number : ");

		no = scr.nextInt();

		d = no;

		while (no > 0) {
			a = no % 10;
			no = no / 10;
			arm = arm + a * a * a;
		}
		if (arm == d) {
			System.out.println("Armstrong number ");
		} else {
			System.out.println("Not Armstrong number ");
		}
	}

}
