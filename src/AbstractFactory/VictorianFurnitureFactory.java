package AbstractFactory;

//Each concrete factory has a corresponding product variant.
public class VictorianFurnitureFactory implements FurnitureFactory 
{

	@Override
	public Chair createChair() 
	{
		// TODO Auto-generated method stub
		return new VictorianChair();
	}

	@Override
	public Sofa createSofa() 
	{
		// TODO Auto-generated method stub
		return new VictorianSofa();
	}

	@Override
	public CoffeeTable createCoffeeTable() 
	{
		// TODO Auto-generated method stub
		return new VictorianCoffeeTable();
	}
}
