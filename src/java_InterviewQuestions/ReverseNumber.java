package java_InterviewQuestions;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter I/P: ");
		int num=sc.nextInt();
		
		int rev=0;
		while (num!=0) {
			int n=num%10;
			rev=rev*10+n;
			num=num/10;
		}
		System.out.println(rev);
	}

}
