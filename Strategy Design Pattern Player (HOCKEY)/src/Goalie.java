/*
 * Written by Cort Miles
 */
public class Goalie extends Player {
	public Goalie(String name) //constructors within the class
	{
		super(name);
		setOffenseBehavior();
		setDefenseBehavior();
	}
	public void setOffenseBehavior() //setters specify what behavior the goalie is using
	{
		offenseBehavior = new BlockGoalBehavior();
	}
	public void setDefenseBehavior()
	{
		defenseBehavior = new BlockGoalBehavior();
	}
	public String toString() //this to string prints out the name and position of player
	{
		return "The player " + name + " is a Goalie";
	}
	
}
