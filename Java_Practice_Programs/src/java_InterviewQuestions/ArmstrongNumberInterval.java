package java_InterviewQuestions;

import java.util.Scanner;

public class ArmstrongNumberInterval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Needs to work
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Start Num: ");
int start=sc.nextInt();
System.out.println("Enter End Num: ");
int end=sc.nextInt();
int result=0;
int tem=start;
while (start<end) {
	while (tem>0) {
		int a=tem%10;
		tem=tem/10;
		 result=result+(a*a*a);
	}
		 System.out.println(result);
	
}
++start;
	}

}
