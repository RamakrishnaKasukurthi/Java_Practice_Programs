package module_1;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			int i=90/0;
			System.out.println(i);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Divided by Zero invalid");
			
		}finally {
			System.out.println("End of the Code");
		}
		int x=20, y=30;
		int z=x+y;
		System.out.println(z);
	}

}
