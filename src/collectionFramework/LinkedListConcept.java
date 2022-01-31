package collectionFramework;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> ll=new LinkedList<String>(); // LinkedList Object creation 
		ll.add("rama");// Adding elements
		ll.add("Krishna");
		ll.add("test");
		ll.add("chinna");
		ll.add("Gopi");
		ll.add("Krishnan");
		System.out.println(ll);
		//set value with index
		ll.set(0, "Selenium");
		System.out.println(ll);
		//add first element		
		ll.addFirst("QTP");
		System.out.println(ll);
		//add lats element 
		ll.addLast("Manual");
		System.out.println(ll);
		//remove last element 
		ll.removeFirst();
		System.out.println(ll);
		//remove last element 
		ll.removeLast();
		System.out.println(ll);
		//get element with index value 		
		System.out.println(ll.get(0));
		//remove by using index
		ll.remove(2);
		System.out.println(ll);
		System.out.println("*******");
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}
		
		//Advance for loop
		System.out.println("*******");
		for (String str : ll) {
			System.out.println(str);
		}
		System.out.println("*******");
		//Iterator 
		Iterator<String> it=ll.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		System.out.println("*******");
		//While
		int num=0;
while (ll.size()>num) {
	System.out.println(ll.get(num));
	num++;
}
	}

}
