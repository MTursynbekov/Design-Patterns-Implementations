package Singletone;

public class Database {
	// The field for storing the singleton instance.
	private static Database db;
	// The field for storing sql query.
	public String query;
	
	// The singleton's constructor should always be private to
    // prevent direct construction calls with the `new`
    // operator.
	private Database() { }
	
	// The static method that controls access to the singleton
    // instance.
	public static Database getDb() 
	{
		if(Database.db == null)
		{
			// Note: if you're creating an app with 
			// multithreading support, you should 
			// place a thread lock here.
			
			// Creating a new object on its first call.
			Database.db = new Database();
		}
		
		// The method should always return that instance, 
		//which created on its first call, on all subsequent calls.
		return Database.db;
	}
	
	// all database queries of an app go
    // through this method.
	public void getQuery(String query)
	{
		// Storing sql query from the user.
		this.query = query;
	}
}

