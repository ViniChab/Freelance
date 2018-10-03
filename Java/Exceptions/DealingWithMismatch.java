public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a;
		boolean workingInput = false;
		
		while( workingInput == false )
		{
			try {
				System.out.print("Digite um valor para a: ");
				a = scan.nextInt();
				System.out.println(a);
				workingInput = true;
			}catch(Exception err){
				System.out.println("Por favor, tente novamente");
				workingInput = false;
				scan.next();
			}
		} 
		
		scan.close();
		
	}
}
