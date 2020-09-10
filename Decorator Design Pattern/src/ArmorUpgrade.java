/**
 * 
 * @author Cort Miles
 *This class allows a player to have an armor ugrade and updates their stats
 */
public class ArmorUpgrade extends PlayerDecorator {
	private Player player;
	/**
	 * 
	 * @param player is passed into the public method and upgrades the specific players stats
	 */
	public ArmorUpgrade(Player player) {
		this.player = player;
	}
	/**
	 * @return returns the players string and displays that the armor was upgraded
	 */
	public String toString()
	{
		return player.toString() + "\nUpgraded armor";
	}
	/**
	 * @return returns the new power of the player after updated
	 */
	public double getPower()
	{
		return player.getPower() + 3;
	}

}
