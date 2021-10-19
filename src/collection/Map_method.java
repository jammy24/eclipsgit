package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_method {

 public static void main(String[] args) {
		
		Map <Integer, String> m = new HashMap <Integer, String>();
		
		m.put(1,"java" );
		m.put(2,"c++" );
		m.put(null,null );
		m.put(3,"48" );
		m.put(4,"98" );
		m.put(5,"python" );
		m.put(6,"smith" );
		
		System.out.println(m);
		
		Set<Integer> keySet = m.keySet();
		System.out.println(keySet);
		
		Collection<String> values = m.values();
		System.out.println(values);
		
		Set<Entry<Integer, String>> entrySet = m.entrySet();
		System.out.println(entrySet);
		

	}
 

}
