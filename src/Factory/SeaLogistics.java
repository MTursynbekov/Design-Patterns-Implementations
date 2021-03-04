package Factory;

//Concrete creators override the factory method to change the
//resulting product's type.
public class SeaLogistics extends Logistics
{
	@Override
	public Transport createTransport() {
		// TODO Auto-generated method stub
		return new Ship();
	}
}

