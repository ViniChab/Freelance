
public class mainSystem {

	public static void main(String[] args) {
		
		Funcionario novoFuncionario = new Funcionario(); 
		novoFuncionario.setName("Vin�cius dos Santos Chab");
		novoFuncionario.setCPF("111.222.333-44");
		novoFuncionario.setSalario(4956.00);
		
		double salarioTotal = novoFuncionario.getSalario() + novoFuncionario.getBonificacao();

		System.out.println(novoFuncionario.getName());
		System.out.printf
		(
				"\nSal�rio base: %.2f\nBonifica��o: %.2f\nSal�rio Total: %.2f\n", 
				novoFuncionario.getSalario(), novoFuncionario.getBonificacao(),
				salarioTotal
		);
	}
}
