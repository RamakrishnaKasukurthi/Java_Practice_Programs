package java_InterviewQuestions;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Year: ");
		int Year=sc.nextInt();
		
		if (Year%4==0) {
			if (Year%100==0) {
				if (Year%400==0) {
					System.out.println("The Entered Year is a Leap");
				}else System.out.println("The Entered Year is Not a Leap");
			}else System.out.println("The Entered Year is a Leap");
		}else System.out.println("The Entered Year is Not a Leap");
		
	}

}
