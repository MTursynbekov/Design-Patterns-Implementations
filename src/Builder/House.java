package Builder;

//Using the Builder pattern makes sense only when your products
//are quite complex and require extensive configuration. 
public class House 
{
	// A house can have a swimming pool, garage and garden.
    // Different types of houses (simple house, mansion,
    // cottage or cabin) might have different features installed.
	private int windows;
	private int doors;
	private int rooms;
	private boolean hasSwimmingPool;
	private boolean hasGarage;
	private boolean hasGarden;
	
	{
		this.hasSwimmingPool = false;
		this.hasGarage = false;
		this.hasGarden = false;
	}
	
	public int getWindows() 
	{
		return windows;
	}
	
	public void setWindows(int windows) 
	{
		this.windows = windows;
	}
	
	public int getDoors() 
	{
		return doors;
	}
	
	public void setDoors(int doors) 
	{
		this.doors = doors;
	}
	
	public int getRooms() 
	{
		return rooms;
	}
	
	public void setRooms(int rooms) 
	{
		this.rooms = rooms;
	}
	
	public boolean isHasSwimmingPool() 
	{
		return hasSwimmingPool;
	}
	
	public void setHasSwimmingPool(boolean hasSwimmingPool) 
	{
		this.hasSwimmingPool = hasSwimmingPool;
	}
	
	public boolean isHasGarage() 
	{
		return hasGarage;
	}
	
	public void setHasGarage(boolean hasGarage) 
	{
		this.hasGarage = hasGarage;
	}
	
	public boolean isHasGarden() 
	{
		return hasGarden;
	}
	
	public void setHasGarden(boolean hasGarden) 
	{
		this.hasGarden = hasGarden;
	}
}
