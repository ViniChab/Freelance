package br.com.bytebank.Main;

import java.util.Scanner;

import br.com.bytebank.Cliente.Cliente;
import br.com.bytebank.Conta.ContaVinicius;


public class mainSystem {
	
	public static void header() {
		System.out.println("------------------------------WELCOME------------------------------");
		System.out.println("Source by ViniChab\n\n");
	}
	
	public static int seguranca( int x ) {

		Scanner scan = new Scanner(System.in);
		
		boolean workingInput = false;
		
		while( workingInput == false )
		{
			try 
			{
				x = scan.nextInt();
				workingInput = true;
				if (x > 4 || x < 0)
				{
					System.out.println("Por favor, tente novamente");
					workingInput = false;
				}	
			}
			catch(Exception err)
			{
				System.out.println("Por favor, tente novamente");
				workingInput = false;
				scan.next();
			}
		} 
		
		scan.close();
		
		return x;
	}
	
	public static void criaConta() {

		Scanner scan = new Scanner(System.in);
		
		Cliente b = new Cliente(null, null, null, null);
		
		System.out.print("Por favor, entre seu nome: ");
		
		b.setNome(scan.nextLine());
		
		System.out.print("\nPor favor, entre sua renda mensal: ");
		
		b.setRendaMensal(scan.nextDouble());
		
		System.out.print("\nAgora, seu emprego: ");
		
		b.setEmprego(scan.nextLine());
		
		System.out.print("\nPor fim, seu endereço: ");
		
		b.setEndereço(scan.nextLine());
		scan.next();
		
		ContaVinicius a = new ContaVinicius(0, null, b, 0);
		
		System.out.print("\nCadastro de cliente completo! Digite  numero de sua agencia: ");
		
		seguranca(a.getAgencia());

		System.out.print("\nSua conta: ");
		
		a.setNumero(scan.nextLine());
		
		scan.close();
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int escolha = 0;
		header();

		System.out.println("Bem-Vindo ao bytebank! \nSelecione o que deseja fazer:");
		System.out.println("[1] Criar uma conta");
		System.out.println("[2] Procurar uma conta");
		System.out.println("[3] Deletar uma conta");
		System.out.println("[4] Tirar um extrato");
		
		seguranca(escolha);
		
		switch (escolha) {
		
		case 1:
			criaConta();
			break;}
		/*case 2:
			procuraConta();
			break;
		case 3:
			deletaConta();
			break;
		case 2:
			extratoConta();
			break;
			
		}*/
		scan.close();
		
	}
}