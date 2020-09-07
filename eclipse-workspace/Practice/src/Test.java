import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		/*
		 * System.out.println("Enter string to find to dublicate character"); String str
		 * = in.nextLine(); DublicateString ds = new DublicateString(); int dublicateStr
		 * = ds.dublicateString(str); if(dublicateStr == -1) {
		 * System.out.println("Dublicate not found"); }else {
		 * System.out.println(str.charAt(dublicateStr)); }
		 */	
		
		
		AllUniqueChar unique = new AllUniqueChar();
		boolean check = unique.allUniqueChar("abc");
		System.out.println(check);
	}
}
