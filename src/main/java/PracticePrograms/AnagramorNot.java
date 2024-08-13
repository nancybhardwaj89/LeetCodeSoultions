package PracticePrograms;

import java.util.Arrays;

public class AnagramorNot {

	public static boolean isAnagram(String S1, String S2) {
		String str1 = S1.replaceAll("\\s", "");
		String str2 = S2.replaceAll("\\s", "");
		if (str1.length() != str2.length()) {
			return false;
		} else {
			char c1[] = str1.toLowerCase().toCharArray();
			char c2[] = str2.toLowerCase().toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			return Arrays.equals(c1, c2);
		}
	}

	public static void main(String[] args) {

		System.out.println(isAnagram("LISTEN", "SILENT"));
		System.out.println(isAnagram("cat", "Act"));
		System.out.println(isAnagram("abc", "cd e"));
	}
}
