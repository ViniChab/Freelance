package br.com.bytebank.Main;

import java.util.Scanner;

import br.com.bytebank.Cliente.Cliente;
import br.com.bytebank.Conta.Conta;

public class mainSystem {
	
	public static void header() {
		System.out.println("------------------------------WELCOME------------------------------");
		System.out.println("Source by ViniChab\n\n");
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		header();

		System.out.println("Bem-Vindo ao bytebank! \nSelecione o que deseja fazer:");
		System.out.println("[1] Criar uma conta");
		System.out.println("[2] Procurar uma conta");
		System.out.println("[3] Deletar uma conta");
		System.out.println("[4] Tirar um extrato");
		
		scan.close();
		
	}
}
