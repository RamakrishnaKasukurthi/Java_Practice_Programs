package java_InterviewQuestions;

import java.util.Scanner;

public class FactorialNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num for Factorial: ");
		int Num = sc.nextInt();
		double fact=1;
		for (int i = 1; i <=Num; i++) {
			fact=fact*i;
		}
System.out.println("The O/P is: "+fact);
	}

}
