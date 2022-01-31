package java_InterviewQuestions;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Num: ");
		int num=sc.nextInt();
		if (num % 2==0) {
			System.out.println("It's Even");
		
		}else {
			System.out.println("It's Odd");
		}
		
	}

}
