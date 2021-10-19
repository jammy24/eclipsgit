package this_and_super;

public class keywords extends key_words {
      
	int a = 100;
	
	public void add() {
		
		int a = 50;
		
		System.out.println(a); //local variable
		
		System.out.println(this.a);   // this is a class level reference 
		
		System.out.println(super.a);  // super is a parent class reference
	}
	
	public static void main(String[] args) {
		
		keywords s = new keywords();
		
		s.add();
		
	}

}
