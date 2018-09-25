import java.util.Scanner;

public class CriaConta {

	public static void header() {

		System.out.println("\t------------Welcome----------");
		System.out.println("\tSource by ViniChab\n\n\n");

	}

	public static void main(String[] args) {

		Cliente cliente = new Cliente();

		Scanner scan = new Scanner(System.in);
		header();

		System.out.print("\tSeja bem-vindo ao TaleCorp.Bank! \n \tVocê está prestes a abrir uma nova conta. "
							+ "\n\tPor favor, entre seu nome completo: ");

		cliente.nome = scan.nextLine();

		System.out.print("\n\tPor favor, " + cliente.nome + " entre seu CPF: ");

		cliente.CPF = scan.nextLine();

		System.out.print("\n\tPor favor, " + cliente.nome + " entre sua profissão: ");

		cliente.profissao = scan.nextLine();

		System.out.println("\n\tConsulte seus dados\n");
		System.out.println("\tNome: " + cliente.nome 
							+ "\n\tCPF: " + cliente.CPF 
							+ "\n\tProfissão: " + cliente.profissao);

	}
}
