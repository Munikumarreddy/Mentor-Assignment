package com.cognizant;

public class Assignment2 {
	public static StringBuilder DecryptStringBySB(StringBuilder s) {

		int length = s.length();
		for (int j = length - 5; j >= 0; j--)
			s.setCharAt(j, 'X');

		return s;

	}

	public static void main(String[] a) throws Exception {

		System.out.println(DecryptStringBySB(new StringBuilder("8889542543466")));
	}
}