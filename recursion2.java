/*Chelsie Yan 
 * CSIT 321
 * Assignment 5
 * recursion1.java
 * Question 2
 */
package recursion2;
import java.util.*;
public class recursion2 {
	static String input;
	static int num;
	//Scanner to read user input
	static Scanner sc = new Scanner(System.in);
	
	static public void main(String[] args) {
		
		System.out.println("Please enter any integer, preferably a multi-number one: ");
		
		//set variable to the input
		input = sc.nextLine();
		
		//change the string input to int
		num = Integer.parseInt(input);
		
		//prints the output
		System.out.print("Your number reversed: ");
		
		//Calls the function using the user's input as the param
		reverseNum(num);

	}
	//Recursive function that takes an int as a parameter
	public static void reverseNum(int r) {
		//Question 2:	
		//Write a recursive function that receives an integer as a parameter and returns the numbers reversed.  
		//Ask the user to enter the number.
		
		//Base case: The last digit is less than 10 (0-9)
		//If this happens, the 1 digit is printed and the recursion ends
		if (r < 10) {
			System.out.println(r);
			return;
		}
		//Otherwise, by using number mod 10,
		else {
			//we can always get the one's place digit and print it
			System.out.print(r % 10);
			
			//We use ints, so they do not include decimal points
			//int 1249 / 10 = 124 NOT 124.9
			//The recursive call will continue until it reaches the base case above
			reverseNum(r / 10);
		}
	}
}
