package Factory;

//The creator class declares the factory method that must
//return an object of a product class. The creator's subclasses
//usually provide the implementation of this method.
public abstract class Logistics 
{
	// The creator may also provide some default implementation
    // of the factory method.
	public abstract Transport createTransport();
	
	// Note that, despite its name, the creator's primary
    // responsibility isn't creating products. It usually
    // contains some core business logic that relies on product
    // objects returned by the factory method. Subclasses can
    // indirectly change that business logic by overriding the
    // factory method and returning a different type of product
    // from it.
	public void planDelivery()
	{
		// Call the factory method to create a product object.
		Transport transport = createTransport();
		// Now use the product.
		transport.delivery();
	}
}