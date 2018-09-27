import java.util.Scanner;
package fatorial;
public class Fatorial 
{
    public static int fat ( int x )
    {
        int fat = x , aux;
        if ( x == 1 || x == 0)
            return 1;
        
        for ( aux = x - 1; aux > 1 ; aux-- )
        fat = fat * aux;
            return fat;
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
