
import java.util.*;

public class test {
	
	public static void main(String[] args) 
	{
	
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		scan.nextLine(); //this is how you clean an input
		String name = scan.nextLine();
		System.out.println(a + name);
		scan.close();
		
	}
}
