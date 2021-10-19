package collection;

import java.util.LinkedList;
import java.util.List;

public class List_Method {

	public static void main(String[] args) {
		
		//list--impot // linkedlist--import
		
		List<Integer> s  = new LinkedList<Integer>();
		List<Object> s1 = new LinkedList<Object>();

		s.add(23);
		s.add(45);
		s.add(23);
		s.add(23);
		
		s1.add("linked");
		s1.add(45);
		s1.add("true");
		s1.add(23);
		
		System.out.println(s);
		System.out.println(s1);
		
		//size
		
		int size = s1.size();
		System.out.println(size);
		
		//contains--to check the given is contain or not
		
		boolean contains = s1.contains(45);
		System.out.println(contains);
		
		//get--to get particular array value
		
		Object object = s1.get(0);
		System.out.println(object);
		
		//remove
		
		s.remove(0);
		System.out.println(s);
		
		//indexof-- to find inex value
		
		int indexOf = s1.indexOf("true");
		System.out.println(indexOf);
		
		//clear
		
	//	s.clear();
	//	System.out.println(s);
		
		//addall -- s1 add to s and print
		
		s1.addAll(s);
		System.out.println(s1);
		
		//retainall
		
		s.retainAll(s1);
		System.out.println(s);
		
		//removeall -- s1 remove s common value
		s1.removeAll(s);
		System.out.println(s1);
			
		
	}

}
