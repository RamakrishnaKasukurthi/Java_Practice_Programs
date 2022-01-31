package java_InterviewQuestions;

import java.util.Scanner;

public class PositiveORNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Num: ");
		Double num=sc.nextDouble();
		
		if (num>=0.0) {
			System.out.println("Entered Num is Positive");
		}else {
			System.out.println("Entered Num is Negative");
		}
		
	}

}	
