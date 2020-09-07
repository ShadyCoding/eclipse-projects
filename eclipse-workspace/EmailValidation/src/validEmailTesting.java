import static org.junit.Assert.*;

import org.junit.Test;

public class validEmailTesting {

	EmailValidation valid = new EmailValidation();

	@Test
	public void testEmail() {
		String expectedEmail = "mikaeelkhalid@gmail.com";
		String reslutEmail = valid.isValid("mikaeelkhalid@gmail.com");
		assertEquals(expectedEmail, reslutEmail);
	}

	@Test
	public void testEmailWithDash() {
		String expectedEmail = "mikaeel-khalid@yahoo.com";
		String reslutEmail = valid.isValid("mikaeel-khalid@yahoo.com");
		assertEquals(expectedEmail, reslutEmail);
	}

	@Test
	public void testEmailWithDot() {
		String expectedEmail = "mikaeel.khalid@hotmail.com";
		String reslutEmail = valid.isValid("mikaeel.khalid@hotmail.com");
		assertEquals(expectedEmail, reslutEmail);
	}
}
