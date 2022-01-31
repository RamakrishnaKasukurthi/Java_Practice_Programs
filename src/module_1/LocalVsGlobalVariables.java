package module_1;

public class LocalVsGlobalVariables {

	int a = 10; // Global Variable
	String s = "Rama"; // Global Variable

	public void emp() {
		int b = 20; // Local Variable
		String st = "Name of Emp"; // Local Variable
		
		System.out.println(a);// can access i.e instant method
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;// Local Variable
		String st = "Main Method"; // Local Variable
		LocalVsGlobalVariables obj=new LocalVsGlobalVariables();
		
		System.out.println(obj.a);// access through object.
		System.out.println(obj.s);// access through object.
//		obj.emp();
	}

}
