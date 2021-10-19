package constructor;

public class fruit {

	public fruit() {
		System.out.println("apple");
	}
	
	public fruit(String a) {
		System.out.println(a);
	}
	
	 public static void main(String[] args) {
		fruit food = new fruit();
		fruit food1= new fruit("orange");
	}

}
