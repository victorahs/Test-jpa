
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

			Query query = manager.createQuery("select l from Livre l where l.titre='Germinal'");
			Livre l1 = (Livre) query.getResultList().get(0);

			System.out.println(l1.toString());

		}

	}

}
