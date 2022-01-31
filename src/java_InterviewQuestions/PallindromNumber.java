package java_InterviewQuestions;

import java.util.Scanner;

public class PallindromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Num: ");
		int num=sc.nextInt();
		int rev=0;
		int org=num;
		while (num!=0) {
			int n=num%10;
			rev=rev*10+n;
			num=num/10;
			
		}
System.out.println("Revers num: "+rev);
if (org==rev) {
	System.out.println("It's a Pallindrom");
}else System.out.println("It's NOT a Pallindrom");
	}

}
