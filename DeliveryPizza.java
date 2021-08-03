/*Chelsie Yan 
 * CSIT 321
 * Assignment 4
 * DeliveryPizza.java
 */
package demopizza;

//extends --> inherits from Pizza
public class DeliveryPizza extends Pizza{
	//DeliveryPizza needs an extra argument in the constructor for address; called a here
	public DeliveryPizza(String s, String t, String a)
	{
		//inherits the size and toppings from Pizza class
		super(s, t);
		//updates address from Pizza
		address = a;
		
		//sets delivery to "Yes"
		setDelivery();
		
		//The price is updated to add $5 on top of the size cost for the delivery fee
		//Adding with a double sometimes causes issues with output, but the math is correct
		price = price + 5;
	}
	//display Delivery information
	public void displayDelivery() {
		System.out.println("Delivery? " + getDelivery() + "\nAddress: " + getAddress().toUpperCase());
	}
}
