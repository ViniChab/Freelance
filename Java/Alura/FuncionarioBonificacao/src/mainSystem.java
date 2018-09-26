
public class mainSystem {

	public static void main(String[] args) {
		
		Funcionario novoFuncionario = new Funcionario(); 
		novoFuncionario.setName("Vinícius dos Santos Chab");
		novoFuncionario.setCPF("111.222.333-44");
		novoFuncionario.setSalario(4956.00);
		
		double salarioTotal = novoFuncionario.getSalario() + novoFuncionario.getBonificacao();

		System.out.println(novoFuncionario.getName());
		System.out.printf
		(
				"\nSalário base: %.2f\nBonificação: %.2f\nSalário Total: %.2f\n", 
				novoFuncionario.getSalario(), novoFuncionario.getBonificacao(),
				salarioTotal
		);
	}
}
