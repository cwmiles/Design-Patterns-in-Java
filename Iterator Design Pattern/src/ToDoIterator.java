/**
 * 
 * @author Cort Miles
 * This class creates the iterator and checks if it has next value
 * This class also has the instance variables int position and ToDo[] todos
 */
import java.util.Iterator;

public class ToDoIterator {
	private ToDo[] todos;
	private int position = 0;
	/**
	 * 
	 * @param todos this method makes the iterator for the ToDo[] array list todos.
	 */
	public ToDoIterator(ToDo[] todos)
	{
		this.todos = todos;
	}
	/**
	 * 
	 * @return if the todos list checks to see if the has next value is null
	 */
	public boolean hasNext()
	{
		return position < todos.length && todos[position] != null;
	}
	/**
	 * 
	 * @return null if hasNext isn't true and switches position in the ToDo[] array todos.
	 */ 
	public ToDo next()
	{
		if(!hasNext()) return null;
		ToDo toDo = todos[position];
		position++;
		return toDo;
	}
}
