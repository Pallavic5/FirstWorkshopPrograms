package com.bl.workshop;

public class Constructor {

	public static void main(String[] args) {
		TestConstructor test = new TestConstructor();
		TestConstructor test1 = new TestConstructor(101, "Pallavi");
	}
}

class TestConstructor {
	int id;
	String name;

	public TestConstructor() {
		System.out.println("No Argument Constructor");
	}

	public TestConstructor(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println("Id :" + id + " Name: " + name);
	}

	@Override
	public String toString() {
		return "TestConstructor [Id = " + id + ", Name = " + name + "]";
	}
}
