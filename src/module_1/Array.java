package module_1;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Single Array
		//disadvantages:
		//1. size is fixed.--to over come this: use collections, arrayList, hasTable, dynamic array.
		//2. store only similar data types --to over come this: use object array
		
		int i[]=new int[10];
		//i[0]=10;
		for (int j = 0; j < 10; j++) {
			i[j]=j;
		}
		System.out.println(i);
		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
		}
	System.out.println(i.length);
	
	// Object Array (Object is class)--used for diff types of elements

	Object ob[]=new Object[5];
	ob[0]='a';
	ob[1]="Rama";
	ob[2]=10;
	ob[3]=15.5;
	ob[4]=true;
	
for (int j = 0; j < ob.length; j++) {
	System.out.println(ob[j]);
}
	
	
	
	}
	}


