package AbstractFactory;

//Here's the base interface of another product. All products
//can interact with each other, but proper interaction is
//possible only between products of the same concrete variant.
public interface CoffeeTable 
{
	public boolean hasLegs();
	public void paint();
}

//Concrete products are created by corresponding concrete
//factories.
class VictorianCoffeeTable implements CoffeeTable 
{

	@Override
	public boolean hasLegs() 
	{
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	public void paint() 
	{
		// TODO Auto-generated method stub
		System.out.println(" ___" + "\n" + "|   |" + "\n");
	}
}

class ModernCoffeeTable implements CoffeeTable 
{

	@Override
	public boolean hasLegs() 
	{
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public void paint()
	{
		System.out.println(" ___" + "\n" + "|___|" + "\n");
	}
}