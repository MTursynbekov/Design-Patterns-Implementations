package Builder;

//The builder interface specifies methods for creating the
//different parts of the product objects.
public interface Builder 
{	
	public void reset();
	public void setWindows(int windows);
	public void setDoors(int doors);
	public void setRooms(int rooms);
	public void setHasSwimmingPool(boolean hasSwimmingPool);
	public void setHasGarage(boolean hasGarage);
	public void setHasGarden(boolean hasGarden);
}
