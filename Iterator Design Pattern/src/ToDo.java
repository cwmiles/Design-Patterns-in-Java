/**
 * 
 * @author Cort Miles
 * This class creates the private variables and then initializes them in the ToDo class and returns
 * the price in the method getPrice and also converts all of the info to a string in the toString 
 * method
 */
import java.util.ArrayList;
public class ToDo {
	private String title;
	private String description;
	private double price;
	private String contact;
	private ArrayList<String> supplies;
	/**
	 * ToDo[] method takes in the following params and constructs them.
	 * @param title
	 * @param description
	 * @param price
	 * @param contact
	 * @param supplies
	 * .
	 */
	public ToDo(String title, String description, double price, String contact, ArrayList<String> supplies)
	{
		this.title = title;
		this.description = description;
		this.price = price;
		this.contact = contact;
		this.supplies = supplies;
	}
	/**
	 * 
	 * @return This method returns the price
	 */
	public double getPrice()
	{
		return price;
	}
	/**
	 * This toString method returns all of the data in a String form but also creates a string
	 * to be returned for the list supplies
	 */
	public String toString()
	{
		String SL = "";
		for(String supply: supplies) 
		{
			SL += "- " + supply + "\n";
		}
		return "\n***** " + title + " *****\n" + description + "\n" + "Business Contact: " +
				contact + "\nSupply List:\n"+ SL +"Price: $" + price +"\n";
	}
}
