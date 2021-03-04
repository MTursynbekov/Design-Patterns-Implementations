package Factory;

public class Client {
	
	// The client code works with an instance of a concrete
    // creator, albeit through its base interface. As long as
    // the client keeps working with the creator via the base
    // interface, you can pass it any creator's subclass.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Initialization and use	 of different concrete creators.
		Logistics roadLogistics = new RoadLogistics();
		roadLogistics.planDelivery();
		
		Logistics seaLogistics = new SeaLogistics();
		seaLogistics.planDelivery();
	}

}
