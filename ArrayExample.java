package com.bl.workshop;

public class ArrayExample {

	public static void main(String[] args) {
		int[] arrayNum = new int[10];
		arrayNum[0] = 10;
		arrayNum[1] = 20;
		arrayNum[2] = 30;
		arrayNum[3] = 40;
		arrayNum[4] = 50;
		arrayNum[5] = 60;
		arrayNum[6] = 70;
		arrayNum[7] = 80;
		arrayNum[8] = 90;
		arrayNum[9] = 100;
		ArrayExample example = new ArrayExample();
		System.out.println("Print array:");
		example.printArray(arrayNum);
		System.out.println("Reverse array:");
		example.printRevArray(arrayNum);
		System.out.println("Sum of array element:");
		example.sumOfArray(arrayNum);
		System.out.println("The maximum element of array: " + example.maxElement(arrayNum));
	}

	public void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	public void printRevArray(int[] array) {
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println(array[i]);
		}
	}

	public void sumOfArray(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
			sum += array[i];
		}
		System.out.println("The sum of array: " + sum);
	}

	public int maxElement(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

}
