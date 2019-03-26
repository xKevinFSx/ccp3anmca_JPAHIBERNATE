package br.usjt.persistence;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.usjt.model.Usuario;
import br.usjt.util.JPAUtil;

public class TesteListaTodosJPQL {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		Query query = manager.createQuery("from Usuario");
		List usuarios = query.getResultList();
		for (Usuario u : usuarios) {
		System.out.println(u);
		}
		manager.close();
		JPAUtil.close();
	}
}
