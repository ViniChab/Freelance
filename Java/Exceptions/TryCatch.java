public static void main(String[] args) {

		try 
		{
			int a = 1/0;
			System.out.println("It worked! a = " + a);
		}
		catch (ArithmeticException ex) 
		{
			String err = ex.getMessage(); //mensagem (tipo / by zero)
			System.out.println("ERROR - ArithmeticException " + err);
			ex.printStackTrace(); /*mostra os métodos que ele passou atravessado 
			 					   antes de ser resolvido, e onde o erro ocorreu*/
		}
		
		System.out.println("The program keeps running");
	}
