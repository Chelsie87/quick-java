/*Chelsie Yan 
 * CSIT 321
 * Assignment 5
 * recursion1.java
 * Question 1
 */
package recursion1;
import java.util.*;
public class recursion1 {
	static String input;
	static int vowel = 0;

	//Scanner to read user input
	static Scanner sc = new Scanner(System.in);
	
	static public void main(String[] args) {
		
		System.out.println("Please enter a string: ");
		
		//set variable to the input
		input = sc.nextLine();
		
		//prints the output
		//calls countVowels using user input string and the length of said input
		System.out.println("Total Vowels: " + countVowels(input, input.length()));
		
		
	}
	public static int checkVowel(char v) {
		//Question 1.
		//1. Write a recursive function that will return the number of vowels in a string. 
		//You will ask the user to enter the string.
		//a e i o u A E I O U
		//Y is a special case, and I will leave a note instead of including it as a vowel

		//if the character is a vowel, return 1
		if (v == 'a' || v == 'A' ||
			v == 'e' || v == 'E' ||
			v == 'i' || v == 'I' ||
			v == 'o' || v == 'O' ||
			v == 'u' || v == 'U') {
			return 1;
		}
		else
			//char is not a vowel so return 0
			return 0;		
		
	}
	//Recursive function to count vowels, takes the string input and the length of string
	public static int countVowels(String in, int len) {
		
		//base case: the string is 1 character
		if(len == 1)
			//if this happens, check the 1 character
			//return 1 if it is a vowel, 0 is not
			//check the input string char at index 0 (length counts starting at 1, so subtract 1) 
			return checkVowel(in.charAt(len-1));
		
		//If not the base case...
		//takes a string and gets the length
		//+ checks the char at the end to see if it is a vowel
		//once len == 1 (only 1 char left, will be the first char)
		//then the base case is met and will stop the recursion
		return countVowels(in, len-1) + checkVowel(in.charAt(len-1));	
	}
}

