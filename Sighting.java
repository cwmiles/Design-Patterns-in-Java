/*
 * Written by cort Miles
 */
public class Sighting { //class for the cartel observers
	//instance variables
	private String location;
	private String details;
	
	public Sighting(String location, String details) //constructors
	{
		this.location = location;
		this.details = details;
	}
	
	public String getLocation() //returns the location for the cartel
	{
		return location;
	}
	
	public String getDetails() //returns the details which are also known as the description for the cartel
	{
		return details;
	}
}
