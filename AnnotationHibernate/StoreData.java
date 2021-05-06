import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class StoreData{

	public static void main(String argp[]){
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

		//	Scanner inp = new Scanner(System.in);

		Person p = new Person();
		p.setName("Modi");

		Student s = new Student();
		s.setName("Salmon bhai");
		s.setCllgId("18IT441");
		s.setBranch("IT");

		Proffesor prf = new Proffesor();
		prf.setName("Elon musk");
		prf.setProfId("007");
		prf.setSubject("JAVA");

		session.persist(p);
		session.persist(s);
		session.persist(prf);

		t.commit();
		System.out.println("All record stored successful");

		session.close();
		factory.close();
	}
}