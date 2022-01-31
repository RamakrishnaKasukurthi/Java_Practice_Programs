package revise_2022;

public class MainMethod {

	public static void main(int i) {
		
		System.out.println("main(int i)");
	}
public static void main(int i,int k) {
	System.out.println("main(int i,int k)");
	}
public static void main(String i) {
	System.out.println("main(String i)");
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main ORG");
		main(10);
		main(10, 20);
		main("rama");
	}

}
