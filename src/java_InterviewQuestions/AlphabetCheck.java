package java_InterviewQuestions;

import java.util.Scanner;

public class AlphabetCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		System.out.println("Input: ");
		char c=sc.next().charAt(0);
		
		if ((c>='a'&& c<='z')||(c>='A'&&c<='Z')) {
			System.out.println("Given input is Alphabet");
			}else System.out.println("Given input is Not Alphabet");
	}

}
