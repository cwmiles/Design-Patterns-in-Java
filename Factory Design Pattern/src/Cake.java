/**
 * Written by Cort Miles
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
	
	public double getPrice()
	{
		return this.price;
	}
	
	public void createCake()
	{
		createLayers();
		frostCake();
		addDecorations();
	}
	
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
			System.out.println("Creating a 1 layer " + this.shape +" "+ this.flavor + " cake.");	
		}
		else if (numLayers > 1)
		{
			System.out.println("Creating a " + this.numLayers + " layered " + this.shape +" "+ this.flavor + " cake.");
		}
		else //this is for the Square cake.
		{
			System.out.println("Creating a " +this.numLayers + " layered " + this.shape+ " "+ this.flavor + " cake.");
		}
	}
	
	private void frostCake()
	{
		System.out.println("Frost cake with " + icing + " icing.");
	}
	
	private void addDecorations()
	{
		for(String decorations : decorations) // array that updates the observers of locations and description
		{
			System.out.println("Adding " + decorations + ".");
		}
	}
}
