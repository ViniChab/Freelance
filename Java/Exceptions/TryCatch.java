public static void main(String[] args) {

		try 
		{
			int a = 1/0;
			System.out.println("It worked! a = " + a);
		}
		catch (ArithmeticException err) 
		{
			System.out.println("ERROR - ArithmeticException");
		}
		
		System.out.println("The program keeps running");
	}
