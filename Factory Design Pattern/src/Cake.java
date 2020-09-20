/**
 *Written by Cort Miles
 *
 *this class contains all of the instance variables used for cake and other methods
 * 
 */
import java.util.ArrayList;

public abstract class Cake {
	
	protected String name;
	protected double price;
	protected int numLayers;
	protected String flavor;
	protected Shape shape;
	protected String icing;
	protected ArrayList<String> decorations = new ArrayList<String>();
	
	/**
	 * 
	 * @return this method returns the price of the cake
	 */
	public double getPrice()
	{
		return this.price;
	}
	/**
	 * This method creates the the cake and calls other methods to do so.
	 */
	public void createCake()
	{
		createLayers();
		frostCake();
		addDecorations();
	}
	/**
	 * This method displays the cake and what cake is being created and its description/stats
	 */
	private void createLayers()
	{
		if (shape == Shape.CUPCAKES)
		{
			System.out.println("Creating "+ this.flavor + " cupcakes.");
		}
		else if(shape == Shape.BUNT)
		{
			System.out.println("Creating a " + this.flavor + " bunt cake.");
		}
		else if(numLayers == 1 )
		{
			System.out.println("Creating a 1 layer " + this.shape.toString().toLowerCase() +" "+ this.flavor + " cake.");	
		}
		else if (numLayers > 1)
		{
			System.out.println("Creating a " + this.numLayers + " layered " + this.shape.toString().toLowerCase() +" "+ this.flavor + " cake.");
		}
		else //this is for the Square cake.
		{
			System.out.println("Creating a " +this.numLayers + " layered " + this.shape.toString().toLowerCase() + " "+ this.flavor + " cake.");
		}
	}
	/**
	 * This method prints out what type of icing is being used on the cake.
	 */
	private void frostCake()
	{
		System.out.println("Frost cake with " + icing + " icing.");
	}
	/**
	 * This method displays the decorations on the cake and adds them.
	 */
	private void addDecorations()
	{
		for(String decorations : decorations) // array that updates the observers of locations and description
		{
			System.out.println("Adding " + decorations + ".");
		}
	}
}
