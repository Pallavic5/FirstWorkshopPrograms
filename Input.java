package com.bl.workshop;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str1 = sc.nextLine();
		System.out.println("Enter a Character: ");
		char ch = sc.next().charAt(0);
		System.out.println(ch);
		Input input = new Input();
		input.countChar(str1, ch);
	}

	public void countChar(String str, char c) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == c) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println("Match not found");
		} else {
			System.out.println("Count :" + count);
		}
	}
}
