package string;

import loop_concept.For_Loop;

public class String_Concept {

	public static void main(String[] args) {
		
		String s = "Welcome To Chennai 2.0";
		
		int len = s.length();
		System.out.println(len);

		String S1 = "welcome to chennai 2.0";
		
		boolean e = s.equals(S1);
		System.out.println(e);
		
		boolean c = s.equalsIgnoreCase(S1);
		System.out.println(c);
		
		boolean contains = s.contains("me to ch");
		System.out.println(contains);
		
		int indexOf = s.indexOf('e');
		System.out.println(indexOf);
		
		String U = S1.toUpperCase();
		System.out.println(U);
		
		String l = s.toLowerCase();
		System.out.println(l);
		
		String replace = s.replace("2.0", "metro station");
		System.out.println(replace);
		
		String substring = s.substring(3);
		System.out.println(substring);
		
		boolean empty = s.isEmpty();
		System.out.println(empty);
		
		// foreachloop
		
		String[] split = s.split("");
		for (String String : split) {
			System.out.println(String);
		}
		
		String trim = s.trim();
		System.out.println(trim);
			
		}
	}


