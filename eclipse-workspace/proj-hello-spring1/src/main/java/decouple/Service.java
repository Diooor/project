package decouple;

import original.DAO;

public class Service {
	private DAO dao;
	public Service(DAO dao) {
		this.dao = dao;
	}
	public void setDao(DAO dao) {
		this.dao = dao;
	}
	
}
