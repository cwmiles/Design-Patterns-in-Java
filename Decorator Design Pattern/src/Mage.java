/**
 * 
 * @author Cort Miles
 * This class extends player and sets values for the variables for the Mage
 */
public class Mage extends Player{
	
	public Mage(String name) 
	{
		super.name = name;
		this.intellect = 7;
		this.attack = 3;
		this.defense = 4;
		this.weapon = "Staff";
		this.armor = "Robe";
	}
	/**
	 * @return the players string which has his description
	 */
	public String toString() 
	{
		return "Mage: " + name + super.toString();
	}
}
