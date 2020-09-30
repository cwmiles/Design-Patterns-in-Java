/**
 * 
 * @author Cort Miles
 * This class creates a static hospital system and an array list patients that holds a patient
 *
 */
import java.util.ArrayList;
public class HospitalSystem{
	private ArrayList<Patient> patients = new ArrayList<Patient>();
	private static HospitalSystem hospitalSystem;
	/**
	 * 
	 * @returns This class gets an instance of Hospital system and creates one if an instance isnt
	 * already made and then returns the instance
	 */
	public static HospitalSystem getInstance()
	{
		if(hospitalSystem == null)
		{
			hospitalSystem = new HospitalSystem();
		}
		return hospitalSystem;
	}
	/**
	 * 
	 * @param firstName
	 * @param lastName
	 * @return
	 * This method adds a patient to the array patients and returns the id of the patient
	 */
	public int addPatient(String firstName, String lastName)
	{
		patients.add(new Patient(patients.size(),firstName,lastName));
		
		return patients.size()-1;
	}
	/**
	 * 
	 * @param id
	 * @return
	 * This method returns the ID of the patient
	 */
	public Patient getRecord(int id)
	{
			return patients.get(id);
	}
	/**
	 * 
	 * @param id
	 * @param allergy
	 * This method adds an allergy to a patient based off of their id
	 */
	public void addAllergy(int id, String allergy)
	{
		getRecord(id).addAllergy(allergy);
	}
	/**
	 * 
	 * @return
	 * This method returns all of the patients with their data to the user.
	 */
	public String getAllPatientsData()
	{
		String AP = "";
		for (int i = 0; i<patients.size();i++)
		{
			AP += patients.get(i).toString();
		}
		return AP;
	}
	
}
