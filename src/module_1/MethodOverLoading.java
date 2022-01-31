package module_1;

public class MethodOverLoading {
	
	// we can't create method inside method.
	// We can't create duplicate methods.
	//If a class has multiple methods having same name but different in parameters/Arguments, 
	//it is known as Method Overloading.

	//below are the few different examples
	public void sum() {
		
	}
	public void sum(int a) {
		
	}
	public void sum(int x, int y) {
		
	}
	public void sum(int x, double y) {
		
	}
	public void sum(double x) {
		
	}
public void sum(double x, int y) {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
MethodOverLoading obj=new MethodOverLoading();
obj.sum();
obj.sum(10.5);
obj.sum(10);
obj.sum(1.5, 5);
obj.sum(10, 1.5);
obj.sum(100, 200);
		
	}

}
