package PracticePrograms;

public class CountVowels {

	public static boolean isVowel(char t) {
		return t == 'a' || t == 'e' || t == 'i' || t == 'o' || t == 'u' || t == 'A' || t == 'E' || t == 'I' || t == 'O'
				|| t == 'U';
	}

	public static void main(String[] args) {
		String str = "Testingou";
		int VCount = 0;
		int CCount = 0;
		for (int x = 0; x <str.length(); x++) {
			if (isVowel(str.charAt(x))) {
				VCount++;
			}
			else
			{
				CCount++;
			}
		}
		System.out.println("Vowels:" +VCount);
		System.out.println("Consoantans:" +CCount);	
	}
}
