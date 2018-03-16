
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestJpa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("pu_essai");
		EntityManager manager = factory.createEntityManager();

		Livre l = manager.find(Livre.class, 3);
		if (l != null) {

			System.out.println(l.toString());

			Query query = manager.createQuery("select l from Livre l where l.titre=:titre");
			query.setParameter("titre", "Germinal");
			Livre l1 = (Livre) query.getResultList().get(0);

			System.out.println(l1.toString());
			
			
			

		}
		
		
//		Affiche tout les livre pour les emprunts
		
		Query query2 = manager.createQuery("select e from Emprunt e");
		List <Emprunt> emprunts = new ArrayList<Emprunt>();
		
		emprunts = query2.getResultList();
		for (Emprunt emp : emprunts){
			System.out.println(emp.getId());
			for (Livre livre : emp.getLivres()){
				System.out.println(livre.getTitre());
			}
		}
		
		Query query3 = manager.createQuery("select e from Emprunt e where e.id = 1");
		
		Emprunt e1 = (Emprunt) query3.getResultList().get(0);
		
		List <Livre> livres = new ArrayList<Livre>();
		livres = e1.getLivres();
		for (Livre livre : livres){
			System.out.println(livre.getTitre());
		}
		
		Query query4 = manager.createQuery("select c from Client c where c.id = 3");
		
		Client c1 = (Client) query4.getResultList().get(0);
		List <Emprunt> empruntsCli = new ArrayList<Emprunt>();
		empruntsCli = c1.getEmprunts(); 
		
		for(Emprunt emprunt : empruntsCli){
			
			System.out.println(emprunt.getClient());
		}
		
		

	}

}
