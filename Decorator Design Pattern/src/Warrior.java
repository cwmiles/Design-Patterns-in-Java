/**
 * 
 * @author Cort Miles
 *This class extends player and sets values for the variables for the warrior
 */
public class Warrior extends Player
{
	
	public Warrior(String name) 
	{
		super.name = name;
		this.intellect = 2;
		this.attack = 8;
		this.defense = 5;
		this.weapon = "Sword";
		this.armor = "Breast Plate";
	}
	/**
	 * @return the players string which has his description
	 */
	public String toString() 
	{
		return "Warrior: " + name + super.toString();
	}
}