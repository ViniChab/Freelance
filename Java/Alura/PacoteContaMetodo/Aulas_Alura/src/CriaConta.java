
public class CriaConta {

	public static void main(String[] args) {
		
		Conta minhaConta = new Conta(); 
		
		minhaConta.depositar(100); //usando meu método
		
		System.out.println(minhaConta.saldo);
		
		if (minhaConta.sacar(500) == true )
		System.out.println(minhaConta.saldo); //usando meu método
		
		else
		System.out.println("Saldo insuficiente");
		
	}

}
