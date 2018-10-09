package br.com.bytebank.Conta;

import br.com.bytebank.Cliente.Cliente;

public class ContaVinicius {

	private String numero;
	private int agencia;
	private Cliente titular;
	private double saldo;

	public ContaVinicius( int agencia, String numero, Cliente titular, double saldo) 
	{
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
		this.titular = titular;
	}

	public void depositar(double valor){
		
		if ( this.saldo < 0 ) 
		{
			System.out.println("ERRO- O valor deve ser maior que zero");
			return;
		}
		else  this.saldo += valor;

	}

	public boolean sacar(double valor) {

		if ( valor > this.saldo ) 
		{
			System.out.println("ERRO- Saldo insuficiente");
			return false;
		}
		else 
		{
			this.saldo -= valor;
			return true;
		}

	}

	public boolean transferir(double valor, ContaVinicius destino) {
		
		if ( valor > this.saldo ) 
		{
			System.out.println("ERRO- Saldo insuficiente");
			return false;
		}
		else
		{
			this.saldo -= valor;
			destino.depositar(valor);
			return true;
		}
	}

	public void extrato(ContaVinicius conta) {
		System.out.println(conta.saldo); 
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public String getTitular() {
		return titular.getNome();
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
}
