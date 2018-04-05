
public class TestEmployee {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Ali","Can",3000);
		Employee e2 = new Employee("Ayse","Can",4000);
		
		System.out.println(e1);
		System.out.println(e2);
		
		e2.setSalary(-1);
		e1.setSalary(e1.getSalary()+500);
		
		System.out.println(e1);
		System.out.println(e2);
	}
	
}
