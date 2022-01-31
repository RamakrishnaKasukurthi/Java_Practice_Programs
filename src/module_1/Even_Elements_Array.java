package module_1;

import java.util.Arrays;
import java.util.Scanner;

public class Even_Elements_Array {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the Array: ");
		int size=sc.nextInt();
		int array[]=new int[size];
		System.out.println("Enter the values into Array: ");
		for (int i = 0; i < size; i++) {
			array[i]=sc.nextInt();
		}
		System.out.println("Stored values in Array: "+Arrays.toString(array));
		
		System.out.println("Even elements are: ");
		for (int i = 1; i < size; i+=2) {
			System.out.print(array[i]+", ");
			
		}
	}

}
