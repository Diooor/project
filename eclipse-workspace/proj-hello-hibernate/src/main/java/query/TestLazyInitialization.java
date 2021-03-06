package query;

import org.hibernate.Hibernate;
import org.hibernate.Session;

import model.DeptBean;
import model.hibernate.HibernateUtil;

public class TestLazyInitialization {
	public static void main(String[] args) {
		try {
			HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();

			DeptBean select = session.load(DeptBean.class, 300);
			Hibernate.initialize(select);
			
			HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
			HibernateUtil.getSessionFactory().getCurrentSession().close();
		} finally {
			HibernateUtil.closeSessionFactory();
		}
	}
}
