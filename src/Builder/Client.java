package Builder;

//The client code creates a builder object, passes it to the
//director and then initiates the construction process. The end
//result is retrieved from the builder object.
public class Client {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Director director = new Director();
		
		HouseBuilder builder = new HouseBuilder();
		director.buildSimpleHouse(builder);
		House house = builder.getHouse();
		
		director.buildMansion(builder);
		
		// The final product is often retrieved from a builder
        // object since the director isn't aware of and not
        // dependent on concrete builders and products.
		House mansion = builder.getHouse();
		
		System.out.println("This house has " + house.getWindows() + " windows, "
				+ house.getDoors() + " door and " + house.getRooms() + " room.");
	}

}
