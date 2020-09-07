package Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {
		
		  String email = "shady-maverik@yahoo.com"; 
	        if (isValid(email)) 
	            System.out.print("Yes"); 
	        else
	            System.out.print("No");

	}
	public static boolean isValid(String email) 
    { 
//        String emailRegex = "^[a-zA-Z0-9_.]+(?:\\."+ 
//                            "[a-zA-Z0-9_+&*-]+)*@" + 
//                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
//                            "A-Z]{2,7}$"; 

		String emailRegex = "[A-Za-z0-9.-]+@gmail\\.com$|[A-Za-z0-9.-]+@yahoo\\.com$|[A-Za-z0-9.-]+@hotmail\\.com$";
        Pattern pat = Pattern.compile(emailRegex); 
        if (email == null) 
            return false; 
        return pat.matcher(email).matches(); 
    } 
	
	
	
	
	
	
	
	
	
	
	
	

	/*
	 * public static boolean isValid(String email) { String emailRegex =
	 * "[A-Za-z0-9.-]+@gmail\\.com$|[A-Za-z0-9.-]+@yahoo\\.com$|[A-Za-z0-9.-]+@hotmail\\.com$";
	 * Pattern pattern = Pattern.compile(emailRegex); Matcher matcher =
	 * pattern.matcher(email);
	 * 
	 * while (matcher.find()) { if (matcher.group().length() != 0) {
	 * System.out.println(matcher.group().trim()); } else {
	 * System.out.println("Email not found! "); }
	 * 
	 * }
	 * 
	 * if (email == null) return false; return pat.matcher(email).matches(); }
	 */

	/*
	 * public static boolean isValidEmailAddress(String email) { boolean result =
	 * true; try { InternetAddress emailAddr = new InternetAddress(email);
	 * emailAddr.validate(); } catch (AddressException ex) { result = false; }
	 * return result; }
	 */
	
	
	
	
	
	
	
	
	
	
	/*
	 * public static boolean isValidEmailAddress(String email) { boolean result =
	 * true; try { InternetAddress emailAddr = new InternetAddress(email);
	 * emailAddr.validate(); } catch (AddressException ex) { result = false; }
	 * return result; }
	 */
	
}
