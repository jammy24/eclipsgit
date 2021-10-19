package variables;

public class Types_Of_Variables {

	static int a = 50;           // class variable
	 
	 public void add() {     
		 
		 int a = 1234;           // local variable
		System.out.println(a);
	}
	 
	 public void multi() {        // static variable
		
		 System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		Types_Of_Variables v = new Types_Of_Variables();
		
		v.add();
		
		v.multi();
		
		System.out.println(a);
	}

}
