package module_1;

public class Hello_World {
	
	public String name(String name) {
		return "Mr."+ name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hello_World obj=new Hello_World();
		String st=obj.name("rama");
		System.out.println(st);
		//System.out.println("Wellcome user");

	}

}
