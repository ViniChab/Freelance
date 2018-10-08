package br.com.bytebank.Cliente;

import br.com.bytebank.Services.Autenticado;

public class Cliente implements Autenticado{

	@Override
	public void setSenha(String Novasenha) {}

	@Override
	public boolean autenticar(String senha) {
		return false;
	}

}
