package model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "dept")
public class DeptBean {
	
	@OneToMany(
			cascade = {CascadeType.REMOVE},
			mappedBy = "dept"
	)
	private Set<EmpBean> emps;
	public Set<EmpBean> getEmps() {
		return emps;
	}
	public void setEmps(Set<EmpBean> emps) {
		this.emps = emps;
	}
	
	@Id
	@Column(name = "deptid")
	private Integer deptid;
	@Column(name = "deptname")
	private String deptname;
	
	@Override
	public String toString() {
		return "DeptBean [deptid=" + deptid + ", deptname=" + deptname + "]";
	}
	public Integer getDeptid() {
		return deptid;
	}
	public void setDeptid(Integer deptid) {
		this.deptid = deptid;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
}
