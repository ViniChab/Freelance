
public class Cliente implements Autenticado{

	@Override
	public void setSenha(String Novasenha) {}

	@Override
	public boolean autenticar(String senha) {
		return false;
	}

}
