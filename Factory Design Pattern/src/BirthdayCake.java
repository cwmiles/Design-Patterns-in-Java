/**
 * 
 * @author Cort Miles
 *This is a child class that extends from its parent, cake
 */
public class BirthdayCake extends Cake{
	/**
	 * This sets all the instance variables to the data assigned for a Birthday cake.
	 */
	public BirthdayCake()
	{
		name = "Birthday Cake";
		price = 109.99;
		numLayers = 1;
		shape = Shape.SHEET;
		flavor = "Funfetti";
		icing = "Vanilla";
		decorations.add("Sprinkles");
		decorations.add("Candy Flowers");
		decorations.add("Icing Writing");
	}
}
