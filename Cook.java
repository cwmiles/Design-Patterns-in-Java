/*
 * Written by Cort Miles
 */

import java.util.ArrayList;

public class Cook implements Subject{
	//instance variables
	private String name = "";
	private ArrayList<Observer> observers;
	
	public Cook (String name)//constructors
	{
		this.name = name;
		observers = new ArrayList<Observer>();
	}
	
	public void registerObserver(Observer observer) //adds observers DEA and Cartel
	{
		observers.add(observer);
	}
	
	public void removeObserver(Observer observer) // removes observers
	{
		observers.remove(observer);
	}
	
	public void notifyObservers(String location, String description) //lets observers know about the cook and what he is doing
	{
		for(Observer observer : observers) // array that updates the observers of locations and description
		{
			observer.update(location, description);
		}
	}
	
	public String getName() //method returns the name
	{
		return name;
	}
	
	public void enterSighting(String location, String description) // registers when the cook was spotted and what he was doing and also notifies the observers of this
	{
		notifyObservers(location, description);
	}
	
}
