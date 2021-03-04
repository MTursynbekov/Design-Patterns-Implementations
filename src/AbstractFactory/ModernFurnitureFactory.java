package AbstractFactory;

//Concrete factories produce a family of products that belong
//to a single variant. The factory guarantees that the
//resulting products are compatible. Signatures of the concrete
//factory's methods return an abstract product, while inside
//the method a concrete product is instantiated.
public class ModernFurnitureFactory implements FurnitureFactory 
{

	@Override
	public Chair createChair() 
	{
		// TODO Auto-generated method stub
		return new ModernChair();
	}

	@Override
	public Sofa createSofa() 
	{
		// TODO Auto-generated method stub
		return new ModernSofa();
	}

	@Override
	public CoffeeTable createCoffeeTable() 
	{
		// TODO Auto-generated method stub
		return new ModernCoffeeTable();
	}
}
