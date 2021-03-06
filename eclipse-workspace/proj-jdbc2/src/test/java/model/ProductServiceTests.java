package model;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import configuration.SpringJavaConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringJavaConfig.class})
public class ProductServiceTests {
	@Autowired
	private ProductService productService;

	@Test
	public void testSelect() {
		List<ProductBean> selects =
				productService.select(null);
		System.out.println("selects="+selects);
	}
}
