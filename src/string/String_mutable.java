package string;

public class String_mutable {

	public static void main(String[] args) {
		
		StringBuffer s = new StringBuffer("welcome to java");
		System.out.println(s);
		System.out.println(System.identityHashCode(s));

		StringBuffer s1 = new StringBuffer("welcome to java");
		System.out.println(s1);
		System.out.println(System.identityHashCode(s1));
		
		//s.append() ctr+2
		//append the memory is shared // with same hash code
		
		StringBuffer append = s.append(s1);
		System.out.println(append);
		System.out.println(System.identityHashCode(append));
		
		//it can reverse the string
		
		s1.reverse();
		System.out.println(s1);

	}

}
