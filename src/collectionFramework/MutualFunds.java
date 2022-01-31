package collectionFramework;

import java.util.Scanner;

public class MutualFunds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Amount per Month: ");
		int amt=sc.nextInt();
		System.out.println("Enter no. of yeras: ");
		int yeras=sc.nextInt();
		System.out.println("Enter interest rate: ");
		double per=sc.nextDouble();
		
		int months=12*yeras;
		
		int princeAmount=amt*months;
		System.out.println("Principal Amount: "+princeAmount);
		
		double interestAmount=(per/100)*princeAmount;
		System.out.println("Interest Amount: "+interestAmount);
		
		double FAmount=princeAmount+interestAmount;
		System.out.println("Final amount is: "+FAmount);

	}

}
