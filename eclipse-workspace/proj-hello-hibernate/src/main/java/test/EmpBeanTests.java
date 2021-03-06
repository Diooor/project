package test;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.EmpBean;
import model.hibernate.HibernateUtil;

public class EmpBeanTests {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();

		EmpBean insert = new EmpBean();
		insert.setEmpname("hehehe");
		insert.setSalary(100);
		insert.setSex("M");
		insert.setDeptid(20);
		Serializable pk = session.save(insert);
		System.out.println("pk="+pk);
		
		transaction.commit();
		session.close();
		HibernateUtil.closeSessionFactory();
	}
}
