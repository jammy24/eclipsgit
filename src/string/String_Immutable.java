package string;

public class String_Immutable {

	public static void main(String[] args) {
		
		// same value stored in diffrent memorry
		
		String s = "welcome to java";
		System.out.println(s);
		System.out.println(System.identityHashCode("S"));
		
		String s1 = "welcome to java";
		System.out.println(s1);
		System.out.println(System.identityHashCode("S1"));
		
		//concat //it store in diffrent memory space
		
		s = s + s1;
		System.out.println(s);
		System.out.println(System.identityHashCode(s));
		
		//it canot reverse the string
		

	}

}
