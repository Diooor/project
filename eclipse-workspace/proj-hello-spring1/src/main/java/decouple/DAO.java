package decouple;

import javax.sql.DataSource;

public class DAO {
	private DataSource dataSource;
	public DAO(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
}
