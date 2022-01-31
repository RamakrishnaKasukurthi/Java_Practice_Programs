package java_InterviewQuestions;

import java.util.Scanner;

public class ArmstrongNumberInterval {

	static Scanner sc = new Scanner(System.in);
	
	public int checkArmstrong(int input) {
		
		int result = 0;
		int tem = input;
		while (tem > 0) {
				int a = tem % 10;
				tem = tem / 10;
		result = result + (a * a * a);
		//return result;
			}
		return result;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Needs to work
		
		
		for (int i = 1; i < 10000000; i++) {
			
		ArmstrongNumberInterval aNI=new ArmstrongNumberInterval();
		int result=aNI.checkArmstrong(i);
		
		if (i==result) {
			System.out.println(i);
		}
		//else System.out.println("Input is NOT a Armstrong Num");
		
		
		}
		/*
		 * System.out.println("Enter Start Num: "); int start = sc.nextInt();
		 * System.out.println("Enter End Num: "); int end = sc.nextInt(); int result =
		 * 0; int tem = start; while (start < end) { while (tem > 0) { int a = tem % 10;
		 * tem = tem / 10; result = result + (a * a * a); } System.out.println(result);
		 * 
		 * } ++start;
		 */	}

}
