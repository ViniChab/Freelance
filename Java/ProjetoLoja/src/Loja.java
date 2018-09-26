import java.util.Scanner;

public class Loja {
	
	public static void header() {
		
		System.out.print("-------------------Welcome-------------------\nSource by ViniChab - ");
		System.out.println("Bakery Jonathann's\n\n");
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Estoque produto = new Estoque();
		
		header();
		System.out.print("\tPlease, type in the name of the product you want to add to the system: ");
		produto.name = scan.nextLine();
		
		do 
		{
			System.out.print("\n\tInform the price of this product: ");  
			while (!scan.hasNextFloat()) //método para checar se o valor é o esperado
		    {
		        System.out.println("\n\tThat's not a number!");
		        scan.next();
				System.out.print("\n\tInform the price of this product: ");  
		    }
			
			produto.changePrice(scan.nextFloat());

		} while (  produto.price() <= 0 );
		
		do 
		{
			System.out.print("\n\tPlease, type in the quantity of this product in stock: ");  
			while (!scan.hasNextInt())
		    {
		        System.out.println("\n\tThat's not a number!");
		        scan.next();
				System.out.print("\n\tPlease, type in the quantity of this product in stock: ");  
		    }
			
			produto.changeQuantity(scan.nextInt());

		} while (  produto.quantity() <= 0 );
		
		System.out.println("\tNew product added succesfully, here's the details: \n");
		System.out.println("\tName: "  + produto.name);
		System.out.printf("\tPrice: %.2f\n", produto.price());
		System.out.println("\tQuantity: "  + produto.quantity());
		
		produto.addProduct(15);
		System.out.println("\n\tMore products have been added to stock! \n\tNew stock: " + produto.quantity() );
		
		produto.removeProduct(7);
		System.out.println("\n\tSome products have been removed from stock! \n\tNew stock: " + produto.quantity() );
		
	}

}
