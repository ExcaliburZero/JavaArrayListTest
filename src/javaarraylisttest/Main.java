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
	}
	
}
