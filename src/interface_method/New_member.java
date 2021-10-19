package interface_method;

public class New_member implements pet1,pet2{
    
	@Override
	public void name1() {
	   System.out.println("jully");
		
	}
	
	@Override
	public void name2() {
         System.out.println("albert");
		
	}
	
	public static void main(String[] args) {
		New_member name = new New_member();
		name.name1();
		name.name2();
	}
}
