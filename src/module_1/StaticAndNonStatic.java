package module_1;

public class StaticAndNonStatic {
	
	static int x=10;//Static Variable 
	 int y=20; // Non Static Variable or Instant Variable 
public void sum() //Non Static Method or Instant Method 
{
	System.out.println("Non Static Method or Instant Method ");
	System.out.println(x);
	System.out.println(y);
}
	
public static void diff() //Static Method
{
	System.out.println("Static Method");
	System.out.println(x);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(x);//Static Method calling Static Method -direct
		diff();//Static Method calling Static Method -direct
		StaticAndNonStatic obj=new StaticAndNonStatic();
		
		obj.sum();
		

	}

}
