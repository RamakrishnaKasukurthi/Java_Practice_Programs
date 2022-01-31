package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al=new ArrayList<String>();
al.add("rama");
al.add("Krishnan");
al.add("Selenium");

//1. using java 8 or 1.8 with for each loop and lambda expression
al.forEach(view ->{
	System.out.println(view);
});
System.out.println("******");
//2. using Iterator:
Iterator<String> it=al.iterator();
while (it.hasNext()) {
	String show=it.next();
	System.out.println(show);
}

System.out.println("***");
//for loop
for (String st : al) {
	System.out.println(st);
}
System.out.println("****");

for (int i = 0; i < al.size(); i++) {
	System.out.println(al.get(i));
}
	}
	

}
