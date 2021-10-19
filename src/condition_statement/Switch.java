package condition_statement;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		System.out.println("emter your id");
		
		Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        
        switch(a) {
        
        case 224455:
        	System.out.println("manager");
        	break;
        
        case 224466:
        	System.out.println("cleaner boy");
        	break;
        	
        case 224477:
        	System.out.println("trainer");
        	break;
        
        case 224488:
        	System.out.println("student");
        	break;
        	
        default:
        	System.out.println("invalid id");
        	break;
        	     
        }     
	}
}
