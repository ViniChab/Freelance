package br.com.bytebank.Funcionarios;

import br.com.bytebank.Services.Autenticado;

public class Diretor extends Funcionario implements Autenticado {
	
	public double getBonificacao() {
		return (this.getSalario() + 340);
	}

	@Override
	public void setSenha(String Novasenha) {}

	@Override
	public boolean autenticar(String senha) {
		return false;
	}
	
}
 