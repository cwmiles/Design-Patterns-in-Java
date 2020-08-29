/*
 * Written by Cort Miles
 */
public class Defenseman extends Player{
	public Defenseman(String name)//constructors for the class
	{
		super(name);
		setDefenseBehavior();
		setOffenseBehavior();
	}
	public void setOffenseBehavior() //setters below decide what behavior to implement using the random probabilities
	{
		double x = Math.random()*10;
		if(x<9)
		{
			offenseBehavior = new PassBehavior();
		}
		else
		{
			offenseBehavior = new SlapShotBehavior();
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
	public String toString() //this method displays the players name and his position
	{
		return "The player " + name + " is a defenseman";
	}
}
