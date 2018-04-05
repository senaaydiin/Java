
public class Student {

	
	private String firstName;
	private String lastName;
	private int age=18;
	private int year=1;
	private double GPA=0.0;
	private Advisor advisor;
	
	private final String ERROR_WRONG_YEAR = "\nERROR: Wrong year value for student: ";
	private final String ERROR_WRONG_GPA = "\nERROR: Wrong GPA value for student: ";
	
	public Student(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Student(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public Student(String firstName, String lastName, int age, int year, double gPA) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.year = year;
		GPA = gPA;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if(year>4 || year<1) {
			
			System.out.println(  ERROR_WRONG_YEAR + year);
			System.out.println("*********************");
			
		}else this.year = year;
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double gPA) {
		if(gPA<0 || gPA>4){
			
			
			System.out.println( ERROR_WRONG_GPA + gPA);
			System.out.println("*********************");
			
		}else GPA = gPA;
	}

	public Advisor getAdvisor() {
		return advisor;
	}

	public void setAdvisor(Advisor advisor) {
		this.advisor = advisor;
	}
	
	public void toStrStudentDetails() {
		
		System.out.println("STUDENT NAME: " + firstName +" " + lastName);
		System.out.println("AGE: " + age);
		System.out.println("YEAR: " + year);
		System.out.println("GPA: " + GPA);
		System.out.println("************************");
		
	}
	
	public boolean isSuccessful() {
		if(GPA>=2.5) return true;
		else return false;
		
	}
	
	public void currentStatus() {
		String status;
		if(isSuccessful()) status= "SUCCESFUL";
		else status= "NOT SUCCESFUL";
		
		System.out.println("STUDENT: "+ firstName + " " + lastName +" " + status);
		System.out.println("*************************");
		
	}
	
	
	
	
	
}
