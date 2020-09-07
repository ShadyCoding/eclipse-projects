package zoo;

public class Bird extends Aminal{

	public Bird(String name, String speak, double weight, int age) {
		super(name, speak, weight, age);
	}

	public void fly() {
	System.out.println("flying...");
	}
}
