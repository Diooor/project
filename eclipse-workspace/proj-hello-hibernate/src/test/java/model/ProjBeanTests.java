package model;

import java.util.Set;

import org.hibernate.Session;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import model.hibernate.HibernateUtil;

public class ProjBeanTests {
	private Session session;
	
	@Before
	public void beforeTestMethod() {
		HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
		this.session = HibernateUtil.getSessionFactory().getCurrentSession();
	}
	
//	@Test
	public void testInsert() {
		ProjBean insert = new ProjBean();
		insert.setProjid(300);
		insert.setProjname("xxxxxx");
		session.save(insert);
	}

//	@Test
	public void testSelect() {
		ProjBean select = session.get(ProjBean.class, 100);
		System.out.println("select="+select);
		
		Set<EmpBean> emps = select.getEmps();
		System.out.println("emps="+emps);

		
	}
	
//	@Test
	public void testUpdate() {
		ProjBean update = session.get(ProjBean.class, 300);			
		update.setProjname("hohoho");
	}

	@Test
	public void testDelete() {
		ProjBean delete = session.get(ProjBean.class, 100);
		session.delete(delete);
	}
	
	@After
	public void afterTestMethod() {
		HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
	}
}
