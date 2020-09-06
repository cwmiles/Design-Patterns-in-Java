/*
 * Written by Cort Miles
 */
public interface Subject {
	public void registerObserver (Observer observer); //adds observer
	public void removeObserver (Observer observer);//removes observer
	public void notifyObservers(String location, String description); //notifies observers when changes are made
}
