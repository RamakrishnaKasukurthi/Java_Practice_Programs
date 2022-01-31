package module_1;

public class Sum_Numbers_In_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1="page 14 of 99";
		char[] a =str1.toCharArray();
		int sum=0;
		for(char b:a)
		{
			if(Character.isDigit(b))
			{
				//intv=Integer.parseInt(""+b);
				int v=Character.getNumericValue(b);
				sum=sum+v;
			}
		}
		System.out.println(sum);}

		
	
	}


