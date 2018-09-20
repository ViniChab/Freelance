import java.util.*;

public class test {
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int nota1, nota2, nota3, nota4;
		nota1 = scan.nextInt();
		nota2 = scan.nextInt();
		nota3 = scan.nextInt();
		nota4 = scan.nextInt();
		
		float media = (nota1 + nota2 + nota3 + nota4)/4;
		boolean passou = (media >= 7 )? true : false;
		
		if ( passou == true )
		{
			System.out.print("\nAprovado");
		}
		else
		{
			System.out.print("\nReprovado");
		}
		
		scan.close();
	}
}
