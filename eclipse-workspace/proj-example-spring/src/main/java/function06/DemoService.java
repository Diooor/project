package function06;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service
public class DemoService {
	@Resource(name = "demoDAOImpl2")
	private DemoDAOInterface demoDao1;

	@Override
	public String toString() {
		return "function06.DemoService [demoDao1=" + demoDao1 +"]";
	}
}
