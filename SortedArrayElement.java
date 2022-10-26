package com.bl.workshop;

public class SortedArrayElement {

	public static void main(String[] args) {
		int[] array = { 6, 77, 9, 3, 5, 1, 7, 98, 54, 85, 10 };
		SortedArrayElement element = new SortedArrayElement();
		element.sortedArray(array);
		element.descendingOrder(array);
	}

	public void sortedArray(int[] array) {
		int max = 0;
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
				if (array[j] > max) {
					max = array[j];
				}
			}
		}
		System.out.println("The maximum no. of array: " + max);

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public void descendingOrder(int[] array) {
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
