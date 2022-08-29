package com.abc;

import java.util.Arrays;
import java.util.Comparator;

class SortingLengthArray {

// Function to check the small String

// Function to print the sorted array of String
static void printArrayString(String str[], int n) {
	for (int i = 0; i < n; i++)
	System.out.print(str[i] + " ");
}

// Driver function
public static void main(String[] args) {
	String arr[] = { "PuneCity", "I", "from", "Yash Family" };
	int n = arr.length;

	// Function to perform sorting
	Arrays.sort(arr, new Comparator<String>() {

	@Override
	public int compare(final String s1, final String s2) {
		return s1.length() < s2.length() ? -1 : 1;
	}
	});

	// Calling the function to print result
	printArrayString(arr, n);
}
}
