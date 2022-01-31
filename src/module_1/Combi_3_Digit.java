package module_1;

import java.util.Scanner;

public class Combi_3_Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  int [] input= {1,4,3,5}; for (int i = 0; i < input.length; i++) { for (int j
		  = 0; j < input.length; j++) { for (int z = 0; z < input.length; z++) { if
		  (i!=j&&j!=z&&z!=i) { System.out.println(input[i]+" "+input[j]+" "+input[z]);
		  } } }
		  
		  }
		 
		/*
		 * Scanner sc=new Scanner(System.in);
		 * System.out.println("Enter Length of Array: "); int length=sc.nextInt(); int
		 * [] input=new int[length]; System.out.println("Enter List to Array: "); for
		 * (int i = 0; i <length; i++) {
		 * 
		 * input[i]=sc.nextInt();
		 * 
		 * } for (int i : input) { System.out.print(i); }
		 */
	}

}
