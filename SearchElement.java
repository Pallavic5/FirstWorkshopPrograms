package com.bl.workshop;

import java.util.Scanner;

public class SearchElement {
	public static void main(String[] args) {
		int searchElement, count = 0;
		int[] a = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a element: ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("Array Elements: ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("Enter a search elements: ");
		searchElement = sc.nextInt();
		for(int i = 0; i < a.length; i++) {
			if(a[i] == searchElement) {
				count++;
			}
		}
		if(count > 0) {
			System.out.println("Element is found");
		}
		else {
			System.out.println("Element is not found");
		}

	}

}
