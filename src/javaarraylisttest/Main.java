/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaarraylisttest;

import java.util.ArrayList;

/**
 *
 * @author Christopher Wells <cwellsny@nycap.rr.com>
 */
public class Main {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// Create an empty ArrayList
		ArrayList testArray = new ArrayList();

		// Fill the ArrayList with the numbers 0 through 12
		for (int i = 0; i < 12; i++) {
			testArray.add(i);
		}

		// Print out the contents of the ArrayList
		System.out.println("Contents: " + testArray);

		// Clear the contents of the ArrayList
		testArray.clear();

		// Print out the empty ArrayList
		System.out.println("Contents: " + testArray);

		// Fill the ArrayList with one character Strings
		for (char i = 'a'; i < 200; i += 4) {
			testArray.add(i + "");
		}

		// Print out the one character String filled ArrayList
		System.out.println("Contents: " + testArray);

		// Remove a specific one character String from the ArrayList
		testArray.remove("¥");

		// Print out the ArrayList missing the one character String
		System.out.println("Contents: " + testArray);

		// Remove an entry of the ArrayList based on its index
		testArray.remove(15);

		// Print out the ArrayList with the entry removed via its index
		System.out.println("Contents: " + testArray);

		// Clear the contents of the ArrayList
		testArray.clear();

		// Fill the ArrayList with numbers
		for (int i = 0; i < 10; i++) {
			testArray.add(i);
		}

		// Insert a string between the existing entries of the ArrayList
		testArray.add(4, "@");

		// Print out the contents of the ArrayList
		System.out.println("Contents: " + testArray);

		// Clear the contents of the ArrayList
		testArray.clear();
		System.out.println("");

		/*
		 A quick demonstration of how the substring method works.
		 */
		String testString = "Hello!";

		// Fill the Array List with alternating numbers and spaces
		for (int i = 0; i < testString.length() + 1; i++) {
			testArray.add(i);
			testArray.add(" ");
		}

		// Print out the contents of the ArrayList
		for (int i = 0; i < testArray.size(); i++) {
			System.out.print(testArray.get(i));
		}
		System.out.println();

		// Clear the contents of the ArrayList
		testArray.clear();

		// Fill the ArrayList with alternating one character Strings and spaces
		testArray.add(" ");
		for (int i = 0; i < testString.length(); i++) {
			testArray.add(testString.charAt(i) + "");
			testArray.add(" ");
		}

		// Print out the contents of the ArrayList
		for (int i = 0; i < testArray.size(); i++) {
			System.out.print(testArray.get(i));
		}
		System.out.println();

		// Clear the contents of the ArrayList
		testArray.clear();

		// Fill the Array List with alternating numbers and spaces
		for (int i = 0; i < testString.length(); i++) {
			testArray.add(" ");
			testArray.add(i);
		}

		// Print out the contents of the ArrayList
		for (int i = 0; i < testArray.size(); i++) {
			System.out.print(testArray.get(i));
		}
		System.out.println();
	}

}
