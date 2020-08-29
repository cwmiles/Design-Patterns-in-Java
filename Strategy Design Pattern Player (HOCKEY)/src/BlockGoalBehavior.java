/*
 * Written by Cort Miles
 */
public class BlockGoalBehavior implements DefenseBehavior,OffenseBehavior { 
	double e = Math.random()*4; //random number helps making selection process easier and random
	public String play() //this class uses a random number to decide what block goal message is displayed
	{
		if(e<=1)
		{
			return "hand blocks the puck";
		}
		else if(e>1 && e<=2)
		{
			return "catches the puck";
		}
		else if(e>2 && e<=3)
		{
			return "blocks puck with knee pads";
		}
		else 
		{
			return "blocks puck with stick";
		}
	}
}
