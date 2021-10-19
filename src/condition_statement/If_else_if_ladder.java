package condition_statement;

import java.util.Scanner;

public class If_else_if_ladder {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		for (int i=1; i <=3; i++) {
			
			System.out.println("ENTER YOUR MARK"+i);
			
			int mark = sc.nextInt();
			
			if (mark < 50) {
				
				System.out.println("FAIL");
			
			} else if(mark>=50 && mark<60) {
              
				System.out.println("D GREAD");
			
			} else if (mark>=70 && mark<90) {
				
				System.out.println("A GREAD");
			
			} else if (mark>=90 && mark<100) {
				
				System.out.println("S GREAD");
			
			}else {
			
				System.out.println("mark invalid");
			}
			      
		}
	}

}
