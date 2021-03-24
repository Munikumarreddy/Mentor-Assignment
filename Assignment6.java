package com.cognizant;

public class Assignment6 {

	public static int countVowels(char[] a) throws Exception {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 'x') {
				throw new Exception("/array contains character 'X'");
			}
			if (a[i] == 'a' || a[i] == 'e' || a[i] == 'i' || a[i] == 'o' || a[i] == 'u') {
				count++;
			}

		}
		return count;

	}

	public static void main(String[] a) throws Exception {
		System.out.println("VowelCount" + countVowels(new char[] { 'x', 'e', 'k', 'o', 'q' }));
	}
}