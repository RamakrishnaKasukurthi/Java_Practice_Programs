package module_1;

import java.util.Scanner;

public class Pyramid_Patterns {

	public void type1() {

		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of row");
		n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.print("*");

			}
			System.out.println();
		}

	}

	public void type2() {
		int i, j,n; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of row");
		n = sc.nextInt();

		  
        // outer loop to handle number of rows 
        //  n in this case 
        for(i=0; i<n; i++) 
        { 
  
            // inner loop to handle number spaces 
            // values changing acc. to requirement 
            for(j=(n-i); j>=0; j--) 
            { 
                // printing spaces 
                System.out.print(" "); 
            } 
             
            //  inner loop to handle number of columns 
            //  values changing acc. to outer loop 
            for(j=0; j<=i; j++) 
            { 
                // printing stars 
                System.out.print("* "); 
            } 
              
            // ending line after each row 
            System.out.println(); 
        } 
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pyramid_Patterns pp = new Pyramid_Patterns();
		//pp.type1();
pp.type2();
	}

}
