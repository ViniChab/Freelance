
public class ContaPopuanca extends Conta {

	public ContaPopuanca(int agencia, int numero){
		
		super(agencia, numero);
		
	}
	
	@Override //sobrescreve um método já existente na classe mãe
	public boolean sacar(double valor) {		
		
		if( ( this.getSaldo() + 0.20 ) >= valor ) {

		this.setSaldo( this.getSaldo() - (valor + 0.20) );
		
		return true;

	} else return false; 
	
	}
	
}
