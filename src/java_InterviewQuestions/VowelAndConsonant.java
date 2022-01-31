package java_InterviewQuestions;

import java.util.Scanner;

public class VowelAndConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Char: ");
		char ch=sc.next().charAt(0);
		
		if (ch== 'a' || ch== 'e' || ch== 'i' || ch== 'o' || ch== 'u') {
			System.out.println("Entered Char is vowel");
			
		}else {
			System.out.println("Entered Char is Consonant");
		}

		//2nd methode.
		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("Entered Char is vowel");
			break;
			default:
				System.out.println("Entered Char is Consonant");
		}
		
	}

}
