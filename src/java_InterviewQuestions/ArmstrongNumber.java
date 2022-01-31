package java_InterviewQuestions;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter input: ");
	int input=sc.nextInt();
	
	int result=0;
	int org=input;
	
	while (input>0) {
		int a=input%10;
		input=input/10;
		result=result+(a*a*a);
			}
	if (org==result) {
		System.out.println("Input is Armstrong Num");
	}else System.out.println("Input is NOT a Armstrong Num");
	}

}
