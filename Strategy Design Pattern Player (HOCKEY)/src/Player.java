/*Written by Cort Miles*/

public abstract class Player {
	//initial variables witht their names and types
	protected String name;
	protected DefenseBehavior defenseBehavior;
	protected OffenseBehavior offenseBehavior;
	private boolean offense;
	
	public Player(String name)//constructor 
	{
		this.name = name;
		setDefenseBehavior();
		setOffenseBehavior();
	}
	
	public void setDefenseBehavior()//void setters that set the current behavior to null
	{
		defenseBehavior = null;
	}
	
	public void setOffenseBehavior()
	{
		offenseBehavior = null;
	}
	
	public void turnover()// runs to create a turnover in the hockey game 
	{
		if (offense == true)
		{
			offense = false;
		}
		else
		{
			offense = true;
		}
		
	}
	public String play() //this string method returns the behavior play that was just made
	{
		if(offense == false)
		{
			return offenseBehavior.play();
		}
		else
		{
			return defenseBehavior.play();
		}
	}
	
}
