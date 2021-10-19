package logical_program;

public class Palindrom_string {

	public static void main(String[] args) {
		
		String word = "ABBA";
		String word1 = "";
		
		for (int i = word.length()-1; i>= 0; i--) {
			
			word1 = word1+word.charAt(i);
		     
    	}	
		System.out.println(word1);
		
		if (word1.equals(word)) {
			
			System.out.println("palindrom");
			
		} else {
			
            System.out.println("not a palindrom");
		}
	}                 
}
