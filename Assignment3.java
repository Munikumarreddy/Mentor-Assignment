package com.cognizant;

public class Assignment3 {
	public static String concat(String[] s) {
		String res = "";
		for (int i = 0; i < s.length; i++) {
			if (s[i] != null) {
				result = res.concat(s[i]);
			}

		}
		return result;

	}

	public static void main(String[] a) throws Exception {

		System.out.println(concat(new String[] { "hello", null, "welcome", null, "munikumar" }));

	}
}