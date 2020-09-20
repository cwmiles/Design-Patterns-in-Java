
public class Bakery{
	
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
	
	public Cake orderCake(String type)
	{
	
		Cake cake = createCake(type); 
		cake.createCake();
		System.out.println("Price: $" +cake.getPrice());
		
		return cake;
	}
	
}
