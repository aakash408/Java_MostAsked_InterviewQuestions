package interviewmost_ask_queations;

import java.util.Scanner;

public class Find_Odd_Even_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int number = sc.nextInt();
		if(number  / 2 == 0) {
			System.out.println(number + " is even");
		}else {
			System.out.println(number + " is odd");
		}

	}

}
