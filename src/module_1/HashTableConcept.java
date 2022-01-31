package module_1;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable ht=new Hashtable();
		ht.put("a", "rama");
		ht.put("b", "Krishna");
		ht.put("c", "Kasukurthi");
		System.out.println(ht.size());
		ht.put(10, 20);
		ht.put(10.2,20.32);
		System.out.println(ht.size());
		ht.put(1, "chinna");
		ht.put(10.5, 10);
		System.out.println(ht.get("a")); // to get value we need to use key value
		
		
		Hashtable<Integer, String> h=new Hashtable<Integer, String>();// it will store only key as integer and value as String
		h.put(1, "Rama");
		h.put(2, "Krishna");
		System.out.println(h.get(1));//to get value we need to use key value
		
	}

}
