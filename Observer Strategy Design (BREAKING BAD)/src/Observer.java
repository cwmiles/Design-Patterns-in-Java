/*
 * Written by Cort Miles
 */
public interface Observer {
	//simple interface that is used to return get the logs and update the locations and descriptions of the cook
	public void update(String location, String description);
	public String getLog();
}
