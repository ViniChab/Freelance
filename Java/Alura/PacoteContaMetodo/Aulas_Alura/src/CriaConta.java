
public class CriaConta {

	public static void main(String[] args) {

		Conta minhaConta = new Conta(); 
		Conta outraConta = new Conta(); 
		
		minhaConta.depositar(400); //usando meu método
		
		System.out.println("Saldo da minha conta: " + minhaConta.saldo);
		System.out.println("Saldo da conta destino: " + outraConta.saldo);
		
		if ( minhaConta.transferir(512, outraConta) == true ) 
		{
			System.out.println("Novo saldo da minha conta: " + minhaConta.saldo);
			
			System.out.println("Transferência realizada com sucesso\n"
			+ "Saldo da conta destino: " + outraConta.saldo );
			
		} else System.out.println("Saldo insuficiente para a transferência");
		
	}

}
