package com.bl.workshop;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		UserInput input = new UserInput();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str1 = sc.nextLine();
		System.out.println("Original String: " + str1);
		String str2 = " ";
		System.out.println("Reverse String: " + str2);
		input.reverseString(str1);
		input.stringIsPalindrome(str1, str2);
		input.countVowel(str1);
	}

	public String reverseString(String str) {
		char[] ch = str.toCharArray();
		String reverse = "";
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.println(ch[i]);
			reverse += ch[i];
		}
		return reverse;
	}

	public void stringIsPalindrome(String strNew, String revString) {
		char[] ch = strNew.toCharArray();
		revString = "";
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.println(ch[i]);
			revString += ch[i];
		}
		if (strNew.equalsIgnoreCase(revString)) {
			System.out.println("String is Palindrome");
		} else {
			System.out.println("String is not Palindrome");
		}
	}

	public void countVowel(String strVowel) {
		int count = 0;
		char[] array = { 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u' };
		for (int i = 0; i < strVowel.length(); i++) {
			for (int j = 0; j < array.length; j++) {
				if (strVowel.charAt(i) == array[j]) {
					count++;
				}
			}
		}
		System.out.println("Number of vowels present in string: " + count);
	}
}
