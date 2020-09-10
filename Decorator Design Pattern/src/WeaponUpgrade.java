/**
 * 
 * @author Cort Miles
 *This class allows a player to have an weapon ugrade and updates their stats
 */
public class WeaponUpgrade extends PlayerDecorator{
	private Player player;
	/**
	 * 
	 * @param player is passed into the public method and upgrades the specific players stats
	 */
	public WeaponUpgrade(Player player) {
		this.player = player;
	}
	/**
	 * @return returns the players string and displays that the armor was upgraded
	 */
	public String toString()
	{
		return player.toString() + "\nUpgraded weapon";
	}
	/**
	 * @return returns the new power of the player after updated
	 */
	public double getPower()
	{
		return player.getPower() + 5;
	}

}
