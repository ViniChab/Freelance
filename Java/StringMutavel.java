
public class imutabilidade {

	public static void main(String[] args) {
		
		String nome = "Zézin";
		nome = nome.toLowerCase();
		System.out.println(nome);
		nome = nome.toUpperCase();
		System.out.println(nome);
		int a = nome.indexOf("I");
		System.out.println(a);

	}

}
