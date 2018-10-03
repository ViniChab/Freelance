//Arithmetic Exception - Quando o problema é matemática
//POR EXEMPLO:

public static void main(String[] args) {
		
		int a = 3;
		int b = a/0;
		//não existe erro de compilação
		System.out.println(b);

		/* ERROR: Exception in thread "main" java.lang.ArithmeticException: / by zero
				at Exceptions.main(Exceptions.java:7)*/
	}
  
//NullPointerException - Quando você chama um ponteiro que não aponta pra nada
//POR EXEMPLO:

public static void main(String[] args) {

		exemplo exe = null; //exemplo é uma classe
		exe.ex(); //chamando um método qualquer
	
		/* ERROR: java.lang.NullPointerException
		at CriaConta.main(CriaConta.java:27)*/	
		
	}

//InputMismatchException - Quando o problema é matemática
//POR EXEMPLO:

public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int b;
		b = scan.nextInt();
		
		scan.close();
	}
