/**
 * 
 * @author fox6s
 * This class implements product listing and has the private instance variables String title,
 * double price, and string description
 */
public class Product implements ProductListing {

	private String title;
	private double price;
	private String description;
	/**
	 * 
	 * @param title
	 * @param price
	 * @param description
	 * This is the constructor for the instance variables
	 */
	public Product(String title, double price, String description) {
		setTitle(title);
		setPrice(price);
		setDescription(description);
	}
	/**
	 * This method returns the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * 
	 * @param title
	 * This method sets the title
	 */
	private void setTitle(String title) {
		this.title = title;
	}
	/**
	 * This method gets the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * 
	 * @param price
	 * This method sets the price
	 */
	private void setPrice(double price) {
		this.price = price;
	}
	/**
	 * This method gets the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * This method sets the description
	 */
	private void setDescription(String description) {
		this.description = description;
	}
}
