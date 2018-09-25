
public class CriaConta {

	public static void main(String[] args) {

		Conta ContaDoVinicius = new Conta();
		ContaDoVinicius.titular = new Cliente();
		ContaDoVinicius.titular.dadosFisica = new PessoaFisica();

		Conta ContaPadaria = new Conta();
		ContaPadaria.titular = new Cliente();
		ContaPadaria.titular.dadosJuridica = new PessoaJuridica();

		ContaDoVinicius.titular.dadosFisica.nome = "Vinícius dos Santos Chab";
		ContaDoVinicius.titular.dadosFisica.CPF  = "111.222.333-44";
		ContaDoVinicius.titular.dadosFisica.profissao = "Desenvolvedor";

		ContaPadaria.titular.dadosJuridica.nome = "Padaria São Josué";
		ContaPadaria.titular.dadosJuridica.CNPJ = "11.222.333/4444-55";
		ContaPadaria.titular.dadosJuridica.area = "Alimentícia";

		System.out.println(ContaDoVinicius.titular.dadosFisica.CPF);
		System.out.println(ContaPadaria.titular.dadosJuridica.CNPJ);

	}
}
