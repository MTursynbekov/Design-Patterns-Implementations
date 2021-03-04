package AbstractFactory;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Initializations of factories.
		FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
		FurnitureFactory modernFactory = new ModernFurnitureFactory();
		
		// Use of factories.
		Client client1 = new Client(victorianFactory);
		Client client2 = new Client(modernFactory);
		
		client1.createFurniture();
		client2.createFurniture();
		
		client1.paint();
		client2.paint();
		
	}

}
