package PracticePrograms;

public class CommonElementsinTwoArrays {

	public static void main(String[] args) {
		int arr1[] = { 2, 3, 56, 8, 9, 1 };
		int arr2[] = { 4, 5, 2, 3, 9 };
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.println(arr1[i]);
				}
			}
		}
	}
}
