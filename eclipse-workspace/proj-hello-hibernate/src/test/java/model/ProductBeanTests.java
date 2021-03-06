package model;

import java.io.File;
import java.io.FileOutputStream;

import org.hibernate.Session;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import model.hibernate.HibernateUtil;

public class ProductBeanTests {
	private Session session;
	@Before
	public void beforeTestMethod() {
		HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
		this.session = HibernateUtil.getSessionFactory().getCurrentSession();
	}
//	@Test
	public void testInsert() {
		ProductBean insert = new ProductBean();
		insert.setId(12);
		insert.setName("hahaha");
		insert.setPrice(20.0);
		insert.setMake(new java.util.Date());
		insert.setExpire(300);
		session.save(insert);
	}
	@Test
	public void testSelect() throws Exception {
		ProductBean select = session.get(ProductBean.class, 11);
		System.out.println("select="+select);
		
		DetailBean detail = select.getDetail();
		System.out.println("detail="+detail);
		
		byte[] selectPhoto = detail.getPhoto();
		FileOutputStream fos = new FileOutputStream(
				new File("C:/JavaFramework/productSelect.jpg"));
		fos.write(selectPhoto);
		fos.close();
	}
	
//	@Test
	public void testUpdate() {
		ProductBean update = session.get(ProductBean.class, 12);
		update.setName("hohoho");
		update.setPrice(12.3);
		update.setMake(new java.util.Date(0));
		update.setExpire(456);
	}

//	@Test
	public void testDelete() {
		ProductBean delete = session.get(ProductBean.class, 11);
		session.delete(delete);
	}
	
	@After
	public void afterTestMethod() {
		HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
	}
}
