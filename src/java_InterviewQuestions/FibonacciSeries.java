package java_InterviewQuestions;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Num: ");
		int num=sc.nextInt();
		int t1=0, t2=1;
		
		for (int i = 1; i <=num; i++) {
			System.out.println(t1);
			int sum=t1+t2;
			t1=t2;
			t2=sum;
		}

	}

}
