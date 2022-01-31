package java_InterviewQuestions;

import java.util.Scanner;

public class LargestAmongThreeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st Num: ");
		int x=sc.nextInt();
		System.out.println("Enter 2nd Num: ");
		int y=sc.nextInt();
		System.out.println("Enter 3rd Num: ");
		int z=sc.nextInt();
		
		if (x>y&&x>z) {
			System.out.println("1st Num is greatest: "+x);
					}else if (y>z) {
						System.out.println("2nd Num is greatest: "+y);
					}else {
						System.out.println("3rd Num is greatest: "+z);
					}
	}

}
