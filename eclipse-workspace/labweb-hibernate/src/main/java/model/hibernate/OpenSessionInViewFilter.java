package model.hibernate;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(
		urlPatterns = {"/*"}
)
public class OpenSessionInViewFilter implements Filter {
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}
	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		try {
			HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
			chain.doFilter(request, response);
			HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
		} catch (Exception e) {
			HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().rollback();
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	@Override
	public void destroy() {

	}
}
