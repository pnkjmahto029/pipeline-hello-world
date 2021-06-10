package com.example.shift.left.quality;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * Test class for the com.example.shift.left.quality.Welcome.java class.
 * All requirements are tested through properties of input and expected output.
 * To enhance the coverage, the private constructor is also tested.
 * 
 * To add a new test-case, please add appropriate input and expected output to the arrays in testGreet() method.
 */
public class WelcomeTest {
	private static final String HELLO = "Hello";
	private static final String SPACE = " ";
	private static final String EXCLAMATION = "!";
	
	@Test
	public void testGreet() {
		List<String> inputs = Arrays.asList("", null, " ", "\t", "\n", "World");
		List<String> expectedOutputs = Arrays.asList(HELLO, HELLO, HELLO, HELLO, HELLO, HELLO + SPACE + "World" + EXCLAMATION);
		for (int index = 0; index < inputs.size(); index++) {
			assertEquals(expectedOutputs.get(index), Welcome.greet(inputs.get(index)));
		}
	}

	@Test
	public void testPrivateConstructor() throws NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Constructor<Welcome> constructor = Welcome.class.getDeclaredConstructor();
		assertTrue(Modifier.isPrivate(constructor.getModifiers()));
		constructor.setAccessible(true);
		constructor.newInstance();
	}
}
