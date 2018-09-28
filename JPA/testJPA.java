
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.caleum.financas.modelo.conta;

public class teste {

	public static void main(String[] args) {
	
	conta conta =new conta();
	conta.setTitular("Vinícius S. Chab");
	conta.setBanco("Banco do Cazaquistão");
	conta.setAgencia(1579);
	conta.setNumero(6546846-32);
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("financas");
	EntityManager em = emf.createEntityManager();
	//isso vai pucar o aquvio de persistence
	
	em.getTransaction().begin(); //começar a transação
	em.persist(conta); //jogar conta no banco
	em.getTransaction().commit(); //dar o commit
	
	em.close();
	emf.close(); //fechar tudo
	}
}
