package model.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import model.ProductBean;
import model.ProductDAO;

public class ProductDAOHibernate implements ProductDAO {
	private SessionFactory sessionFactory = null;
	public ProductDAOHibernate(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	@Override
	public ProductBean select(int id) {
		return this.getSession().get(ProductBean.class, id);
	}
	@Override
	public List<ProductBean> select() {
		return this.getSession().createQuery(
				"from ProductBean", ProductBean.class).getResultList();
	}
	@Override
	public ProductBean insert(ProductBean bean) {
		if(bean!=null) {
			ProductBean result = this.getSession().get(ProductBean.class, bean.getId());
			if(result==null) {
				this.getSession().save(bean);
				return bean;
			}
		}
		return null;
	}
	@Override
	public ProductBean update(String name, double price,
			java.util.Date make, int expire, int id) {
		ProductBean result = this.getSession().get(ProductBean.class, id);
		if(result!=null) {
			result.setName(name);
			result.setPrice(price);
			result.setMake(make);
			result.setExpire(expire);
		}
		return result;
	}
	@Override
	public boolean delete(int id) {
		ProductBean bean = this.getSession().get(ProductBean.class, id);
		if(bean!=null) {
			this.getSession().delete(bean);
			return true;
		}
		return false;
	}
}
