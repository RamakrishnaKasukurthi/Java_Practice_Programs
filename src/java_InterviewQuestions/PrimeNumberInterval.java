package java_InterviewQuestions;

import java.util.Scanner;

public class PrimeNumberInterval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Start Num: ");
		int start=sc.nextInt();
		System.out.println("Enter End Num: ");
		int end=sc.nextInt();
		while (start<end) {
			boolean flag=false;
			for (int i = 2; i < start/2; i++) {
				if (start%i==0) {
					flag =true;
					break;
				}
			}
		if (!flag) {
			System.out.println(start);
		}
		++start;
	}	
	}
		
			
		
	
	}


