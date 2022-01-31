package module_1;

public class WrapperClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Wrapper classes are used for converting primitive data types into objects.
		
		//String to Interger.
		String x="100";
		int l=Integer.parseInt(x);
		int a=l+l;
		System.out.println(a);
		
	//String to double
		String b="10.25";
		double c=Double.parseDouble(b);
		System.out.println(c+c);
		
		//String to boolean
		String s="true"; 
		boolean be=Boolean.parseBoolean(s);
		System.out.println(be);
		
		//Integer to String
		int aa=100;
		String st=String.valueOf(aa);
		System.out.println(st);

		//Exception --Number format 
		
		String u="100t";
		int it=Integer.parseInt(u);//Number format exception
		
		
	}

}
