import java.util.concurrent.atomic.AtomicInteger;

public class Advisor {

	private static final AtomicInteger count = new AtomicInteger(0); 
	private String firstName;
	private String lastName;
	private int ID;
	private int numberOfStudentsAssigned=0;
	
	
	public Advisor(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		 ID = count.incrementAndGet();
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void toStrAdvisorDetails()
	{
		
		System.out.println("ADVISOR ID: "+ID+" NAME: " + firstName +" "+ lastName);
		System.out.println("***********************");
	}


	public int getNumberOfStudentsAssigned() {
		return numberOfStudentsAssigned;
	}


	public void setNumberOfStudentsAssigned(int numberOfStudentsAssigned) {
		this.numberOfStudentsAssigned = numberOfStudentsAssigned;
	}
	
	
}
