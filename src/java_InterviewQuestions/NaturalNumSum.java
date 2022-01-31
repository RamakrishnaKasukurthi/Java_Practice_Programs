package java_InterviewQuestions;

import java.util.Scanner;

public class NaturalNumSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Input: ");
		int ip=sc.nextInt();
		
		for (int i = 1; i <=ip; i++) {
			sum=sum+i;
			
		}
		System.out.println("The sum of Input is: "+sum);
		int k=1;
		int sum1=0;
		while (k<=ip) {
			sum1=sum1+k;
			k++;
			
		}
		System.out.println("The sum of Input is: "+sum1);
	}

}
