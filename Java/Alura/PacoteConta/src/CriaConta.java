
public class CriaConta {

	public static void main(String[] args) {
		
		Conta minhaConta = new Conta(); //a partir de agora, posso  usar Conta como um tipo
		//funciona pq ele reconhece a classe conta do mesmo pacote
		minhaConta.saldo = 200;
		System.out.println(minhaConta.saldo);
		
	}

}
