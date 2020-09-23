/**
 * 
 * @author Cort Miles
 *	This class creates the contractors to do list and adds tasks to it while also giving the ability 
 * 	to return the address and total cost of the job.
 * 	This class also has the instance variables string address, int count, and the ToDo array todos
 */
import java.util.ArrayList;
public class ContractorToDoList {
		private String address;
		private ToDo[] todos;
		private int count;
		/**
		 * 
		 * @param address is passed into the method and is constructed and todos is now a new array of
		 * size 2
		 */
		public ContractorToDoList(String address)
		{
			todos = new ToDo[2];
			this.address = address;
		}
		/**
		 * The parameters are passed in and used to create a new ToDo which is then put into the array
		 * todos. The function also doubles the array todos size if the end of it is reached
		 * @param title
		 * @param description
		 * @param price
		 * @param contact
		 * @param supplies
		 */
		public void addToDo(String title, String description, double price, 
				String contact, ArrayList<String> supplies)
		{
			ToDo todo = new ToDo(title,description,price,contact,supplies);
			if(count>=todos.length)	
			{
				todos = growArray(todos);
			}
			todos[count] = todo;
			count ++;
		}
		/**
		 * 
		 * @param todos is passed in and a new ToDo array temp with the prev size doubled is created. 
		 * The temp array gets all of the data from the old array and is now returned. 
		 * @return
		 */
		private ToDo[] growArray(ToDo[] todos)
		{
			ToDo[] temp = new ToDo[todos.length*2];
			for (int i=0; i<todos.length;i++ )
			{
				temp[i] = todos[i]; 
			}
			return temp;
		}
		/**
		 * 
		 * @return a new iterator for todos
		 */
		public ToDoIterator createIterator()
		{
			return new ToDoIterator(todos);
		}
		/**
		 * 
		 * @return the address
		 */
		public String getAddress()
		{
			return address;
		}
		/**
		 * 
		 * @return the total cost for a job the contractor is asked to do by created and new double 
		 * and looping through the array to get the price each todo for the customer.
		 */
		public double getTotalCost()
		{
			double gtc = 0;
			for(int i =0 ;i<todos.length-1;i++)
			{
				gtc += todos[i].getPrice();
			}
			return gtc;
		}
		
}
