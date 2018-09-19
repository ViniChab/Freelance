
import java.util.*;

public class test {
	
	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);

		String name = scan.nextLine();
		String[] _name = name.split("");
		
		for ( int i = 0 ; i < name.length() ; i++) {
			System.out.println(_name[i]);
		}
		
		scan.close();
		
	}
}
