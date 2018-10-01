
public class CriaConta {

	public static void header() {

		System.out.println("\t------------Welcome----------");
		System.out.println("\tSource by ViniChab\n\n");

	}

	public static void main(String[] args) {

		header();

		Conta contaCorrente = new ContaCorrente(1789, 6578618);
		Conta contaPoupanca = new ContaPopuanca(2567, 5349768);
		contaCorrente.depositar(150.00);
		
		System.out.println("\t" + contaCorrente.getSaldo() + "\n\t" + contaPoupanca.getSaldo() );
		
		contaCorrente.transferir(50.00, contaPoupanca);

		System.out.println("\n\t" + contaCorrente.getSaldo() + "\n\t" + contaPoupanca.getSaldo() );
		
		contaPoupanca.sacar(40.00);
		contaCorrente.sacar(12.00);

		System.out.printf("\n\t%.2f\n", contaPoupanca.getSaldo() );
		System.out.println("\n\t" + contaCorrente.getSaldo() );
		
	}
}
