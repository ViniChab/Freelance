
public class Funcionario {

	private String name;
	private double salario;
	private String CPF;
	
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public double getSalario() 
	{
		return salario;
	}
	public void setSalario(double salario) 
	{
		this.salario = salario;
	}
	
	public String getCPF() 
	{
		return CPF;
	}
	public void setCPF(String cpf) 
	{
		CPF = cpf;
	}
	
	public double getBonificacao() {
		return this.salario*0.1;
	} //para o cáculo da bonificação
	
}     



























