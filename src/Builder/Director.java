package Builder;

//The director is only responsible for executing the building
//steps in a particular sequence. It's helpful when producing
//products according to a specific order or configuration.
//Strictly speaking, the director class is optional, since the
//client can control builders directly.
public class Director
{
	private Builder builder;

	// The director works with any builder instance that the
    // client code passes to it. This way, the client code may
    // alter the final type of the newly assembled product.
	public void setBuilder(Builder builder) 
	{
		this.builder = builder;
	}
	
	// The director can construct several product variations
    // using the same building steps.
	public void buildSimpleHouse(Builder builder)
	{
		builder.reset();
		builder.setDoors(1);
		builder.setWindows(2);
		builder.setRooms(1);
	}
	
	public void buildMansion(Builder builder)
	{
		builder.reset();
		builder.setDoors(20);
		builder.setWindows(30);
		builder.setRooms(15);
		builder.setHasGarage(true);
		builder.setHasSwimmingPool(true);
		builder.setHasGarden(true);
	}
}
