/*
 * Written by Cort Miles
 */
import java.util.ArrayList;
public class DEA implements Observer {
	//instance variables for the DEA class
	private Subject cook;
	private ArrayList<String> locations;
	private String notes;
	
	public DEA(Subject cook)//constructors
	{
		this.cook = cook;
		cook.registerObserver(this);
		locations = new ArrayList<String>(); //initiates the array
		notes = "";
	}
	
	public void update(String location, String description) //updates the DEA's data on the cook by adding locations to the array and notes to the string
	{
		locations.add(location);
		notes += description + "\n";
	}
	
	public String getLog() // this method displays the locations followed by the notes in the format specified
	{
		String places = ""; // variable used to store the data from the locations to return one list of the locations
		for(String location : locations)// the for loop to all locations to the variable above.
		{
			places += location + "\n";
		}
		return "Locations:\n" + places + "\nNotes: \n" + notes; // prints the data to the user in the console
	}
}
