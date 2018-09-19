
import java.util.*;

public class test {
	
	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);

		String name = scan.nextLine();
		String[] _name = name.replace(" ","").split("");
		// o split vai colocar cada letra separadamente no array
		//o replace vai tirar todos os espaços
		
		for ( int i = 0 ; i < name.replace(" ","").length() ; i++) {
			System.out.println(_name[i]);
		}
		
		scan.close();
		
	}
}
