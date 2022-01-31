package module_1;

public class ThrowsKeyword {
	
	public static void main(String[] args)  {
		ThrowsKeyword obj=new ThrowsKeyword();
		obj.call();
		System.out.println("Main Method");
		
	}
	
	public void call()  {
		try {
			div();	
		} catch (ArithmeticException e) {
			e.getStackTrace();
		}
		
		System.out.println("Call method end");
	}
	public void div()throws ArithmeticException {// throws keyword
		int i=9/0;
		System.out.println(i);
		
	}

}
