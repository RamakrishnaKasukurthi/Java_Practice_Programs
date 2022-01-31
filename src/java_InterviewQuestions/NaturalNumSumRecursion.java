package java_InterviewQuestions;

import java.util.Scanner;

public class NaturalNumSumRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Num: ");
		int num=sc.nextInt();
		System.out.println(addNum(num));

	}
public static int addNum(int num) {
	if (num!=0) {
		return num+addNum(num-1);
	}
	else {
		return num;
	}
}
}
