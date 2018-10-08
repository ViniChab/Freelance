package br.com.bytebank.Services;

public abstract interface Autenticado {

	public abstract void setSenha(String Novasenha) ;
	
	public abstract boolean autenticar(String senha) ;

}
//uma interface só aceita métodos abstratos