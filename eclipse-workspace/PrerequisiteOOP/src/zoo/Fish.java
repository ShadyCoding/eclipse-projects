package zoo;

public class Fish extends Aminal{

	public Fish(String name, String speak, double weight, int age) {
		super(name, speak, weight, age);
	}

	public void swim() {
		System.out.println("swimming...");
	}
}
