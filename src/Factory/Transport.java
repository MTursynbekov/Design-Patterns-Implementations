package Factory;

//The product interface declares the operations that all
//concrete products must implement.
public interface Transport 
{	
	public void delivery();
}

//Concrete products provide various implementations of the
//product interface.
class Truck implements Transport
{
	// Delivery of a cargo by a truck. 
	@Override
	public void delivery() {
		// TODO Auto-generated method stub
		System.out.println("Deliver by land in a box");
	}
}

class Ship implements Transport
{
	// Delivery of a cargo by a ship.
	@Override
	public void delivery() {
		// TODO Auto-generated method stub
		System.out.println("Deliver by sea in a container");
	}
}