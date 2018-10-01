import java.util.Scanner;

public class mainSystem {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		
		gerente.setName("Binichirusu");
		gerente.setSalario(3245.00);
		gerente.setCPF("111.222.333-44");
		gerente.setSenha("batata151");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite sua senha: ");
		gerente.autenticar(scan.nextLine());
		scan.close();
		
	}
}
