
public class CriaConta {

	public static void main(String[] args) {

		Conta ContaDoVinicius = new Conta();
		ContaDoVinicius.titular = new Cliente();
		ContaDoVinicius.titular.dadosFisica = new PessoaFisica();

		ContaDoVinicius.titular.dadosFisica.nome = "Vinícius dos Santos Chab";
		ContaDoVinicius.titular.dadosFisica.CPF  = "111.222.333-44";
		ContaDoVinicius.titular.dadosFisica.profissao = "Desenvolvedor";
		
		System.out.println(ContaDoVinicius.titular.dadosFisica.nome);
		
	}
}
