package module_1;

public class Swap_Two_Numbers_WithoutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10, b=20;
		
		System.out.println("Before Swap a:"+a);
		System.out.println("Before Swap b:"+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After Swap a:"+a);
		System.out.println("After Swap b:"+b);

	}

}
