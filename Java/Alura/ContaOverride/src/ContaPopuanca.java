
public class ContaPopuanca extends Conta {

	public ContaPopuanca(int agencia, int numero){
		
		super(agencia, numero);
		
	}
	
	@Override //sobrescreve um m�todo j� existente na classe m�e
	public boolean sacar(double valor) {		
		
		if( ( this.getSaldo() + 0.20 ) >= valor ) {

		this.setSaldo( this.getSaldo() - (valor + 0.20) );
		
		return true;

	} else return false; 
	
	}
	
}
