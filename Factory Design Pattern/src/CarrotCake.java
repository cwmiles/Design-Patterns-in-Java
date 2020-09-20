/**
 * 
 * @author Cort Miles
 *This is a child class that extends from its parent, cake
 */
public class CarrotCake extends Cake {
	/**
	 * This sets all the instance variables to the data assigned for a Carrot cake.
	 */
	public CarrotCake()
	{
	name = "Carrot Cake";
	price = 54.99;
	numLayers = 2;
	shape = Shape.ROUND;
	flavor = "Carrot";
	icing = "Cream Cheese";
	decorations.add("Walnuts");
	decorations.add("Candy Carrots");
	}
}
