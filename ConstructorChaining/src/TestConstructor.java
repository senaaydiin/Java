

public class TestConstructor {

	
	public static void main(String[] args) {
		Kangal kangal = new Kangal();
		System.out.println("main");
	}
}


class Animal{
	
	public Animal() {
		
		System.out.println("Animal cons.");
	}
	
}

class Dog extends Animal{
	
	public Dog() {
		
		System.out.println("Dog cons.");
	}
	
}

class Kangal extends Dog{
	
	public Kangal() {
		
		System.out.println("Kangal cons.");
	}
	
}