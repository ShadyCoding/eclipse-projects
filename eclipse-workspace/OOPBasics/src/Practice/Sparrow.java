package Practice;

public class Sparrow extends Animal implements Flyable{
	
	public Sparrow(String gender, double bodayweight, int age) {
		super(gender, bodayweight, age);
	}

	@Override
	public void fly() {
		
	}

	@Override
	public void move() {
		System.out.println("Flapping wings... from sparrow class");		
	}

}
