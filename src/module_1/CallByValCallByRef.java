package module_1;

public class CallByValCallByRef {
	
	int p,q;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Call by Value means calling a method with a parameter as value
		// While Call by Reference means calling a method with a parameter as a
		// reference(we pass address of variables(location of variables) to the Method)
		
		CallByValCallByRef obj=new CallByValCallByRef();
		obj.sum(10, 20);//call by val
		obj.p=30;
		obj.q=40;
		
		obj.swap(obj);
		System.out.println(obj.p);
System.out.println(obj.q);
	}

	public int sum(int x, int y) {
		
		int c=x+y;
		return c;
	}
	
	//Call by reff
	public void swap(CallByValCallByRef t) {
		
		int temp;
		temp =t.p;
		t.p=t.q;
		t.q=temp;
		
	}
}
