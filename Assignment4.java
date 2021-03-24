package com.cognizant;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assignment4 {

	public static void printAlternateReverse(int[] arr) {
		boolean val = true;
		System.out.println("Alternative Elements:");
		for (int i : arr) {
			if (val) {
				System.out.print(i + " ");
				val = false;
			} else {
				val = true;
			}

		}
		System.out.println();
		System.out.println("Reversing Elements");
		List<Integer> al = new ArrayList<Integer>();

		for (int i : arr) {
			al.add(i);
		}
		Collections.reverse(al);
		System.out.println(al);

	}
	public static void main(String[] a) throws Exception {
		printAlternateReverse(new int[] { 1, 2, 3, 4, 5, 6 });
	}
	}