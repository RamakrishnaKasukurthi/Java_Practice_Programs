package java_InterviewQuestions;

import java.util.Scanner;

public class PowerConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Base: ");
		int base=sc.nextInt();
		System.out.println("enter Power: ");
		int power=sc.nextInt();
		System.out.println("-----Second Methode----");


		System.out.println(Math.pow(base, power));
		
		long ouput=1;
		while (power !=0) {
			ouput=base*ouput;
			--power;
			
		}
System.out.println("The output is: "+ouput);

int base1=2;
int power1=4;
long output1=1;
for (int i = 0; i < power1; i++) {
	output1=output1*base1;
	
}
System.out.println(output1);
	}

}
