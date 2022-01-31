package module_1;

import java.util.ArrayList;

public class ArryListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println(al.size());
		al.add("rama");
		al.add(13.52);
		al.add('R');
		System.out.println(al.size());// to get the size of ArrayList
		al.remove(2);
		System.out.println(al.size());
		System.out.println(al.get(1));// to get value 
		System.out.println(al.get(4));
		for (int i = 0; i <al.size(); i++) {
			System.out.println(al.get(i));
		}
ArrayList<Integer> ar=new ArrayList<Integer>();//it will allow only Int values 
ar.add(10);
ar.add(20);
ar.add(30);
ArrayList<String> as=new ArrayList<String>();//it will allow only string values
as.add("rama");

		
	}

}
