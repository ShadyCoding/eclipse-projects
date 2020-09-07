package Practice;

public class Fish extends Animal{
	
	public Fish(String gender, double bodayweight, int age) {
		super(gender, bodayweight, age);
		// TODO Auto-generated constructor stub
	}

	public void swim() {
//		System.out.println("Swimming... from fish class");
	}

	@Override
	public void move() {
		System.out.println("Swimming... from fish class");
		
	}

}
