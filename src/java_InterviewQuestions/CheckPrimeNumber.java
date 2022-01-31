package java_InterviewQuestions;

import java.util.Scanner;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Num to Check prime: ");
int num=sc.nextInt();
boolean flag=false;
for (int i = 2; i <= num/2; i++) {
	if (checkPrime(i)) {
		if (checkPrime(num-i)) {
			System.out.println(num+"="+i+"+"+(num-i));
			flag=true;
		}
		
	}
}
if (!flag) {
	System.out.println("can not be expressed as the sum of prime");
	
}

	}
	public static boolean checkPrime(int num) {
		boolean isPrime=true;
		for (int i = 2; i < num/2; i++) {
			if (num%i==0) {
				isPrime=false;
				break;
			}
		}
		return isPrime;

		
	}
}
