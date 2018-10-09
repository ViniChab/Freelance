package br.com.bytebank.Cliente;

public class Cliente {

	private String nome;
	private Double rendaMensal;
	private String emprego;
	private String endereço;
	
	public Cliente(String nome, Double rendaMensal, String emprego, String endereço) 
	{
		this.nome = nome;
		this.rendaMensal = rendaMensal;
		this.emprego = emprego;
		this.endereço = endereço;
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
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
}
