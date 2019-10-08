/*
 * LT Tran
 * 1212395377
 * This program will add and subtract 
 * integers as well as return the total amount
 * and document the history of inputs 
*/
package cse360assign2;

public class AddingMachine {

	private int total;
	private String history;

	public AddingMachine () {

		total = 0;  // not needed - included for clarity
		history = "0";

	}

	public int getTotal () {

		return 0;

	}

	public void add (int value) {

		total += value;
		history = history + " + " + value;
		
	}

	public void subtract (int value) {
		
		total -= value;
		history = history + " - " + value;

	}

	public String toString () {

		return history;

	}

	public void clear() {
		
		total = 0;  // not needed - included for clarity
		history = "0";
		

	}

}

	
	

