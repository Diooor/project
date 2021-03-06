package query;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;

import model.ProductBean;
import model.hibernate.HibernateUtil;

public class TestNativeQuery {
	public static void main(String[] args) {
		try {
			HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();

			NativeQuery query1 = session.createNativeQuery("SELECT * FROM PRODUCT");
			List<Object[]> data1 = (List<Object[]>) query1.list();
			System.out.println("data1="+data1);
			
			NativeQuery query2 = session.createNativeQuery("SELECT * FROM PRODUCT");
			query2.addEntity(ProductBean.class);
			List<ProductBean> data2 = (List<ProductBean>) query2.list();
			System.out.println("data2="+data2);
			
			NativeQuery query3 = session.createNativeQuery("SELECT * FROM PRODUCT", ProductBean.class);
			List<ProductBean> data3 = (List<ProductBean>) query3.list();
			System.out.println("data3="+data3);
			
			HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
			HibernateUtil.getSessionFactory().getCurrentSession().close();
		} finally {
			HibernateUtil.closeSessionFactory();
		}
	}
}
