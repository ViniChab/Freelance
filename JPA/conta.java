
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //pedindo pro hibernate criar uma tabela como uma entidade do banco de dados
public class conta {

	@Id //indica chave primária
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	//o generated value é um gerente do JPA que vai cuidar 
	//de coisas como auto-increment (que é o caso)
	private Integer ID;
	private String titular;
	private int numero;
	private String banco;
	private int agencia;
	//tudo isso são colunas de uma tablea gerada pelo jpa
	
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	

}
