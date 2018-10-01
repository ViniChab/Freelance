
public class mainSystem {

	public static void main(String[] args) {
		
		
		FuncionarioAutenticado gerente = new Gerente();
		gerente.setName("Josuéh");
		gerente.setSalario(3241.12);
		gerente.setSenha("Banana123");
		gerente.autenticar("Banana123");
		
	}
}
