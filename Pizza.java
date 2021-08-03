/*Chelsie Yan 
 * CSIT 321
 * Assignment 4
 * Pizza.java
 */
package demopizza;

public class Pizza {
	//Pizza class needs to store size, toppings, and price
	//I decided these were best variable types to use
	public String size;
	public String toppings;
	public double price;
	
	//DeliveryPizza specific variables
	public String address;
	public String delivery;
	
	//Constructor needs size and toppings from demopizza
	public Pizza(String s, String t) {
		
			//I default delivery and address as if it were pickup
			size = s;
			toppings = t;
			price = 0.0;
			delivery = "No";
			address = "N/A";
			
			//Set the price depending on what the user input for size
			//I had to Google the syntax since I used size == "" and it did not work..
			//Strings are not primitive types in Java
			if (size.equals("small")) {
				price = 10.99;
			}
			else if (size.equals("medium")) {
				price = 14.99;
			}
			else if (size.equals("large")) {
				price = 18.99;
		}
			//if size does is not one of the 3 options, this error statement will appear and the program will exit
			else {
				System.out.println("Error, please check size input. Your options are 'small,' 'medium,' and 'large.'");
				System.exit(0);
			}
	
	}
	//These functions will return the information stored
	public String getSize() {
		return size;
	}
	public String getToppings() {
		return toppings;
	}
	public double getPrice() {
		return price;
	}
	//Update delivery function for DeliveryPizza (will be called if it is a delivery)
	protected void setDelivery() {
		delivery = "Yes";
	}
	public String getDelivery() {
		return delivery;
	}
	public String getAddress() {
		return address;
	}
	//display Pizza information
	public void displayPizza() {
		//Here I format the output and call functions from Pizza class to get info
				//I decided to show the inputs in upper case because it looked nicer
		System.out.println("\nYour Order: \n" + "Pizza size: " + getSize().toUpperCase() + 
				"\nPizza toppings: " + getToppings().toUpperCase() + "\nTotal Price: $" + getPrice());
	}
}

