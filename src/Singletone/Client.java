package Singletone;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Database db = Database.getDb();
		db.getQuery("SELECT * FROM movies WHERE movies.genre = 'comedy'");
		
		Database anotherDb = Database.getDb();
		anotherDb.getQuery("SELECT * FROM movies WHERE movies.genre = 'fantasy'");
		
		// If you see the same value, then singleton was reused,
		// If you see different values, then 2 singletons were created.
		System.out.println(db.query);
		System.out.println(anotherDb.query);
	}

}
