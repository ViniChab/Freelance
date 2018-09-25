
import java.util.*;

public class Test {
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		Triangle x= new Triangle();
		Triangle y = new Triangle(); //aqui eu chamo a classe 
		
		System.out.println("Please, enter the values for the first tringle:\n");
		//pedindo a entrada
		
		x.LadoA  = scan.nextDouble();
		x.LadoB  = scan.nextDouble();
		x.LadoC  = scan.nextDouble(); //scan
		
		double areaDeX = x.area(x.LadoA, x.LadoB, x.LadoC); //chamando o método
		
		System.out.printf("\nThe area of the first triangle is: %.2f", areaDeX);
		//mensagem mostrando a area de 2
		
		System.out.println("\nPlease, enter the values for the second tringle:\n");

		y.LadoA  = scan.nextDouble();
		y.LadoB  = scan.nextDouble();
		y.LadoC  = scan.nextDouble(); //scan
		
		double areaDeY = y.area(y.LadoA, y.LadoB, y.LadoC); //chamando o método

		System.out.printf("\nThe area of the first triangle is: %.2f", areaDeY);
		//mensagem mostrando a area de 2
		
		System.out.print("\nThe triangle with the greatest area, is the number ");
		
		if( areaDeX > areaDeY ) System.out.println("1");
		else System.out.println("2"); //printando se 1 ou 2 é maior
		
		scan.close();
		
	}
}
