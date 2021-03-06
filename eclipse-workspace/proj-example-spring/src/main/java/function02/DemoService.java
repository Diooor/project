package function02;

class DemoService {
	private DemoDAO demoDao = new DemoDAO();
	
}

class DemoService1 {
	private DemoDAO demoDao;
	public DemoService1(DemoDAO demoDao) {
		this.demoDao = demoDao;
	}
}

class DemoService2 {
	private DemoDAO demoDao;
	public void setDemoDao(DemoDAO demoDao) {
		this.demoDao = demoDao;
	}
}
