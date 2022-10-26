package com.bl.workshop;

public class ShiftElement {

	public static void main(String[] args) {

		int[] myArray = { 0, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1, 0, 0 };
		ShiftElement element = new ShiftElement();
		element.shiftArrayElement(myArray);
	}

	public void shiftArrayElement(int[] myArray) {
		int j = 0;
		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i] == 0) {
				myArray[j++] = myArray[i];
			}
		}
		while (j < myArray.length) {
			myArray[j++] = 1;
		}
		for (int k = 0; k < myArray.length; k++) {
			System.out.print(myArray[k] + " ");
		}
	}

}
