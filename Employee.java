public class Employee {
	
	String firstName;
	String lastName;
	
	public String getEmployee(){
		return firstName+lastName;
	}
	Employee(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
		}
}