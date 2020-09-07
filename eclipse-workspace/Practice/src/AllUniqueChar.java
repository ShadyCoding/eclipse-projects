
public class AllUniqueChar {

	public boolean allUniqueChar(String str) {
		int unique = 0;
		int notUnique = 0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}
}
