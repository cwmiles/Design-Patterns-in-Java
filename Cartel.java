/*
 * Written by Cort Miles
 */
import java.util.ArrayList;
public class Cartel implements Observer {
	//instance variables 
	private Subject cook;
	private ArrayList<Sighting> sightings;
	
	public Cartel(Subject cook) // constructors for variables and the array
	{
		this.cook = cook;
		cook.registerObserver(this);
		sightings = new ArrayList<Sighting>();
	}
	
	public void update(String location, String description) // updates array with the new sighting (location and description)
	{
		sightings.add(new Sighting(location,description));
	}
	
	public String getLog()
	{
		String spottings = ""; // variable to store the entire string that needs to be returned
		for (Sighting sighting : sightings) //for loop to add the specific data to the string in the proper format
		{
			spottings = spottings + sighting.getLocation() + " (" + sighting.getDetails() + ")" + "\n";
		}
		return spottings;// returns the data  to the user through the console.
	}
}
