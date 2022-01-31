package module_1;

import java.util.Scanner;

public class Arithmetic_Operations {

	int a, b, c;

	// java.util.Scanner sc=new java.util.Scanner(System.in);
	public void addition() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to add");
		a = sc.nextInt();
		System.out.println("Enter number to add");
		b = sc.nextInt();
		System.out.println("Sum of two numbers: " + (a + b));

	}

	public void subtraction() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to subtract");
		a = sc.nextInt();
		System.out.println("Enter number to subtract");
		b = sc.nextInt();
		System.out.println("subtract of two numbers: " + (a - b));

	}

	public void multiplication() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to multiplication");
		a = sc.nextInt();
		System.out.println("Enter number to multiplication");
		b = sc.nextInt();
		System.out.println("multiplication of two numbers: " + (a * b));

	}

	public void division() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to division");
		a = sc.nextInt();
		System.out.println("Enter number to division");
		b = sc.nextInt();
		System.out.println("division of two numbers: " + (a / b));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = 0;
		Arithmetic_Operations ao = new Arithmetic_Operations();
		System.out.println("Plase enter valid no. for below operations");
		System.out.println("1.addition, 2.subtraction, 3.multiplication, 4.division");
		Scanner sc = new Scanner(System.in);
		c = sc.nextInt();

		switch (c) {
		case 1:
			ao.addition();
			break;
		case 2:
			ao.subtraction();
			break;
		case 3:
			ao.multiplication();
			break;
		case 4:
			ao.division();
			break;

		default:
			throw new IllegalArgumentException("Unexpected value: " + c);

		}

	}

}
