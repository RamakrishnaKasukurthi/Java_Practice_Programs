package collectionFramework;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {

	public static void main(String[] args) {

		// it similar to hashmap, but it's synchronised.
		//Store the value of key value basis.
		
		Hashtable<Integer, String> h1=new Hashtable<Integer, String>();
		
		h1.put(1, "Rama");
		h1.put(2, "Krishnan");
		h1.put(3, "Selenium");
		
		Hashtable h2=new Hashtable();
		h2=(Hashtable)h1.clone();// copy the h1 to h2
		
		System.out.println(h1);
		System.out.println(h2);
		h1.clear();
		System.out.println(h1);
		System.out.println(h2);
		
		if (h2.contains("Rama")) {
			System.out.println("Value found");
					}
	//Print all the values form hashtable using-----Enumeration---elements()
		Enumeration e=h2.elements();
		//print values of h2
		while (e.hasMoreElements()) {
		System.out.println(e.nextElement());	
			
		}
	
		// get all the values from hashtable using --entrySet()--set of hashtable valuse
		
		Set s=h2.entrySet();
		System.out.println(s);
	}

}
