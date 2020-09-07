import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author Mikaeel Khalid
 *
 */

public class EmailValidation {

	public static void main(String[] args) {
		String email = "mikaeelkhalid@gail.com";
		System.out.println(isValid(email));
	}

	public static String isValid(String email) {
		String emailRegex = "[A-Za-z0-9.-]+@gmail\\.com$|[A-Za-z0-9.-]+@yahoo\\.com$|[A-Za-z0-9.-]+@hotmail\\.com$";
		Pattern pattern = Pattern.compile(emailRegex);
		Matcher matcher = pattern.matcher(email);
		if (matcher.find() && matcher.group().length() != 0) {
			return matcher.group().trim();
		} else {
			return "Invalid Email! ";
		}
	}

}
