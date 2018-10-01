
public class Conta{
	private double saldo;
	private int agencia;
	private int numero;
	private String titular;
	
	public Conta(int agencia, int numero){
		
		setAgencia(agencia);
		setNumero(numero);
		
	}
	
	public double getSaldo(){
		return this.saldo;
	}
	
	public int getAgencia(){
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		
		if( agencia < 0 ) return;
		else this.agencia = agencia;

	}
	
	public int getNumero(){
		return this.numero;
	}
	
	public void setNumero(int numero) {
		
		if ( numero < 1000000 ) return;
		else this.numero = numero; 
		
	}

	
	public String getTitular() {
		return titular;
	}


	public void setTitular(String titular) {
		this.titular = titular;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public void depositar(double valor){

		if ( valor < 0 ) return;
		else this.saldo += valor;
		
	}

	public boolean sacar(double valor) {
		
		if( this.saldo >= valor ) {

			this.saldo -= valor;
			return true;

		} else 
			return false; 
		
	}
	
	public boolean transferir(double valor, Conta destino) {
		
		boolean saqueComSucesso = this.sacar(valor);
		
		if ( saqueComSucesso == true ) {
			destino.depositar(valor);
			return true;
		}else 
			return false;
		
	}
	
}
