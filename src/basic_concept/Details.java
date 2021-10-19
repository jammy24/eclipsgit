package basic_concept;

public class Details {
	
	private void employeeName() {
		System.out.println("sathish");
	}
	
	private void employeeId() {
		System.out.println("2455");
	}
	
	private void employeeAge() {
		System.out.println("26");
	}
	
	private void employeeLocation() {
		System.out.println("chennai");
	}
	
	
	public static void main(String[] args) {
	    
		Details employeeDetails = new Details();
		employeeDetails.employeeName();
		employeeDetails.employeeId();
		employeeDetails.employeeAge();
		employeeDetails.employeeLocation();

	}

}
