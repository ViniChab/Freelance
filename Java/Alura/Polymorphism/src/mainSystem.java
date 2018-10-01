
public class mainSystem {

	public static void main(String[] args) {
		
		
		Funcionario gerente = new Gerente();
		gerente.setName("Josu�h");
		gerente.setSalario(3241.12);
		
		Funcionario funcionario = new Funcionario();
		funcionario.setName("Vin�cius");
		funcionario.setSalario(2863.00);
		
		Funcionario editor = new Editor();
		editor.setName("Marquin");
		editor.setSalario(1748.65);
		
		ControleBonificacao controle = new ControleBonificacao(); 
		controle.registro(funcionario);
		controle.registro(gerente);
		controle.registro(editor);
		
		System.out.println("Bonificacao total: R$" + controle.getSoma());
		
	}
}
