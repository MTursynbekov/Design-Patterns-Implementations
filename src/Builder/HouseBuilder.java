package Builder;

// The concrete builder classes follow the builder interface and
//provide specific implementations of the building steps. Your
//program may have several variations of builders, each
//implemented differently.
public class HouseBuilder implements Builder 
{
	private House house;
	
	// A fresh builder instance should contain a blank product
    // object which it uses in further assembly.
	HouseBuilder()
	{
		this.reset();
	}

	// The reset method clears the object being built.
	@Override
	public void reset()
	{
		// TODO Auto-generated method stub
		this.house = new House();
	}

	// All production steps work with the same product instance.
	@Override
	public void setWindows(int windows) 
	{
		// Set the number of windows in the house.
		house.setWindows(windows);
	}

	@Override
	public void setDoors(int doors)
	{
		// Set the number of doors in the house.
		house.setDoors(doors);
	}

	@Override
	public void setRooms(int rooms) 
	{
		// Set the number of rooms in the house.
		house.setRooms(rooms);
	}

	@Override
	public void setHasSwimmingPool(boolean hasSwimmingPool) 
	{
		// Install a swimming pool.
		house.setHasSwimmingPool(hasSwimmingPool);
	}

	@Override
	public void setHasGarage(boolean hasGarage) 
	{
		// Install a garage.
		house.setHasGarage(hasGarage);
	}

	@Override
	public void setHasGarden(boolean hasGarden) 
	{
		// Install a garden.
		house.setHasGarden(hasGarden);
	}
	
	// Concrete builders are supposed to provide their own
    // methods for retrieving results. That's because various
    // types of builders may create entirely different products
    // that don't all follow the same interface. Therefore such
    // methods can't be declared in the builder interface (at
    // least not in a statically-typed programming language).
    //
    // Usually, after returning the end result to the client, a
    // builder instance is expected to be ready to start
    // producing another product. That's why it's a usual
    // practice to call the reset method at the end of the
    // `getProduct` method body. However, this behavior isn't
    // mandatory, and you can make your builder wait for an
    // explicit reset call from the client code before disposing
    // of the previous result.
	public House getHouse()
	{
		House result = this.house;
		this.reset();
		return result;
	}

}
