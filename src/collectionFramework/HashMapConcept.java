package collectionFramework;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {
		// HashMap is a class implement Map interface
		// extends Abstract Map
		// Store the key value pairs
		// it may have null key and null values
		// it maintain no order
		//No thread safe, Non-Synchronised 

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Rama");
		hm.put(2, "Krishnan");
		hm.put(3, "Selenium");
		hm.put(4, "Manual");

		System.out.println(hm);
		System.out.println(hm.get(1));

		hm.remove(3);
		System.out.println(hm);

		HashMap<Integer, Employee> emp=new HashMap<Integer, Employee>();
		Employee em1=new Employee("Rama", 26, "IT");
		Employee em2=new Employee("Krishnan", 27, "CSE");
		Employee em3=new Employee("Gopi", 28, "ECE");
		
		emp.put(1, em1);
		emp.put(2, em2);
		emp.put(3, em3);
		
		System.out.println(emp);
		
		for(Entry<Integer, Employee> m: emp.entrySet()) {
int key=m.getKey();
Employee e=m.getValue();
System.out.print(key+"Info: ");
System.out.println(e.name+" "+e.age+" "+e.dept);

			
		}
		
		
	}

}
