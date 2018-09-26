
public class Conta{
	private double saldo; //atributos
	private int agencia;
	private int numero;
	private Cliente titular;
	
	//quando um atributo é privado, ele não pode ser afetado fora desse escopo
	
	
	public Conta(int agencia, int numero){
		
		setAgencia(agencia);
		setNumero(numero);
		
	} // isso é um construtor, ele sempre vai ser a primeira coisa a rodar
	//se ele tem parãmetros, ele vai exigir esses dados na hora de sua inicialização
	

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
	
	public Cliente getTitular(Cliente Tit){
		return this.titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	/*isso é encapsulamento, assim não posso afetar diretamente os atributos 
	em outro escopo, assim protegendo a integridade dos meus objetos */

	
	public void depositar(double valor){

		if ( valor < 0 ) return;
		else this.saldo += valor;
		
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
