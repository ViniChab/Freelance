class Conta{
	double saldo; //atributos
	int agencia;
	int numero;
	String titular;
	
	void depositar(double valor){
		
		this.saldo += valor;
		
	} 
	
	boolean sacar(double valor) {
		
		if( this.saldo >= valor ) {

			this.saldo -= valor;
			return true;

		} else { return false; }
		
	}
	
	/*primeiro indica o tipo do retorno, no caso 
	 nenhum (void) e dps funciona como uma função*/
}