package human;

public class Human {
	String name, eyeColor;
	int age, heightInInches;

	
	public Human(String name, String eyeColor, int age, int heightInInches) {
		this.name = name;
		this.eyeColor = eyeColor;
		this.age = age;
		this.heightInInches = heightInInches;
	}

	public void speak() {
		System.out.println("Hello my name is "+name);
		System.out.println("I am "+heightInInches+" tall man");
		System.out.println("I am "+age+" years old");
		System.out.println("My eye color is "+eyeColor);
	}
	
	public void eat() {
		System.out.println("Eating....");
	}
	
	public void walking() {
		System.out.println("Walking....");
	}
	
	public void working() {
		System.out.println("Working....");
	}
}
