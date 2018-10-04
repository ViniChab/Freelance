package br.com.caleum.financas.teste;

import javax.persistence.EntityManager;

import br.com.caleum.financas.modelo.ContaVinicius;
import br.com.caleum.financas.util.JPAutil;

public class TesteBuscaConta {
	
	public static void main(String[] args) {
	EntityManager em = new JPAutil().getEntityManager();
	em.getTransaction().begin();
	
	ContaVinicius conta = em.find(ContaVinicius.class, 6);
	conta.setTitular("Vin�cius dos Santos"); 
	//assim vou fazer as mudan�as na tabela, � basicamnete o update, mas sem sql
	
	System.out.println(conta.getTitular());
	//assim � o select, vai mostrar s� uma coisa da tabela
	
	em.getTransaction().commit();	
	
	}

}
