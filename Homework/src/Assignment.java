import java.util.Calendar;
import java.util.Date;

public class Assignment {

	public static void main(String[] args) {
		
		
		Student ogrenci1 = new Student("Sena","AYDIN");
		Student ogrenci2 = new Student("Zeynep","Yavuz");
		Student ogrenci3 = new Student("Busra","OZMEN");
		Student ogrenci4 = new Student("Selcuk","Guzel");
		
		ogrenci1.toStrStudentDetails();
		ogrenci1.currentStatus();
		ogrenci1.setGPA(3.7);
		ogrenci1.toStrStudentDetails();
		ogrenci1.currentStatus();
		Assignment a1 = new Assignment();
		a1.whichSemester();
		
		Advisor a2 =new Advisor("Ayse","YALCIN");
		a2.toStrAdvisorDetails();
		Advisor a3 =new Advisor("Hilal","KAYA");
		a3.toStrAdvisorDetails();
		Advisor a4 =new Advisor("Fatih","Celebi");
		a4.toStrAdvisorDetails();
		Advisor a5 =new Advisor("Deniz","ACER");
		a5.toStrAdvisorDetails();
		
		a1.assignStudentToAdvisor(ogrenci1, a2);
		a2.toStrAdvisorDetails();
		a1.assignStudentToAdvisor(ogrenci2, a2);
		a2.toStrAdvisorDetails();
		a1.assignStudentToAdvisor(ogrenci3, a2);
		a2.toStrAdvisorDetails();
		a1.assignStudentToAdvisor(ogrenci3, a2);
		ogrenci2.setGPA(2);
		ogrenci4.setGPA(1.5);
		ogrenci4.setYear(3);
		ogrenci4.setAge(24);
		ogrenci2.toStrStudentDetails();
		ogrenci3.setYear(0);
		ogrenci1.setAge(23);
		ogrenci3.toStrStudentDetails();
		ogrenci1.setYear(4);
		ogrenci1.toStrStudentDetails();
		ogrenci2.setGPA(1.80);
		ogrenci2.toStrStudentDetails();
		ogrenci4.toStrStudentDetails();
		
	}
	
	
	
public void assignStudentToAdvisor(Student s1, Advisor advisor1) {
		
		if(advisor1.getNumberOfStudentsAssigned()>=3)
		{
			System.out.print("ERROR: Cannot assign more students to advisor ");
			advisor1.toStrAdvisorDetails();
		}
		else {
			
			advisor1.setNumberOfStudentsAssigned(advisor1.getNumberOfStudentsAssigned()+1);
			s1.setAdvisor(advisor1);
			
		}
	
	}
	
public void whichSemester() {
	Date date = new Date();
	Calendar cal = Calendar.getInstance();
	cal.setTime(date);

	int month = cal.get(Calendar.MONTH)+1;

	
	String semester;
	
	if(month==2 || month == 3 || month == 4 || month == 5 || month == 6) semester="SPRING";
	else semester= "FALL";
	System.out.println("Current Semester is " + semester);
	System.out.println("**************************************");
		
	
}
}
