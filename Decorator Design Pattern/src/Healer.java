/**
 * 
 * @author Cort Miles
 * This class extends player and sets values for the variables for the healer
 */
public class Healer extends Player{
	public Healer(String name)
	{
		super.name = name;
		this.intellect = 8;
		this.attack = 2;
		this.defense = 3;
		this.weapon = "Staff";
		this.armor = "Robe";
	}
	/**
	 * @return the players string which has his description
	 */
	public String toString() 
	{
		return "Healer: " + name + super.toString();
	}
}
