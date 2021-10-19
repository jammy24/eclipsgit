package basic_concept;

public class Overloding {
	
	private void stud(int a, char b) {
		System.out.println(b);
		System.out.println(a);
		System.out.println(a+b);
	}
	
	private void stud(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	private void stud(String a , int b) {
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		Overloding data = new Overloding();
        data.stud(100,'a');
        data.stud(90, 85, 100);
        data.stud("sandy", 24);
	}

}
