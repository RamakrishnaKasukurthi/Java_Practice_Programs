package revise_2022;

public class OverLoading {

	public void sum() {
		System.out.println("sum()");

	}

	public void sum(int i) {
		System.out.println("sum(int i)");
	}
	public void sum(int i, int k) {
		System.out.println("sum(int i, int k)");
	}
	public void sum(String s) {
		System.out.println("sum(String s)");
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLoading obj=new OverLoading();
		obj.sum();
		obj.sum(10);
		obj.sum(10, 20);
		obj.sum("Rama");

	}

}
