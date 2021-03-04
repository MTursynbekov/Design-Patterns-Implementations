package AbstractFactory;

//The client code works with factories and products only
//through abstract types: FurnitureFactory, Chair, Sofa and CoffeeTable. This
//lets you pass any factory or product subclass to the client
//code without breaking it.
public class Client 
{
	private FurnitureFactory factory;
	private Chair chair;
	private Sofa sofa;
	private CoffeeTable coffeeTable;
	
	Client(FurnitureFactory factory)
	{
		this.factory = factory;
	}
	
	public void createFurniture()
	{
		this.chair = factory.createChair();
		this.sofa = factory.createSofa();
		this.coffeeTable = factory.createCoffeeTable();
	}
	
	public void paint()
	{
		chair.paint();
		sofa.paint();
		coffeeTable.paint();
		System.out.println("\n");
	}
}


