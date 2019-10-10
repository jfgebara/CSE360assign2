/*
Author: John Gebara
Class ID: 85141
Assignment #: 2
Description: This is the test file to test all
the aspects of the AddingMachine file
*/

//Repository: https://github.com/jfgebara/CSE360assign2.git

package cse360assign2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * This class is meant to test to see if the clear, toString,
 *  add, subtract, and getTotal work.
 * @author John Gebara
 * @version 1.0
 */
class AddingMachineTest {

	/**
	 * case to test that history and total are set to 0
	 */
	@Test
	void testGetTotal() {
		AddingMachine addingmachine = new AddingMachine();
		assertEquals(0,addingmachine.getTotal());
		assertEquals("0",addingmachine.toString());
	}

	/**
	 * case to test if the add function works
	 */
	@Test
	void testAdd() {
		AddingMachine addingmachine = new AddingMachine();
		addingmachine.add(1);
		addingmachine.add(7);
		addingmachine.add(3);
		assertEquals(11,addingmachine.getTotal());
	}

	/**
	 * case to test if the subtract function works
	 */
	@Test
	void testSubtract() {
		AddingMachine addingmachine = new AddingMachine();
		addingmachine.subtract(8);
		addingmachine.subtract(2);
		addingmachine.subtract(6);
		assertEquals(-16,addingmachine.getTotal());
	}

	/**
	 * case to test if the add and subtract functions work 
	 * together and produce the right history and total
	 */
	@Test
	void testToString() {
		AddingMachine addingmachine = new AddingMachine();
		addingmachine.add(9);
		addingmachine.subtract(4);
		assertEquals(5,addingmachine.getTotal());
		assertEquals("0 + 9 - 4",addingmachine.toString());
	}

	/**
	 * case to test if the clear function works after values 
	 * have been inputed
	 */
	@Test
	void testClear() {
		AddingMachine addingmachine = new AddingMachine();
		addingmachine.add(1);
		addingmachine.subtract(5);
		addingmachine.add(2);
		addingmachine.subtract(6);
		addingmachine.clear();
		assertEquals("0",addingmachine.toString());
		assertEquals(0,addingmachine.getTotal());
	}
}
