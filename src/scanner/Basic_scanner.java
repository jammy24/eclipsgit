package scanner;

import java.util.Scanner;

public class Basic_scanner {
    
	public static void main(String[] args) {
	   
		System.out.println("HELLO JAVA");
	    Scanner sc = new  Scanner(System.in); //Scanner ctr + space
	    String n = sc.nextLine();// type sc.--ctr+2
	    System.out.println(n);
	    
	    System.out.println("Enter the word");
	    String w = sc.next();
	    System.out.println(w);
	    
	    System.out.println("enter the number");
	    int a = sc.nextInt();
	    System.out.println(a);
	    	
	}

}
