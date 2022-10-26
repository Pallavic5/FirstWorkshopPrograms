package com.bl.workshop;

public class VariablesReview {

	static final int STUDENT_ID = 101;
	int studentAge = 20;

	public static void main(String[] args) {

		String studentName = "Pallavi";
		VariablesReview var = new VariablesReview();
		System.out.println("Student Name: " + studentName);
		System.out.println("Student Age: " + var.studentAge);
		System.out.println("Student Id: " + STUDENT_ID);
	}

}
