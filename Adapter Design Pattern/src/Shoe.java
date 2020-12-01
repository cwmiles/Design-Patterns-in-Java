/**
 * 
 * @author fox6s
 * This class implements shoe listing, and has the private instance variables String brand,
 * string name, double cost, and string description.
 */
public class Shoe implements ShoeListing {
	private String brand;
	private String name;
	private double cost;
	private String description;
	/**
	 * 
	 * @param brand
	 * @param name
	 * @param cost
	 * @param description
	 * this is the constructor for the instance variables brand, name, cost, and description
	 */
	public Shoe(String brand, String name, double cost, String description) {
		setBrand(brand);
		setName(name);
		setCost(cost);
		setDescription(description);
	}
	/**
	 * 
	 * @param brand
	 * This method sets this.brand to brand
	 */
	private void setBrand(String brand) {
		this.brand = brand;
	}
	/**
	 *
	 * @param name
	 * This method sets this.name to name
	 */
	private void setName(String name) {
		this.name = name;
	}
	/**
	 * 
	 * @param cost
	 * This method sets this.cost to cost
	 */
	private void setCost(double cost) {
		this.cost = cost; 
	}
	/**
	 * 
	 * @param description
	 * This method sets this.description to description
	 */
	private void setDescription(String description) {
		this.description = description;
	}
	/**
	 * This method returns the brand with the name and cost and description
	 */
	public String toString() {
		return "Brand: " + brand + "\nName: " + name + "\nPrice: " + cost + "\nDescription: " + description;
	}
}
