public static void main(String[] args) {

	exemplo exe = null;

		
	try 
	{
		exe.ex();
		int a = 1/0;
	}
	catch (NullPointerException | ArithmeticException err ) 
	{
		System.out.println("ERROR - " + err.getMessage());
	}
		
	System.out.println("The program keeps running");

    }
}
