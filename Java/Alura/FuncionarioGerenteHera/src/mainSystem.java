
public class mainSystem {

	public static void main(String[] args) {
		
		Funcionario novoFuncionario = new Funcionario(); 
		novoFuncionario.setName("Vin�cius dos Santos Chab");
		novoFuncionario.setCPF("111.222.333-44");
		novoFuncionario.setSalario(2587.00);
		
		Gerente novoGerente = new Gerente();
		novoGerente.setName("Binichiru Santosu Shiyabu");
		novoGerente.setCPF("444.555.666-77");
		novoGerente.setSalario(3152.80);

		System.out.println("Funcion�rio comum: " + novoFuncionario.getName());
		System.out.printf
		(
				"\nSal�rio base: %.2f\nBonifica��o: %.2f\nSal�rio Total: %.2f\n", 
				novoFuncionario.getSalario(), novoFuncionario.getBonificacao(),
				novoFuncionario.salarioTotal()
		);		
		
		System.out.println("\n\nGerente: " + novoGerente.getName());
		System.out.printf
		(
				"\nSal�rio base: %.2f\nBonifica��o: %.2f\nSal�rio Total: %.2f\n", 
				novoGerente.getSalario(), novoGerente.getBonificacao(),
				novoGerente.salarioTotal()
		);
	}
}
