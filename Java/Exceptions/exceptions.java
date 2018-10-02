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
  
