import java.util.Scanner;
package fatorial;
public class Fatorial 
{
    public static int fat ( int x )
    {
        if( x == 0 || x == 1)
          return 1; 
        
        else
        
          return x*fat(x-1);
    }
    public static void main(String[] args) 
    {
        int num;
        Scanner scan = new Scanner (System.in);
        System.out.print("Please, type in a number: ");
        num = scan.nextInt();
        System.out.println("\nO fatoral deste numero é: "+fat(num));
    }
    
}
