
public class CriaConta {

	public static void header() {

		System.out.println("\t------------Welcome----------");
		System.out.println("\tSource by ViniChab\n\n");

	}

	public static void main(String[] args) {

		Conta conta = new Conta(1675, 4831952);
		System.out.println("\tConta: " + conta.getAgencia() + "-" + conta.getNumero());
	}
}
