package logical_program;

import jdk.internal.dynalink.beans.StaticClass;

public class WthoutLoop_Number {

	public static void main(String[] args) {
		
		printNumber(1);                                 // printnumber(1, 100);
		
	}
		public static void  printNumber(int num) {     // (int stnum, int endnum)
		    
			if (num <= 100) {                          // if (stnum <= endnum);		
				
				System.out.println(num);               // syso(stnum);
				
				num++;                                 // stnum++;
				
				printNumber(num);                      // printnumber(stnum, endnum);
				
			}

	}

}
