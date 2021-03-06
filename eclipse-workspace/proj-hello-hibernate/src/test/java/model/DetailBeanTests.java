package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.hibernate.Session;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.hibernate.HibernateUtil;

public class DetailBeanTests {
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
		DetailBean insert = new DetailBean();
		insert.setPhotoid(11);
		insert.setPhoto(photo1);
		session.save(insert);
	}

//	@Test
	public void testSelect() throws Exception {
		DetailBean select = session.get(DetailBean.class, 11);
		System.out.println("select="+select);
		
		byte[] selectPhoto = select.getPhoto();
		FileOutputStream fos = new FileOutputStream(
				new File("C:/JavaFramework/detailSelect.jpg"));
		fos.write(selectPhoto);
		fos.close();
		
		ProductBean product = select.getProduct();
		System.out.println("product="+product);
	}
	
//	@Test
	public void testUpdate() throws Exception {
		DetailBean update = session.get(DetailBean.class, 11);
		update.setPhoto(photo2);
	}

//	@Test
	public void testDelete() {
		DetailBean delete = session.get(DetailBean.class, 11);
		session.delete(delete);
	}
	
	@After
	public void afterTestMethod() {
		HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
	}
}
