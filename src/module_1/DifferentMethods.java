package module_1;

public class DifferentMethods {
	
	public void sample() {
		System.out.println("This is sample Method");
		
	}
	public int methodReturnInt() {
		int a=10;
		int b=20;
		int c=a+b;
		return c;
	}
	
	public String methodReturnString() {
		String s1="Rama";
		String s2="Krishna";
		String s3=s1+s2;
		return s3;
	}
public void methodArg(int a, int b) {
	int c=a+b;
	System.out.println(c);
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DifferentMethods obj=new DifferentMethods();
		obj.sample();
		int l=obj.methodReturnInt();
	System.out.println(l);
	String s=obj.methodReturnString();
	System.out.println(s);
	obj.methodArg(100, 200);

	}

}
