public class CriaConta {

	public static void main(String[] args) {
		
		Conta minhaConta = new Conta(); //a partir de agora, posso  usar Conta como um tipo
		//funciona pq ele reconhece a classe conta do mesmo pacote
		minhaConta.saldo = 300;
		
		Conta outraConta = minhaConta; 
		// duas flechas para a mesma classe, NÃO SÃO DOIS OBJETOS IGUAIS

		System.out.println(minhaConta.saldo);
		System.out.println(outraConta.saldo); //aqui, temos duas flechas pra messma conta
		
		//no fim, temos apenas uma conta
		
		//prova =>
		
		minhaConta.saldo += 100;
		
		System.out.println(outraConta.saldo);
		
	}

}
