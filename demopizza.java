/*Chelsie Yan 
 * CSIT 321
 * Assignment 4
 * demopizza.java
 */
package demopizza;
import java.util.*;
public class demopizza {

	public static void main(String args[]){
		
		//Scanner to take user input
		Scanner sc = new Scanner(System.in);
		//I used these variables to hold the input for each question
		//I apologize if this wasn't what I was supposed to do.
		//This was how I was able to hold the inputs without typing them in directly
		String s;
		String t;
		String d;
		String a;
		
		//Ask the user what size pizza they want
		System.out.println("What size pizza would you like? (small, medium, large)");
		//Store the user input into s
		s = sc.nextLine();
		
		//Ask what toppings they want
		System.out.println("What pizza toppings would you like?");
		//Store the toppings the same as we do with size
		t = sc.nextLine();
		
		//sends the user input to Pizza class
		Pizza p1 = new Pizza(s, t);
		
		
		//Ask if this is for delivery and store the answer
		System.out.println("Is this delivery? There is a $5.00 fee. (y,n)");
		d = sc.nextLine();
		
		//if yes, ask the user what their address is and store it
		if (d.equals("y")) {
			System.out.println("What is your address?");
			//Store the address
			a = sc.nextLine();
			//A DeliveryPizza object is made if the user inputs "y"
			DeliveryPizza p2 = new DeliveryPizza(s,t,a);
			//display the order if delivery
			display(p2);
			displayDelivery(p2);
		}
		else {
			//display the order if NOT delivery
			display(p1);
		}
		
		//close the scanner
		sc.close();
		
	}
	//Initially had displayPizza() and displayDelivery() written here, 
	//changed it so if it is not delivery, delivery display does not even show
	public static void display(Pizza p) {
		p.displayPizza();
	}
	public static void displayDelivery(DeliveryPizza p) {
		p.displayDelivery();
	}
}
