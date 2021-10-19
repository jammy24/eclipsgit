package logical_program;

import java.util.Scanner;

public class Odd_Or_Even_Program {

	public static void main(String[] args) {
		
		 System.out.println("enter the number");
		
		 Scanner sc = new Scanner(System.in);
		 
		 int num;
		 
		 num = sc.nextInt();
		 
		  
		 
		 if (num % 2 == 0) {
			 
			System.out.println("even number");
			
		} else { 
			
             System.out.println("odd number");
		}

		
	} 
	
}
