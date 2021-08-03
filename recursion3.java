/*Chelsie Yan 
 * CSIT 321
 * Assignment 5
 * recursion1.java
 * Question 3
 */
package recursion3;
import java.util.*;
public class recursion3 {
	static String input;
	static int num1;
	static int num2;
	static int total;
	//Scanner to read user input
	static Scanner sc = new Scanner(System.in);
	
	static public void main(String[] args) {
		
		System.out.println("Please enter any integer greater than zero: ");
		
		//set variable to the input
		input = sc.nextLine();
		
		//change the string input to int
		num1 = Integer.parseInt(input);
		//set total equal to num1 user input for later use
		total = num1;
		
		//Second number input + storing
		System.out.println("Please enter a second integer greater than zero: ");
		input = sc.nextLine();
		num2 = Integer.parseInt(input);
		
		//prints the output + calls recursive function
		System.out.print(num1 + " to the power of " + num2 + " = ");
		recursion3(num1, num2);
		
	}
	public static void recursion3(int n1, int n2) {
		//3. Write recursive function that receives 2 integer parameters 
		//and returns the first parameter raised to the power of the 2nd parameter.  
		//Ask the user to enter 2 integers greater than 0.   
		//ex: 2^5 = 2 x 2 x 2 x 2 x 2

		//Error if n1 or n2 are 0 or lower +
		//the program will terminate
		if (n1-1 <= -1 || n2-1 <= -1) {
			System.out.println("Error, please enter an integer greater than zero.");
			System.exit(0);
		}
		//Base case: If n2 (the power) is 1, print n1
		//n1^1 = n1
		else if (n2-1 == 0) {
			System.out.print(total);
			return;
		}
		//Other cases are when n2 > 1... so 2+
		else {
			//Keep track of total so n1 can stay the same int multiplier
			//total = total * n1
			total *= n1;
			
			//call recursion using the same user n1 int, and every call subtract
			//n2 by 1 until it reaches 0 (meaning it has multiplied that many times)
			recursion3(n1, n2 - 1);
		}
	}
}