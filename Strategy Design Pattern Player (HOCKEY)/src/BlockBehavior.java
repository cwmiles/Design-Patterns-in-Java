/*
 * Written by Cort Miles
 */
public class BlockBehavior implements DefenseBehavior {
	double e = Math.random()*3;//random number to help pick which behavior using probabilities
	public String play()//this method determines what message is displayed
	{
		if(e<=1)
		{
			return "blocks player from passsing";
		}
		else if(e>1 && e<=2)
		{
			return "blocks player from shooting";
		}
		else
		{
			return "checks player with puck";
		}
	}
}
