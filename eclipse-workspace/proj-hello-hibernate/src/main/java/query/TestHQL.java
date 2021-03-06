package query;

import java.util.List;

import org.hibernate.Session;

import model.DeptBean;
import model.ProductBean;
import model.hibernate.HibernateUtil;

public class TestHQL {
	public static void main(String[] args) {

		
		try {
			HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		
			List<DeptBean> list1 = session.createQuery("from DeptBean", DeptBean.class).list();
			for(DeptBean dept : list1) {
				System.out.println("dept="+dept);
			}

//			List<String> list5 = session.createQuery("select deptname from DeptBean", String.class).list();
//			for(String deptname : list5) {
//				System.out.println("deptname="+deptname);
//			}

//			List<Object[]> list6 = session.createQuery("select deptid, deptname from DeptBean").list();
//			for(Object[] array : list6) {
//				System.out.println(array[0]+":"+array[1]);
//			}
			
//			List<DeptBean> list2 = session.createQuery("from DeptBean where deptname like :deptname", DeptBean.class)
//				.setParameter("deptname", "%c%")
//				.list();
//			for(DeptBean dept : list2) {
//				System.out.println("dept="+dept);
//			}
			
//			List<DeptBean> list3 = session.createQuery("from DeptBean where deptid in (:list)", DeptBean.class)
//					.setParameterList("list", Arrays.asList(10, 30, 50))
//					.list();
//			for (DeptBean dept : list3) {
//				System.out.println("dept=" + dept);
//			}
			
//			List<ProductBean> list4 = session.createQuery("from ProductBean", ProductBean.class)
//					.setMaxResults(3)
//					.setFirstResult(5)
//					.list();
//			for (ProductBean product : list4) {
//				System.out.println("product" + product);
//			}
			
			
//			String hql1 = "select dept.deptname, emp from DeptBean dept, EmpBean emp";
//			List<Object[]> data1 = session.createQuery(hql1).list();
//			System.out.println(data1);
			
//			String hql2 = "select new list (dept.deptname, emp) from DeptBean dept, EmpBean emp";
//			List<List> data2 = session.createQuery(hql2).list();
//			System.out.println("data2="+data2);
			
//			String hql3 = "select new map (dept.deptname as keyA, emp as keyB) from DeptBean dept, EmpBean emp";
//			List<List> data3 = session.createQuery(hql3).list();
//			System.out.println("data3="+data3);
			
			HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
			HibernateUtil.getSessionFactory().getCurrentSession().close();
		} finally {
			HibernateUtil.closeSessionFactory();
		}
	}
}
