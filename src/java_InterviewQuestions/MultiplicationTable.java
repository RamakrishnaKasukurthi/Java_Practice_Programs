package java_InterviewQuestions;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2*1=2
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter I/p for Table: ");
int x=sc.nextInt();
for (int i = 1; i <=10; i++) {
	
	System.out.println(x+"*"+i+"="+x*i);
	
}
	}

}
