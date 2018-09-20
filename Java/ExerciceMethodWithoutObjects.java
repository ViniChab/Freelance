
import java.util.*;

public class test {
	
	public static double area_componente( double x, double y, double z ) 
	{
		double p = ( x+y+z ) / 2;
		double area = Math.sqrt( p * ( p - x) * ( p- y ) * ( p - z ) );
		return area;
	}//aqui é pra calcular a área
	
	public static double area_final()
	{

		Scanner scan = new Scanner(System.in); //declaração do scanner
		
		float 
		lado1  = scan.nextFloat(),
		lado2  = scan.nextFloat(),
		altura = scan.nextFloat(); //declarando variáveis
	
		double area = area_componente( lado1, lado2, altura ); 
		//pegando a area pela função
		
		return area;
		
	} //aqui é pra entrarem os dados e os transformar em área
	
	public static void main(String[] args) 
	{
		
		System.out.println("Please, enter the values for the first tringle:\n");
		//pedindo a entrada
		
		double area1 = area_final(); //chamando a função para as entradas
		
		System.out.println("\nThe area of the first triangle is: " + area1);
		//mensagem mostrando a area de 2
		
		System.out.println("\nPlease, enter the values for the second tringle:\n");
		
		double area2 = area_final(); //chamando a função para as entradas

		System.out.println("\nThe area of the first triangle is: " + area2);
		//mensagem mostrando a area de 2
		
		System.out.print("\nThe triangle with the greatest area, is the number ");
		
		if( area1 > area2 ) System.out.println("1");
		else System.out.println("2"); //printando se 1 ou 2 é maior
		
	}
}
