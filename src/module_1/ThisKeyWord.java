package module_1;

public class ThisKeyWord {

	int x=100;
	int y=200;
	
	public ThisKeyWord(int x, int y) {
		System.out.println(this.x);//current class global value
		System.out.println(this.y);//current class global value
		System.out.println(x);
		System.out.println(y);
		
		this.x=this.x+x;
		
		System.out.println(this.x);//110
		
	}
	
	public void sum(int x) {
		this.y=x+x;
		System.out.println(this.y);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThisKeyWord obj=new ThisKeyWord(10, 20);
		obj.sum(200);
		
	}

}
