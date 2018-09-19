import java.util.*;

public class test {
	
	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
	
		int a = scan.nextInt();
		scan.nextLine(); //assim que vc limpa um input
		String name = scan.nextLine();
		char gender = scan.next().charAt(0); //assim que vc lê um char

		scan.nextLine();
		String ocean = scan.next();
		char letter = ocean.charAt(0); //usando o charAt, vc pode pegar só um valor da string, tipo o [0]
		int digit = Integer.parseInt(ocean.substring(1)); 
		//assim ele vai pegar tudo depois do primeiro dígito, e transforma ele numa int

		scan.nextLine();
		String name2 = scan.next();
		char ch = scan.next().charAt(0);
		int age = scan.nextInt();
		double height = scan.nextDouble();
		//assim eu leio toda uma linha de uma vez, como por exemplo: "Maria F 23 1,65"

		scan.nextLine();
		String fullName = scan.nextLine();
		//assim que vc lê tudo, incluindo espaços

		System.out.println(a);
		System.out.println(name);
		System.out.println(gender);
		System.out.println(ocean);
		System.out.println(letter);
		System.out.println(digit);
		System.out.println(name2);
		System.out.println(ch);
		System.out.println(age);
		System.out.println(height);
		System.out.println(fullName);
		scan.close();
		
	}
}
