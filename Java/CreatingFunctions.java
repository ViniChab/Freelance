
import java.util.*;

public class test {
	
	public static boolean passou(int x, int y, int t, int z)
	{

		float media = (x + y + t + z)/4;
		
		boolean passou = (media >= 7 )? true : false;
		
		return passou;
	}
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int nota1, nota2, nota3, nota4;
		nota1 = scan.nextInt();
		nota2 = scan.nextInt();
		nota3 = scan.nextInt();
		nota4 = scan.nextInt();
		
		if ( passou(nota1, nota2, nota3, nota4) == true )
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
