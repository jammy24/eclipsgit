package array_concept;

public class Multy_Dimentional_Array {

	public static void main(String[] args) {
	
		int arr[][] = new int [2][2];

		arr[0][0] = 12;
		arr[1][0] = 86;
		arr[0][1] = 99;
		arr[1][1] = 97;
		
		for (int i = 0; i < 2; i++) {
		    for (int j = 0; j < 2; j++) {
				System.out.print(arr[i][j]+" ");
			}
		    System.out.println();
		}
	}

}
