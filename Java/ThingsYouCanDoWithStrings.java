
public class test {
	
	public static void main(String[] args) 
	{
		
		String original = "wkjheb ASEGB aof IASDF heb        ";
		//aqui temos letras minúsculas, maiúsculas e espaços

		String s1 = original.toLowerCase(); //td minúsculo
		String s2 = original.toUpperCase();//td maisúculo
		String s3 = original.trim();//sem espaço no fim
		String s4 = original.substring(8);//só vai pegar a string depois do elemento 8
		String s5 = original.substring(8, 14);//entre 8 e 14 apenas
		String s6 = original.replace('A', '#');//substitui
		int i = original.indexOf("heb"); /*vai assumir o valor da posição do primeiro caractere de heb, 
										   na primeira vez em que heb aparece na string*/
		int j = original.lastIndexOf("heb"); /*vai assumir o valor da posição do primeiro caractere de heb, 
										       na última vez em que heb aparece na string*/
		
		System.out.println("Original = " + original + ".\n");
		System.out.println("ToLowerCase = " + s1 + ".");
		System.out.println("ToUpperCase = " + s2 + ".");
		System.out.println("Trim = " + s3 + ".");
		System.out.println("Substring = " + s4 + ".");
		System.out.println("Substring c/ dois args = " + s5 + ".");
		System.out.println("Replace = " + s6 + ".");
		System.out.println("indexOf = " + i);
		System.out.println("lastIndexOf = " + j);
		
				
	}
}
