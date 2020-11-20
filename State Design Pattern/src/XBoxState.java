/**
 * 
 * @author fox6s
 * This is the class Xbox state that implements the interface state
 * This class has the instance variables gameconsole and string array of games
 */
public class XBoxState implements State{
	private GameConsole gameConsole;
	private String[] games;
	/**
	 * 
	 * @param gameConsole
	 * This is the constructor for the class initializing the game console and filling the array games
	 */
	public XBoxState(GameConsole gameConsole)
	{
		this.gameConsole = gameConsole;
		games = new String[5];
		games[0] = "Apex Legends";
		games[1] = "Dauntless";
		games[2] = "Rocket League";
		games[3] = "Smite";
		games[4] = "Warframe";
	}
	
	
	@Override
	/**
	 * This method switches to the home screen state and tells the user that
	 */
	public void pressHomeButton()
	{
		System.out.println("\nDisplay Home Screen...");
		gameConsole.setState(gameConsole.getHomeState());
	}
	
	@Override
	/**
	 * This method switches to the nintendo state and tells the user that
	 */
	public void pressNintendoButton()
	{
		System.out.println("\nStarting Nintendo...");
		gameConsole.setState(gameConsole.getNintendoState());
	}
	
	@Override
	/**
	 * This method tells the user you are already viewing the Xbox state
	 */
	public void pressXBoxButton()
	{
		System.out.println("\nYou are already viewing Xbox");
	}
	
	@Override
	/**
	 * This method prints the array list of games so the user can see the games they have.
	 */
	public void pressGameButton()
	{
		System.out.println("You have the following games:");
		for(int i =0; i<5 ;i++)
		{
			System.out.println(games[i]);
		}

	}
}
