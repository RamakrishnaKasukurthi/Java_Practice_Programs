package module_1;

public class ThrowKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("ABC");

		try {
			throw new Exception("RAMA Exception");	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("XYZ");
	}

}
