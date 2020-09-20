/**
 * 
 * @author Cort Miles
 *
 *this class bakery has the create cake method and order cake method within it
 */
public class Bakery{
	 
	/**
	 * 
	 * @param String type (takes in a string called type)
	 * @return this method returns the type of cake that is being created and creates it
	 */
	private Cake createCake(String type)
	{
		Cake cake;
		
		if(type.equalsIgnoreCase("carrot cake"))
		{
			cake = new CarrotCake();
		}
		else if(type.equalsIgnoreCase("black forest cake"))
		{
			cake = new BlackForestCake();
		}
		else if(type.equalsIgnoreCase("Birthday Cake"))
		{
			cake = new BirthdayCake();
		}
		else
		{
			cake = new BirthdayCake();
		}
		
		return cake;
	}
	/**
	 * 
	 * @param String type (takes in a string called type)
	 * @return this method returns the cake and prints out all the information regarding the cake
	 */
	public Cake orderCake(String type)
	{
	
		Cake cake = createCake(type); 
		cake.createCake();
		System.out.println("Price: $" +cake.getPrice());
		
		return cake;
	}
	
}
