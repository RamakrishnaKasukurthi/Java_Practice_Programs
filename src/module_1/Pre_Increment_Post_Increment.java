package module_1;

public class Pre_Increment_Post_Increment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 0, y = 15;

		do {
			x++;
			System.out.println(x);
			if (++x < 5) {
				continue;
			}
			x++;
			System.out.println(x);

		} while (++x < 10);

		System.out.println(y>x?40:50);

		
		  int z=x>>y; System.out.println(z);
		 

		
		  if (x!=0) { x+=x+1; System.out.println(x); }
		 

		
		  if (++x>10|++y<15) { System.out.println(x); }else System.out.println(y);
		 

		// int z=++(++x); //this is invalid

		
		  System.out.println(++x); System.out.println(x);
		 

		
		  System.out.println("The original value of X: "+x);
		  System.out.println("The original value of Y: "+y);
		  
		  System.out.println("Now post increment x++:"+(x++));
		  System.out.println("After post increment x++:"+x);
		  
		  System.out.println("Now pre increment ++y:"+(++y));
		 

	}

}
