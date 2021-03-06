package model.dao;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import model.CustomerBean;
import model.CustomerDAO;

public class CustomerDAOHibernate implements CustomerDAO {
	private SessionFactory sessionFactory = null;
	public CustomerDAOHibernate(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	@Override
	public CustomerBean select(String custid) {
		if(custid!=null) {
			return this.getSession().get(CustomerBean.class, custid);
		}
		return null;
	}
	@Override
	public boolean update(byte[] password,
			String email, Date birth, String custid) {
		if(custid!=null) {
			CustomerBean result = this.getSession().get(CustomerBean.class, custid);
			if(result!=null) {
				result.setPassword(password);
				result.setEmail(email);
				result.setBirth(birth);
				return true;
			}
		}
		return false;
	}
}
