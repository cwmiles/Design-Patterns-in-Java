/**
 * 
 * @author Cort Miles
 * This class sets the instance variables for patient and their allergies
 */
import java.util.ArrayList;
public class Patient {
	private int id;
	private String firstName;
	private String lastName;
	private ArrayList<String> allergies = new ArrayList<String>();
	/**
	 * 
	 * @param id
	 * @param firstName
	 * @param lastName 
	 * This method constructs all of the instance variables
	 */
	public Patient(int id, String firstName, String lastName) 
	{
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		
	}
	/**
	 * 
	 * @param allergy is passed in and then the method adds the variable
	 */
	public void addAllergy(String allergy)
	{
		allergies.add(allergy);
	}
	/**
	 * This toString method adds the allergies to the string depending on the patient using if statements and for loops
	 * and returns the completed string for the patient.
	 */
	public String toString()
	{
		String all = "";
		
		if(allergies.size() > 0)
		{
			all = "\n\tAllergies: ";
		}
		
		for (int i = 0; i<allergies.size();i++)
		{
			if(i+1 == allergies.size())
			{
				all += allergies.get(i).toString();
			}
			else 
			{
				all +=  allergies.get(i).toString()+", ";
			}
			
		}
		return "Patient " + (id+1) + ": " + firstName + " " + lastName + all + "\n";
	}
}
