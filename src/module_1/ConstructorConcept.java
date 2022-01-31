package module_1;

public class ConstructorConcept {

	// Constructor should be same class name
	// Constructor it wont return any return type
	// it does not have any void and static
	// Constructor can be overloade
	// If we are extends any calls if that class had any Constructor this system
	// first call parent call Constructor and this it will call sub class
	// Constructor

	public ConstructorConcept() {
		System.out.println("defauld Constructor");
	}

	public ConstructorConcept(int x) {
		System.out.println("Single par Constructor");
		System.out.println("x value: " + x);
	}

	public ConstructorConcept(int x, int y) {
		System.out.println("Two parms Constructor");
		System.out.println("x value: " + x);
		System.out.println("y value: " + y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorConcept obj = new ConstructorConcept();
		ConstructorConcept obj1 = new ConstructorConcept(10);
		ConstructorConcept obj2 = new ConstructorConcept(12, 20);

	}

}
