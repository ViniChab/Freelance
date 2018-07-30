import java.util.Scanner;
package funçãoteste;
public class Funçãoteste 
{
    public static void media(float x, float y)
    {
        System.out.println("A media entre "+x+" e "+y+" é de : "+(x+y)/2);
    }
    public static void main(String[] args) 
    {
        int num1, num2;
        Scanner scan = new Scanner (System.in);
        System.out.println("Por favor, entre com as notas:");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        media(num1,num2);
    }
}
