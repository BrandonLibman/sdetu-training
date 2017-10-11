package oop;

class Person {
	
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + " is walking.");
	}
	
	void eat() {
		System.out.println(email);
	}
	
	void sleep() {
		System.out.println(name + " is sleeping.");
	}
	
}

public class Demo {

	public static void main(String[] args) {
		// Instantiating an object
		Person person1 = new Person();
		
		// Define some properties
		person1.name = "Brandon";
		person1.email = "Brandonlibman@gmail.com";
		person1.phone = "514-754-8946";
		
		// Abstraction
		person1.walk();
		person1.eat();
		
		Person person2 = new Person();
		person2.name = "Mike";
		person2.email = "mike.libman@live.ca";
		
		person2.sleep();
		
		/*
		// Person
		
		// Attributes, variables, adjectives, descriptors
		String name = "Brandon";
		String email = "Brandonlibman@gmail.com";
		String phone = "514-754-8946";

		// Action, activity, behavior
		// System.out.println(name + " is walking.");
		walking(name);
		System.out.println(name + " is eating.");
		
		// What if we want to do this for another person?
		String name2 = "Mike";
		String email2 = "Mike.libman@live.ca";
		String phone2 = "514-207-8946";

		// Action, activity, behavior
		// System.out.println(name2 + " is walking.");
		walking(name2);
		System.out.println(name2 + " is eating.");		
		
		// What about binding attributes and properties together?
	}

	// Enhance by adding functions to minimize code
	static void walking(String name) {
	System.out.println(name + " is walking.");
	
	*/
	}
	
}
