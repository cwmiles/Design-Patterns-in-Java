/*
 * Written by Cort Miles
 */
public class Forward extends Player {
	
	public Forward(String name) //constructors within the class
	{
		super(name);
		setOffenseBehavior();
		setDefenseBehavior();
	}
	public void setOffenseBehavior() //setters below choose which behavior to exibit
	{
		double x = Math.random()*2;
		if(x<1)
		{
			offenseBehavior = new PassBehavior();
		}
		else
		{
			offenseBehavior = new ShootBehavior();
		}
	}
	public void setDefenseBehavior()
	{
		double y = Math.random()*2;
		if(y<1)
		{
			defenseBehavior = new ChasePuckBehavior();
		}
		else
		{
			defenseBehavior = new BlockBehavior();
		}
	}
	public String toString() //to string method displays the player name and his position
	{
		return "The player " + name + " is a Forward";
	}
	
	
}
