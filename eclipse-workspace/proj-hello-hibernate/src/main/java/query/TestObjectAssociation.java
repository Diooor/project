package query;

import java.util.List;
import java.util.Set;

import org.hibernate.Session;

import model.DeptBean;
import model.EmpBean;
import model.hibernate.HibernateUtil;

public class TestObjectAssociation {
	public static void main(String[] args) {
		HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		List<DeptBean> list1 = session.createQuery("from DeptBean", DeptBean.class).list();
		for(DeptBean dept : list1) {
			Set<EmpBean> emps = dept.getEmps();
			System.out.println("dept="+dept);
			System.out.println("emps="+emps);
		}
		
		HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
		HibernateUtil.getSessionFactory().getCurrentSession().close();
		HibernateUtil.closeSessionFactory();
	}
}
