package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {

		Session s = getSession();
		s.beginTransaction();
		Employee emp = new Employee(117l, "Anil", 10000.0, "SE"); // Transient State
		System.out.println(s.save(emp)); // Persistent State
		s.getTransaction().commit();
		//System.out.println(getEmpoloyee(s, 107l));
		//System.out.println(getEmpoloyee2(s, 107l));
		//s.close();// detached State
		//s.persist(emp);
		s.close();
		//SessionFactory sf = new Configuration().configure().buildSessionFactory();
		//Session s2 = sf.openSession();
		Session s2 = getSession();
		s2.beginTransaction();
		Employee e3 = (Employee) s2.get(Employee.class, 116l);
		emp.setEmpName("Naresh");
		s2.update(emp);
		s2.delete(emp);
		s2.getTransaction().commit();
        //Employee emp3 = (Employee) s.load(Employee.class, 102l);
		//System.out.println(emp3);
		//Employee emp2 = (Employee) s.get(Employee.class, 104l);
		//emp2 = (Employee) s.get(Employee.class, 102l);
		//System.out.println(emp2);
		
	}
	
	private static Employee getEmpoloyee(Session s, long l) {
		return (Employee) s.get(Employee.class, l);
		
	}
	
    private static Employee getEmpoloyee2(Session s, long l) {
		
    	return (Employee) s.get(Employee.class, l);
	}

	public static Session getSession() {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		return s;
		
	}
	

}
