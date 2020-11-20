/**
 * 
 * @author fox6s
 * This is the NintendoState class that implements the interface state
 * This has the instance variables gameconsole and a string array of games
 */
public class NintendoState implements State
{
	private GameConsole gameConsole;
	private String[] games;
	
	/**
	 * 
	 * @param gameConsole
	 * This is the constructor for the string games and the game console
	 */
	public NintendoState(GameConsole gameConsole)
	{
		this.gameConsole = gameConsole;
		games = new String[5];
		games[0] = "SmashBros";
		games[1] = "Pokemon";
		games[2] = "Tetris";
		games[3] = "Mario Kart";
		games[4] = "Mario Party 8";
	}

	@Override
	/**
	 * This method switches to homescreen state
	 */
	public void pressHomeButton()
	{
		System.out.println("\nDisplaying Home Screen...");
		gameConsole.setState(gameConsole.getHomeState());
	}
	
	@Override
	/**
	 * This method tells the user they are already in the nintendo state
	 */
	public void pressNintendoButton()
	{
		System.out.println("You are already viewing Nintendo");
	}
	
	@Override
	/**
	 * This method switched to the Xbox state and tells the user that
	 */
	public void pressXBoxButton()
	{
		System.out.println("\nStarting Xbox...");
		gameConsole.setState(gameConsole.getXBoxState());
	}
	
	@Override
	/**
	 * This method prints out the nintendo games for the user
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
