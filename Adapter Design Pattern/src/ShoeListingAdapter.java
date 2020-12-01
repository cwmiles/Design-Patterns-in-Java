/**
 * 
 * @author fox6s
 * this class implements productlisting and gets the brand and everything of the shoe and constructs the private 
 * variables below from the string 
 */
public class ShoeListingAdapter implements ProductListing {
	
	private ShoeListing shoe;
	private String title;
	private String brand;
	private double price;
	private String description;
	/**
	 * 
	 * @param shoe
	 * This method takes a shoe and gets the brand, title, price, and description of the shoe to display it to the user
	 */
	public ShoeListingAdapter(ShoeListing shoe) {
		this.shoe = shoe;
		brand = shoe.toString().substring(shoe.toString().indexOf(' '), shoe.toString().indexOf('\n', 1));;
		String x = shoe.toString().substring(shoe.toString().indexOf('\n', 1));
		title = x.substring(x.indexOf(' '),x.indexOf('\n', 1));
		x = cut(x);
		price = Double.parseDouble(x.substring(x.indexOf(' '), x.indexOf('\n', 1)));
		x = cut(x);
		description = x.substring(x.indexOf(' '));
	}
	/**
	 * this method returns the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * This method returns the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * 
	 * @param string
	 * @return
	 * This method is used in the shoelistingadapter constructor to help simplify code
	 */
	public static String cut(String string)
	{
		return string.substring(string.indexOf('\n', 1));	
	}
	/**
	 * This method gets the description
	 */
	public String getDescription() {
		return "Created by" + brand + "," + description;
	}
	

}
