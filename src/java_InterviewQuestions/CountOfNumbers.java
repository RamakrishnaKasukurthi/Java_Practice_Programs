package java_InterviewQuestions;

import java.util.Scanner;

public class CountOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		long num=sc.nextInt();
		int count=0;
		while (num !=0) {
			num=num/10;
			++count;
			
		}
System.out.println(count);
	}

}
