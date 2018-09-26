
public class Estoque 
{

	String name;
	private float price;
	private int quantity;
	
	public double price() {
		return price;
		
	}public int quantity() {
		return quantity;
	}

	public boolean changePrice(float value) 
	{
		
		if ( value <= 0 ) 
		{
			System.out.print("\n\tYou can't add a zero/negative value as a price\n");
			return false;
		}
		
		else 
		{
			price = value;
			return true;
		}
	}	
	
	public boolean changeQuantity(int value) 
	{
		
		if ( value <= 0 )
		{
			System.out.println("\n\tYou can't add a zero/negative value as a quantity");
			return false;
		}
		
		else 
		{
			quantity = value;
			return true;
		}
	}
	
	public void addProduct( int value ) {
		
		this.quantity += value;
		
	}

	public void removeProduct( int value ) {
		
		this.quantity -= value;
		
	}
	
}
