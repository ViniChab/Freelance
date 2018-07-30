import java.util.Scanner;
package arraytest;
public class ArrayTest 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner (System.in);
        int[] arr = new int[100];
        int a;
        System.out.println("Please type in 10 numbers: ");
        for ( a = 0 ; a < 10 ; a++)
        arr[a] = scan.nextInt();
        System.out.print("\"The values you typed are: ");
        for ( a = 0 ; a < 10 ; a++)
        System.out.print(arr[a]);
        System.out.println();
    }
    
}
