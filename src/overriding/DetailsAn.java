package overriding;

//single inheritance

public class DetailsAn extends EmployeAn {
	
	// child class
    @Override
    public void Details() {
    	
    	System.out.println("employ name");
    
    	super.Details();                     // super will print parent class value
    	
    }
    
    @Override
    public void Details(int a) {
    	
    	System.out.println("employ no");
    	
    	System.out.println(a);
    	
    	super.Details(a);
    }
    
    @Override
    public void Details(float b) {
    	
    	System.out.println("employ bonud");
    	
    	System.out.println(b);
    	
    	super.Details(b);
    }
    
   public static void main(String[] args) {
	
	   DetailsAn d= new DetailsAn();
	   d.Details();
	   d.Details(4);
	   d.Details(29.4f);
}
	
	}

