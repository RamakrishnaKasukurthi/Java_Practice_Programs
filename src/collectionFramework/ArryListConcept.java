package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArryListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al = new ArrayList(); // object creation to Arrlist
		al.add(30); // adding elements
		al.add("rama");
		al.add('a');
		al.add(13.45);
		System.out.println(al.size());// to check the length of the array list
		System.out.println(al.get(0));// to get the elements by using index positions

		ArrayList<Integer> al1 = new ArrayList<Integer>();// we can add only integer values.
		al1.add(10);
		ArrayList<String> al2 = new ArrayList<String>();// we can add only string values.
		al2.add("Rama");

		Employee obj1 = new Employee("rama", 26, "IT");
		Employee obj2 = new Employee("Krishna", 27, "ECE");
		Employee obj3 = new Employee("Gopi", 26, "CSE");

		ArrayList<Employee> ale = new ArrayList<Employee>();// In Array list storing Employee objects
		ale.add(obj1);
		ale.add(obj2);
		ale.add(obj3);

		// Iterator to get the values i.e now objects are stored in Araaylist so we have
		// to use this to get the one by one
		Iterator<Employee> it = ale.iterator();
		while (it.hasNext()) {
			Employee emp = it.next();
			System.out.print(emp.name+" ");
			System.out.print(emp.age+" ");
			System.out.println(emp.dept);
		}
		
		System.out.println("**************************");
		
		//addAll();
		ArrayList<String> al3 = new ArrayList<String>();
		al3.add("Rama");
		al3.add("Krishna");
		al3.add("Kasukurthi");
		ArrayList<String> al4 = new ArrayList<String>();
		al3.add("Test");
		al3.add("Java");
		al3.add("Selenium");
		
		al3.addAll(al4);
		for (int i = 0; i < al3.size(); i++) {
			System.out.println(al3.get(i));
		}
		System.out.println("********");
		//Remove All
al3.removeAll(al4);

		System.out.println(al3.size());
		/*
		 * for (int i = 0; i < al3.size(); i++) { System.out.println(al3.get(i)); }
		 */
	}

}
