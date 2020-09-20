/**
 * 
 * @author Cort Miles
 *This is a child class that extends from its parent, cake
 */
public class BlackForestCake extends Cake {
	/**
	 * This sets all the instance variables to the data assigned for a blackforest cake.
	 */
	public BlackForestCake()
	{
		name = "Black Forest Cake";
		price = 47.99;
		numLayers = 3;
		shape = Shape.ROUND;
		flavor = "Black Forest";
		icing = "Whipped Cream";
		decorations.add("Cherries");
		decorations.add("Chocolate Flakes");
		decorations.add("Whipped Cream");
	}
}
