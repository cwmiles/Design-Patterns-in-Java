/**
 * 
 * @author Cort Miles
 *This abstract class initializes the player and the instance variables
 */
public abstract class Player {
	protected String name;
	protected int intellect;
	protected int defense;
	protected int attack;
	protected String weapon;
	protected String armor;
	
	/**
	 * 
	 * @return returns a double which is their power value
	 */
	public double getPower()
	{
		return attack*3 + defense + intellect/2;
	}
	
	/**
	 * @return returns a generic string for the player
	 */
	public String toString()
	{
		return "\nCarries a " + weapon + ", and wears a " + armor;
	}
}
