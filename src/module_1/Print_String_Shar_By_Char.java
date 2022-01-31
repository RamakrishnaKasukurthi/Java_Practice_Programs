package module_1;

import java.util.Scanner;

public class Print_String_Shar_By_Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc=new Scanner(System.in);
System.out.println("Enter Sting: ");
String st=sc.next();

int ln=st.length();
for (int i = 0; i <ln; i++) {
	System.out.println(st.charAt(i));
}
		
	}

}
