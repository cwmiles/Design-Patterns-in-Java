/**
 * 
 * @author fox6s
 * This is the Game console class that uses all of the states
 * This class has the instance state variables xboxstate, nintendostate, homestate and state
 */
public class GameConsole {
	private State HomeState;
	private State NintendoState;
	private State XBoxState;
	
	private State state;
	/**
	 * This method is the constructor for all the instance variables and sets the state to homestate to start
	 */
	public GameConsole()
	{
		System.out.println("Starting up the Game Console");
		HomeState = new HomeState(this);
		NintendoState = new NintendoState(this);
		XBoxState = new XBoxState(this);
		state = HomeState;
		
	}
	/**
	 * This method calls the homebutton method for the state its in
	 */
	public void pressHomeButton()
	{
		state.pressHomeButton();
	}
	/**
	 * THis method calls the nintendo button for the state it is in
	 */
	public void pressNintendoButton()
	{
		state.pressNintendoButton();
	}
	/**
	 * This method calls the nintendo button for the state it is in
	 */
	public void pressXBoxButton()
	{
		state.pressXBoxButton();
	}
	/**
	 * This method calls the game button for the state it is in
	 */
	public void pressGameButton()
	{
		state.pressGameButton();
	}
	/**
	 * 
	 * @param state
	 * This method sets the current state to the state passed in
	 */
	public void setState(State state)
	{
		this.state = state;
	}
	/**
	 * 
	 * @return
	 * This method returns the homestate
	 */
	public State getHomeState()
	{
		return HomeState;
	}
	/**
	 * 
	 * @return
	 * This method returns the nintendostate
	 */
	public State getNintendoState()
	{
		return NintendoState;
	}
	/**
	 * 
	 * @return
	 * This method returns the xbox state
	 */
	public State getXBoxState()
	{
		return XBoxState;
	}
	
}
