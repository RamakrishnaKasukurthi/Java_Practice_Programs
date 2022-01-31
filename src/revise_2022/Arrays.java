package revise_2022;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i[]=new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		System.out.println(i[2]);
		System.out.println("*******");
		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
			
		}
		double j[]=new double[3];
		char c[]=new char[4];
		boolean b[]=new boolean[5];
		String s[]=new String[6];
		j.clone();
		c.clone();
		b.clone();
		s.clone();
		
		Object obj[]=new Object[4];
		obj[0]="Tom";
		obj[1]=12;
		obj[2]=28.4;
		obj[3]='M';
		
		String st[][]=new String[2][3];
		System.out.println(st.length);//total no .of rows
		System.out.println(st[0].length);//total no .of rows
		st[0][0]="tom";
		
		
	}

}
