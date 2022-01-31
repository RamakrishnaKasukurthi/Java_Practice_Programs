package java_InterviewQuestions;

import java.util.Scanner;

public class FactorialRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Num: ");
		int num=sc.nextInt();
		System.out.println(fact(num));

	}
	public static int fact(int num) {
		if (num>=1) {
			return num*fact(num-1);
			
		}else return 1;
	}

}
