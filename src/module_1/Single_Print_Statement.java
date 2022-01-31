package module_1;

import java.util.Arrays;
import java.util.Scanner;

public class Single_Print_Statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers to print in singlie line: ");
		int[] a = new int[5];

		for (int i = 0; i < 5; i++) {
			a[i] = sc.nextInt();
		}

		//System.out.println("Entered values: " + Arrays.toString(a));

		System.out.println(a[0]+"\n"+a[1]+"\n"+a[2]+"\n"+a[3]+"\n"+a[4]+"\n");
		
	}

}
