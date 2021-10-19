package logical_program;

public class Palindrom_Number {

	public static void main(String[] args) {
		
		   int no = 1221;
		   int rem,sum=0,no1;
		   no1=no;
		   
		   while (no>0) {
			
			   rem=(no%10);
			   sum=(sum*10)+rem;
			   no=no/10;
			   
		}
		 if (no1==sum) {
			 
			 System.out.println("given no is palindrom");
			 
		} else {
			
			System.out.println("given no is not a palindrom");
            
		} 
	}

}
