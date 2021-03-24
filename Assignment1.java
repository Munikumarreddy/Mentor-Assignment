package com.cognizant;

public class Assignment1 {
	public static String DecryptString(String s) {
		char[] c = s.toCharArray();
		for (int j = c.length - 1 - 4; j >= 0; j--) {
			c[j] = 'X';
		}

		return String.valueOf(c);

	}

	public static void main(String[] a) throws Exception {

		System.out.println(DecryptString("8889542543466"));
	}
}