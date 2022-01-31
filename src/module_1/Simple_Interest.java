package module_1;

import java.util.Scanner;

public class Simple_Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principal amount: ");
		double p = sc.nextDouble();
		System.out.println("Entere rate of Interest: ");
		double i = sc.nextDouble();
		System.out.println("Entere time in months: ");
		double t = sc.nextDouble();

		System.out.println("Simple Interest is: " + (p * i * t) / 100);
	}

}
