package model;

import java.io.File;
import java.io.FileInputStream;
import java.util.Set;

import org.hibernate.Session;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.hibernate.HibernateUtil;

public class EmpBeanTests {
	private static byte[] photo1;
	private static byte[] photo2;
	@BeforeClass
	public static void classLoading() throws Exception {
		File input1 = new File("C:/JavaFramework/01.jpg");
		int length1 = (int) input1.length();
		photo1 = new byte[length1];
		FileInputStream fis1 = new FileInputStream(input1);
		fis1.read(photo1);
		fis1.close();

		File input2 = new File("C:/JavaFramework/02.jpg");
		int length2 = (int) input2.length();
		photo2 = new byte[length2];
		FileInputStream fis2 = new FileInputStream(input2);
		fis2.read(photo2);
		fis2.close();
	}
	
	private Session session;
	@Before
	public void beforeTestMethod() {
		HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
		this.session = HibernateUtil.getSessionFactory().getCurrentSession();
	}
	
//	@Test
	public void testInsert() {
		EmpBean insert = new EmpBean();
		insert.setEmpname("hahaha");
		insert.setSalary(100);
		insert.setSex("F");
		insert.setPhoto(photo1);
		insert.setDeptid(10);
		session.save(insert);
	}

//	@Test
	public void testSelect() throws Exception {
		EmpBean select = session.get(EmpBean.class, 4);
		System.out.println("select="+select);
		
//		byte[] selectPhoto = select.getPhoto();
//		FileOutputStream fos = new FileOutputStream(new File("C:/JavaFramework/empSelect.jpg"));
//		fos.write(selectPhoto);
//		fos.close();
		
		DeptBean dept = select.getDept();
		System.out.println("dept="+dept);
		
		Set<ProjBean> projs = select.getProjs();
		System.out.println("projs="+projs);
	}
	
//	@Test
	public void testUpdate() {
		EmpBean update = session.get(EmpBean.class, 104);
		update.setEmpname("hehehe");
		update.setSalary(1234);
		update.setSex("M");
		update.setPhoto(photo2);
		update.setDeptid(30);
	}

//	@Test
	public void testDelete() {
		EmpBean delete = session.get(EmpBean.class, 4);
		session.delete(delete);
	}
	
	@After
	public void afterTestMethod() {
		HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
	}
}
