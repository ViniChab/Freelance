class Conta{
	private double saldo; //atributos
	private int agencia = 194 ;
	private int numero;
	private Cliente titular;
	
	//quando um atributo � privado, ele n�o pode ser afetado fora desse escopo

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
	}/*isso � encapsulamento, assim n�o posso afetar diretamente os atributos 
	   em outro escopo, assim protegendo a integridade dos meus objetos */

	
	public void depositar(double valor){

		this.saldo += valor;

	} //m�todo para dep�sito

	public boolean sacar(double valor) {
		
		if( this.saldo >= valor ) {

			this.saldo -= valor;
			return true;

		} else 
			return false; 
		
	} //m�todo para sacar
	
	public boolean transferir(double valor, Conta destino) {
		
		boolean saqueComSucesso = this.sacar(valor);
		
		if ( saqueComSucesso == true ) {
			destino.depositar(valor);
			return true;
		}else 
			return false;
		
	} //m�todo para transferir
}
