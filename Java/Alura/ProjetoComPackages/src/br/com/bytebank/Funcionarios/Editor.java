package br.com.bytebank.Funcionarios;

public class Editor extends Funcionario {

	public double getBonificacao() {
		return getSalario()*0.1 + 100;
	} 
	
}
