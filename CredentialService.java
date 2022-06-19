import java.util.Random;
import java.util.Scanner;

public class CredentialService extends Employee{
		
	CredentialService(String firstName, String lastName){
		super(firstName, lastName);		
		}
	
	int min = 101;
	int max = 999;
	int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
	
	Random ran = new Random();
	String[] specialChar = {"!","@","#","$","%","^","&","*","?"};
	int s1 = ran.nextInt(8);
	int s2 = ran.nextInt(8);
	
	String [] upper = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	String [] lower = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	int alpha1 = ran.nextInt(25);
	int alpha2 = ran.nextInt(25);
	int alpha3 = ran.nextInt(25);
	int alpha4 = ran.nextInt(25);
	int alpha5 = ran.nextInt(25);
	
	String email;
	public void generateEmailAddress(int dept) {
		if (dept == 0 || dept > 5) {
			System.out.println("Pleas enter a valid input");
		}
		if (dept == 1) {
			email = firstName+lastName+"@"+"tech"+".abc.com";
		}
		
		else if (dept == 2) {
			email = firstName+lastName+"@"+"admin"+".abc.com";
		}
		else if (dept == 3) {
			email = firstName+lastName+"@"+"hr"+".abc.com";
		}
		else if (dept == 4) {
			email = firstName+lastName+"@"+"legal"+".abc.com";
		}
		
	}
	
	public String generatePassword(){
		//String Pass = upper[alpha1]+lower[alpha2]+specialChar[s2]+lower[alpha3]+lower[alpha4]+specialChar[s1]+upper[alpha5]+random_int;
		return upper[alpha1]+lower[alpha2]+specialChar[s2]+lower[alpha3]+lower[alpha4]+specialChar[s1]+upper[alpha5]+random_int;
		}
	
	
	public void showCredentials() {
		System.out.println(email);
		System.out.println(generatePassword());
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee First Name");
		String firstName = sc.next();
		System.out.println("Enter Employee Last Name");
		String lastName = sc.next();
		
		CredentialService emp1 = new CredentialService(firstName, lastName);
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		int input = sc.nextInt();
		if (input >0 && input < 5) {
		emp1.generateEmailAddress(input);
		System.out.println("Dear "+firstName+" your generated credentials are as follows");
		emp1.showCredentials();
		}
		else {System.out.println("Please enter a valid department ID");}
		sc.close();
	}
}
	



