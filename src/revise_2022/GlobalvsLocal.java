package revise_2022;

public class GlobalvsLocal {
	String name="Tom";
	int age=25;
	public void test() {
		int x=10;
		int y=20;
		int c=x+y;

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GlobalvsLocal obj=new GlobalvsLocal();
		System.out.println(obj.age);
		System.out.println(obj.age);
		obj.test();
		

	}

}
