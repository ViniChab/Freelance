
public class CriaConta {

	public static void header() {

		System.out.println("\t------------Welcome----------");
		System.out.println("\tSource by ViniChab\n\n");

	}

	public static void main(String[] args) {

		Conta conta = new Conta(1675, 4831952);
		Conta novaConta = new Conta(8469, 2894678);
		Conta novaConta2 = new Conta(4539, 9517632);
		Conta novaConta3 = new Conta(3725, 1179457);
		Conta novaConta4 = new Conta(7958, 1547965);
		Conta novaConta5 = new Conta(7354, 9816156);
		Conta novaConta6 = new Conta(7385, 7841516);
		Conta novaConta7 = new Conta(3144, 3211998);
		Conta novaConta8 = new Conta(4458, 7894162);
		Conta novaConta9 = new Conta(7826, 1968465);
		
		System.out.println("\n\tTotal: " + Conta.getTotal());
	}
}
