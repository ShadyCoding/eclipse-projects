package human;
public class Earth {

	public static void main(String[] args) {

		Human shady	= new Human("shady", "brown",25, 70	);
		Human alpha = new Human("Alpha", "black", 24, 65);
		shady.speak();
		System.out.println("");
		alpha.speak();
	}

}
