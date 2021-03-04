package AbstractFactory;

//Each distinct product of a product family should have a base
//interface. All variants of the product must implement this
//interface.
public interface Chair 
{
	public boolean hasLegs();
	public boolean hasArmrest();
	public void paint();
}

//Concrete products are created by corresponding concrete
//factories.
class VictorianChair implements Chair 
{

	@Override
	public boolean hasLegs() 
	{
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean hasArmrest() 
	{
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void paint() 
	{
		// TODO Auto-generated method stub
		System.out.print("|_" + "\n" + "| |" + "\n");
	}
}

class ModernChair implements Chair 
{

	@Override
	public boolean hasLegs() 
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasArmrest() 
	{
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public void paint() 
	{
		// TODO Auto-generated method stub
		System.out.print("|_" + "\n" + " _|" + "\n");
	}
}
