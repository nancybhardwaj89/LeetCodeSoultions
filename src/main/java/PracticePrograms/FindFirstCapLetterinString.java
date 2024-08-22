package PracticePrograms;

public class FindFirstCapLetterinString {

	public static void main(String[] args) {
		String test="greekKshinGG";
		 for(int i=0;i<test.length();i++)
		 {
		 if(test.charAt(i) >= 'A' && test.charAt(i) <= 'Z')
		 {
		 System.out.println("Upper case : "+test.charAt(i));
		 break;
		 }
		 }
	}
}
