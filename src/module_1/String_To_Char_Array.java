package module_1;

import java.util.Scanner;

public class String_To_Char_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter String to convert to char array");
String st=sc.next();
char ch[]=st.toCharArray();
//System.out.println(ch);
		 for (char d:ch) { System.out.println(d); }
			
	}

}
