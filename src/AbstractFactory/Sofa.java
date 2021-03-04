package AbstractFactory;

//Here's the base interface of another product. All products
//can interact with each other, but proper interaction is
//possible only between products of the same concrete variant.
public interface Sofa 
{
	public boolean hasLegs();
	public boolean hasArmrest();
	public int getSeats();
	public void paint();
}

//Concrete products are created by corresponding concrete
//factories.
class VictorianSofa implements Sofa 
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
	public int getSeats() 
	{
		// TODO Auto-generated method stub
		return 3;
	}
	
	@Override
	public void paint() 
	{
		// TODO Auto-generated method stub
		System.out.print(" ---" + "\n" + "|---|" + "\n");
	}
}

class ModernSofa implements Sofa 
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
	public int getSeats() 
	{
		// TODO Auto-generated method stub
		return 3;
	}
	
	@Override
	public void paint() 
	{
		// TODO Auto-generated method stub
		System.out.print(" ___" + "\n" + "|___|" + "\n" + "|" + "___" + "|" + "\n");
	}
}