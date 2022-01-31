package module_1;

public class NullConcept {

	static Object obj;
	static String st;
	static NullConcept nc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub//

		// it is case sensitive: null. exc: Object obj=null;

		// default value will be nul

		System.out.println(obj);
		System.out.println(st);
		System.out.println(nc);

Integer i=null;
//int j=i;// System will through null exception 
	

//
Integer x=null;
Integer y=10;
System.out.println(x instanceof Integer);//false
System.out.println(y instanceof Integer);//true

//static vs Non Static 

NullConcept obj=null;
obj.sum();
//obj.send();// System will through null exception 

//== and !=
	System.out.println(null==null);
	System.out.println(null!=null);
	}
	
	
	public static void sum() {
		System.out.println("Sum method");
	}
public void send() {
	System.out.println("Send method");
}


}
