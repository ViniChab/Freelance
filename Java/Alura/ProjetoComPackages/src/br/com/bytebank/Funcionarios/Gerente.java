package br.com.bytebank.Funcionarios;

import br.com.bytebank.Services.Autenticado;

public class Gerente extends Funcionario implements Autenticado {
	
	@SuppressWarnings("unused")
	private String senha;
	
	public double getBonificacao() {
		return this.getSalario();
	}

	@Override
	public void setSenha(String Novasenha) {
		this.senha = Novasenha;
	}

	@Override
	public boolean autenticar(String Novasenha) {
		
		if ( senha.equals(Novasenha) ) {
			System.out.println("Bem-vindo!");
			return true;
		}
		else {
			System.out.println("Senha incorreta");
			return false;
		}
	}

}
 