package Practice;

public class Bird extends Animal{

	public Bird(String gender, double bodayweight, int age) {
		super(gender, bodayweight, age);
	}

	@Override
	public void move() {
		System.out.println("Flapping wings... from Bird class");
		
	}
	
}
