package Practice;

public abstract class Animal {
	
	String gender;
	double weightInLbs;
	int age;
	
	
	public Animal(String gender, double bodayweight, int age) {
		this.gender = gender;
		this.weightInLbs = bodayweight;
		this.age = age;
	}
	public void eat() {
		System.out.println("Eating... from animal class");	
	}
	
	public void sleep() {
		System.out.println("Sleeping... from animal class");	
	}
	
//	public void fly() {
//		System.out.println("Flying... from animal class");
//	}
	
	public abstract void move();
	
}
