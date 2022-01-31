package revise_2022;

public class CallByValueAndCallByReference {
	int p;
	int q;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallByValueAndCallByReference obj=new CallByValueAndCallByReference();
		int x=10;
		int y=20;
		obj.sum(x, y);//call bu value
		obj.p=30;
		obj.q=40;
		obj.test(obj);

	}

	public int sum(int a,int b) {
		int c=a+b;
		return c;
	}
	//call by reference
	public void test(CallByValueAndCallByReference t) {
		System.out.println(t.p);
		System.out.println(t.q);

	}
}
