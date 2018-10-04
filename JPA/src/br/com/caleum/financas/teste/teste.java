package br.com.caleum.financas.teste;

import javax.persistence.EntityManager;

import br.com.caleum.financas.modelo.ContaVinicius;
import br.com.caleum.financas.util.JPAutil;

public class teste {

	public static void main(String[] args) {
	
	ContaVinicius conta =new ContaVinicius();
	conta.setTitular("Vin�cius S. Chab");
	conta.setBanco("Banco do Cazaquist�o");
	conta.setAgencia("1579");
	conta.setNumero("6546846-3");
	
	EntityManager em = new JPAutil().getEntityManager();
	//isso vai pucar o aquvio de persistence
	
	em.getTransaction().begin(); //come�ar a transa��o
	em.persist(conta); //jogar conta no banco
	em.getTransaction().commit(); //dar o commit
	
	em.close();
	}
}