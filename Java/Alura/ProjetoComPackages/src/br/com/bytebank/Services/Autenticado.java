package br.com.bytebank.Services;

public abstract interface Autenticado {

	public abstract void setSenha(String Novasenha) ;
	
	public abstract boolean autenticar(String senha) ;

}
//uma interface s� aceita m�todos abstratos