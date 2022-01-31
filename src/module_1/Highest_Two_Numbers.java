package module_1;

import java.util.Scanner;

public class Highest_Two_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		/*
		 * System.out.println("Value of X:" + x); System.out.println("Value of Y: " +
		 * y);
		 */
		// Type-1
		System.out.println("Max value is: " + Math.max(x, y));

		// Type-2
		if (x > y) {
			System.out.println("Max value is: " + x);
		} else {
			System.out.println("Max value is: " + y);
		}
		// Type-3
		int a = (x > y) ? x : y;
		System.out.println("Max value is: " + a);
	}

}
