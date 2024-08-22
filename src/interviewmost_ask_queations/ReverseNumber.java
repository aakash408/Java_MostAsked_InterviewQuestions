package interviewmost_ask_queations;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		//  Reverse Number
		
		int no , rev =0,r,a;
		
		Scanner scr = new Scanner(System.in); 
		System.out.println("Enter a number :");
		
		no =scr.nextInt();
		a =no;
		while(no>0) {
			r=no/10;
			rev=rev*10+r;
			no=no/10;
		}
		System.out.println("Reverse Number :" +rev);

	}

}
