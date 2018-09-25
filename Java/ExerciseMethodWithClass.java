
import java.util.*;

public class Test {
	
	public static double area_final( double x, double y, double z ) 
	{
		double p = ( x+y+z ) / 2;
		double area = Math.sqrt( p * ( p - x) * ( p- y ) * ( p - z ) );
		return area;
	}//aqui é pra calcular a área

	public class triangle{
		public double a;
		public double b;
		public double c; 
		//esses são os lados dos triâgulos
	}
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		triangle x= new triangle(), y = new triangle(); //aqui eu chamo a classe 
		
		System.out.println("Please, enter the values for the first tringle:\n");
		//pedindo a entrada
		
		x.a  = scan.nextDouble();
		x.b  = scan.nextDouble();
		x.c  = scan.nextDouble(); //scan
		
		double area1 = area_final( x.a, x.b, x.c); //chamando a função para as entradas
		
		System.out.println("\nThe area of the first triangle is: " + area1);
		//mensagem mostrando a area de 2
		
		System.out.println("\nPlease, enter the values for the second tringle:\n");

		y.a  = scan.nextDouble();
		y.b  = scan.nextDouble();
		y.c  = scan.nextDouble(); //scan
		
		double area2 = area_final( y.a, y.b, y.c); //chamando a função para as entradas

		System.out.println("\nThe area of the first triangle is: " + area2);
		//mensagem mostrando a area de 2
		
		System.out.print("\nThe triangle with the greatest area, is the number ");
		
		if( area1 > area2 ) System.out.println("1");
		else System.out.println("2"); //printando se 1 ou 2 é maior
		
	}
}
