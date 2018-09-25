class Conta{
	private double saldo; //atributos
	private int agencia = 194 ;
	private int numero;
	private Cliente titular;
	
	//quando um atributo é privado, ele não pode ser afetado fora desse escopo

	public double saldo(){
		return saldo;
	}
	public int agencia(){
		return agencia;
	}
	public int numero(){
		return numero;
	}
	public Cliente titular(){
		return titular;
	}/*isso é encapsulamento, assim não posso afetar diretamente os atributos 
	   em outro escopo, assim protegendo a integridade dos meus objetos */

	
	public void depositar(double valor){

		this.saldo += valor;

	} //método para depósito

	public boolean sacar(double valor) {
		
		if( this.saldo >= valor ) {

			this.saldo -= valor;
			return true;

		} else 
			return false; 
		
	} //método para sacar
	
	public boolean transferir(double valor, Conta destino) {
		
		boolean saqueComSucesso = this.sacar(valor);
		
		if ( saqueComSucesso == true ) {
			destino.depositar(valor);
			return true;
		}else 
			return false;
		
	} //método para transferir
}
