package model.dao;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import configuration.SpringJavaConfig;
import model.ProductBean;
import model.ProductDAO;

@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringJavaConfig.class})
public class ProductDAOJdbcTests {
	@Autowired
	private ProductDAO productDao;
	
	@Test
	public void testSelect() {
		List<ProductBean> beans = productDao.select();
		System.out.println("bean="+beans);
	}
}
