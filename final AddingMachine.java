/*
Author: John Gebara
Class ID: 85141
Assignment #: 2
Description: This is the adding machine program which is 
essentially a calculator that will return the total and keep 
the history
*/

//Repository: https://github.com/jfgebara/CSE360assign2.git

package cse360assign2;

/**
 * This class is meant to act as a calculator and add and 
 * subtract values from each other and return the total and the 
 * history
 * 
 * @author John Gebara
 * @version 1.0
 */
public class AddingMachine 
{
	private int total;
	private String history;
	
	/**
	 * this method is to set up the adding machine and initialize
	 * the total to and the history to zero
	 */
	public AddingMachine () 
	{
		total = 0;  // not needed - included for clarity
		history = "0";
	}
	
	/**
	 * this method is meant to return the total which is altered
	 * depending on what method is called in what order
	 * 
	 * @return total the final total with the methods called at the time
	 */
	public int getTotal () 
	{
		return total;
	}
	
	/**
	 * this method is meant to be passed a value to be added to the
	 * total and the history
	 * 
	 * @param value this is the value that is supposed to be added
	 * to the total and the history
	 */
	public void add (int value) 
	{
		total = total + value;
		history = history + " + " + value;
	}
	
	/**
	 * this method is meant to be passed a value to be subtracted to the
	 * total and inputted into the history
	 * 
	 * @param value this is the value that is supposed to be subtracted
	 * to the total and inputted into the history
	 */
	public void subtract (int value) 
	{
		total = total - value;
		history = history + " - " + value;
	}
	
	/**
	 * this method is meant to return the full string containing the 
	 * history of calculations performed in their specific order
	 * 
	 * @return this is the full string containing the history of the
	 *  addition and subtraction when the methods are called
	 */
	public String toString () 
	{
		return history;
	}
	
	/**
	 * this method is the clear method which initializes everything back
	 * to zero to essentially start a new history and new total 
	 */
	public void clear() 
	{
		total = 0;
		history = "0";
	}	
}
