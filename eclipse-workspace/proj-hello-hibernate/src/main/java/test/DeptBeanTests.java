package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.DeptBean;
import model.hibernate.HibernateUtil;

public class DeptBeanTests {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		DeptBean insert = new DeptBean();
		insert.setDeptid(70);
		insert.setDeptname("hahaha");
		session.save(insert);
		
		transaction.commit();
		session.close();
		HibernateUtil.closeSessionFactory();
	}
}
