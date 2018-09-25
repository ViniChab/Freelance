class Conta{
	double saldo; //atributos
	int agencia;
	int numero;
	String titular;
	
	public void depositar(double valor){
		
		this.saldo += valor;
		
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
