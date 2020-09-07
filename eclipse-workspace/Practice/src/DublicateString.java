
public class DublicateString {

	public int dublicateString(String str) {
		// String str = "java";
		// int len = str.length();
		int temp = -1;
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					temp = i;
					break;
				}
			}
			if (temp != -1) {
				break;
			}
		}
		return temp;
	}
}
