class Solution {
	public int findLUSlength(String a, String b) {

		if (a.length() < b.length()) {
			return b.length();
		}
		if (a.length() == b.length()) {
			if (a.equals(b)) {
				return -1;
			} else {
				return a.length();
			}
		}
		if (a.length() > b.length()) {
			return a.length();
		}

		return -1;
	}
}