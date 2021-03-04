package Factory;

//Concrete creators override the factory method to change the
//resulting product's type.
public class RoadLogistics extends Logistics
{
	@Override
	public Transport createTransport() {
		// TODO Auto-generated method stub
		return new Truck();
	}
}


