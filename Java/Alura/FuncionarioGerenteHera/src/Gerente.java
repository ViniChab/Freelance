
public class Gerente extends Funcionario {
	
	private String senha;
	
	public boolean autenticar(String senha) {
		
		if ( this.senha == senha ) return true;
		else return false;
		
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		
		if (senha.length() < 6 ) 
		{
			System.out.println("\n\tSua senha deve conter mais de 5 digitos");
			return;			
		}

		else this.senha = senha;
		
	}
	
	public double getBonificacao() {
		return this.getSalario();
	} //para o cáculo da bonificação do gerente
	

}
