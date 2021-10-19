package abstract_class;

public  class Online_Shopping extends Shoping_list {
 
	@Override
	public void shirt() {
	   System.out.println("Live's");
		
	}
	
	@Override
	public void blazers() {
		System.out.println("Raymond");
		
	}
	
	public static void main(String[] args) {
		
		Online_Shopping wistlist = new Online_Shopping();
		wistlist.watch();
		wistlist.speakere();
		wistlist.shoes();
		wistlist.shirt();
		wistlist.blazers();
	}
}
