package br.com.caleum.financas.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //pedindo pro hibernate criar uma tabela como uma entidade do banco de dados
public class ContaVinicius {

	@Id //indica chave primária
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	//o generated value é um gerente do JPA que vai cuidar 
	//de coisas como auto-increment (que é o caso)
	private Integer ID;
	private String titular;
	private String numero;
	private String banco;
	private String agencia;
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
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String string) {
		this.numero = string;
	}
	
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String string) {
		this.agencia = string;
	}
	

}
