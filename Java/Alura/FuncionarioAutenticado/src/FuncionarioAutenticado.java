
public abstract class FuncionarioAutenticado extends Funcionario {

	private String senha;
	
	public void setSenha(String Novasenha) {
		
		if ( Novasenha.length() < 6 ) {
			System.out.println("Sua senha precisa conter mais que 5 dígitos");
			return;
		}
		else this.senha = Novasenha;
		 
	}
	
	public boolean autenticar(String senha) {
		
		if ( this.senha.equals(senha))  
		{ 
			System.out.println("Bem-vindo!");
			return true;
		} 
		else
		{
			System.out.println("Senha errada");
			return false;
		}
		
	}

}
