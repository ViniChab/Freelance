package br.com.bytebank.Cliente;

public class Cliente {

	private String nome;
	private Double rendaMensal;
	private String emprego;
	private String endere�o;
	
	public Cliente(String nome, Double rendaMensal, String emprego, String endere�o) 
	{
		this.nome = nome;
		this.rendaMensal = rendaMensal;
		this.emprego = emprego;
		this.endere�o = endere�o;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getRendaMensal() {
		return rendaMensal;
	}
	public void setRendaMensal(Double rendaMensal) {
		this.rendaMensal = rendaMensal;
	}
	public String getEmprego() {
		return emprego;
	}
	public void setEmprego(String emprego) {
		this.emprego = emprego;
	}
	public String getEndere�o() {
		return endere�o;
	}
	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}
}
