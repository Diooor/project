package query;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

import model.EmpBean;
import model.hibernate.HibernateUtil;

public class TestCriteria {
	public static void main(String[] args) {
		HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<EmpBean> criteriaQuery = criteriaBuilder.createQuery(EmpBean.class);

		//from (type-safe)
		Root<EmpBean> root = criteriaQuery.from(EmpBean.class);
		
		//where
		criteriaQuery = criteriaQuery.where(
				criteriaBuilder.greaterThan(root.get("salary"), 10),	//salary > 10
				criteriaBuilder.like(root.get("empname"), "%m%")		//empname like '%m%'
		);
		
		//order by
		criteriaQuery = criteriaQuery.orderBy(criteriaBuilder.desc(root.get("empid")));

		TypedQuery<EmpBean> typedQuery = session.createQuery(criteriaQuery);
		typedQuery.setFirstResult(0);
		typedQuery.setMaxResults(10);
		
		List<EmpBean> emps = typedQuery.getResultList();
		System.out.println("emps="+emps);
		
		HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
		HibernateUtil.getSessionFactory().getCurrentSession().close();
		HibernateUtil.closeSessionFactory();
	}
}
