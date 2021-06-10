package com.example.shift.left.quality;

/**
 * This is a simple welcome class.
 * It has a single functionality, to greet folks with "Hello".
 * If the name is empty, blank or made up with any characters that represents just space, we return "Hello!". Otherwise,
 * we return "Hello<space><name><exclamation>"
 */
public class Welcome {
	private static final String HELLO = "Hello";
	private static final String SPACE = " ";
	private static final String EXCLAMATION = "!";
	
	private Welcome() {	}

	public static String greet(String name) {
		if (name == null || name.trim().isEmpty()) {
			return HELLO;
		}
		return HELLO + SPACE + name + EXCLAMATION;
	}
}
