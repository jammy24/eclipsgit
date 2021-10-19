package scanner;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner num = new Scanner (System.in); 
		System.out.println("ENTER YOUR ID NUMBER");
		int a = num.nextInt();
        System.out.println(a);
        
        System.out.println("ENTER YOUR PH NUMBER");
		int B = num.nextInt();
        System.out.println(B);
        
        System.out.println("ENTER YOUR CARD NUMBER");
		int c = num.nextInt();
        System.out.println(c);
        
	}

}
