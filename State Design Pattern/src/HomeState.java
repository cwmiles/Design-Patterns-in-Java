/**
 * 
 * @author fox6s
 * This class is state that implements the interface state and has the private variable Gameconsole
 */
public class HomeState implements State{
	private GameConsole gameConsole;
	/**
	 * 
	 * @param gameConsole
	 * This method constructs the game console
	 */
	public HomeState(GameConsole gameConsole)
	{
		this.gameConsole = gameConsole;
	}
	
	
	@Override
	/**
	 * This method in this state tells the user they are already on the home screen
	 */
	public void pressHomeButton()
	{
		System.out.println("You are already on the home screen.");
	}
	
	@Override
	/**
	 * This method sets the state to the Nintendo State and starts the nintendo
	 */
	public void pressNintendoButton()
	{
		System.out.println("\nStarting Nintendo...");
		gameConsole.setState(gameConsole.getNintendoState());
	}
	
	@Override
	/**
	 * This method sets the state to Xbox and starts the Xbox
	 */
	public void pressXBoxButton()
	{
		System.out.println("\nStarting Xbox...");
		gameConsole.setState(gameConsole.getXBoxState());
	}
	
	@Override
	/**
	 * This method when in the home state tells the user to pick a gaming system to play
	 */
	public void pressGameButton()
	{
		System.out.println("You have to pick a gaming system to play.");
	}
}

