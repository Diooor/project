package model;

import java.util.Set;

import org.hibernate.Session;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import model.hibernate.HibernateUtil;

public class DeptBeanTests {
	private Session session;
	@Before
	public void beforeTestMethod() {
		HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
		this.session = HibernateUtil.getSessionFactory().getCurrentSession();
	}
	
//	@Test
	public void testInsert() {
		DeptBean insert = new DeptBean();
		insert.setDeptid(300);
		insert.setDeptname("hehehe");
		session.save(insert);
	}

//	@Test
	public void testSelect() {
		DeptBean select = session.get(DeptBean.class, 10);
		System.out.println("select="+select);
		
		Set<EmpBean> emps = select.getEmps();
		System.out.println("emps="+emps);
	}
	
//	@Test
	public void testUpdate() {
		DeptBean update = session.get(DeptBean.class, 300);
		update.setDeptname("hohoho");
	}

//	@Test
	public void testDelete() {
		DeptBean delete = session.get(DeptBean.class, 300);
		session.delete(delete);
	}
	
	@After
	public void afterTestMethod() {
		HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
	}
}
