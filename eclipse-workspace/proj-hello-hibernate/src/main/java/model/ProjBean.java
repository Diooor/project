package model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="PROJ")
public class ProjBean {
	
	@ManyToMany
	@JoinTable(
			name = "projemp",
			joinColumns = {
					@JoinColumn(name="projid", referencedColumnName = "projid")	
			},
			inverseJoinColumns = {
					@JoinColumn(name="empid", referencedColumnName = "empid")
			}
	)
	private Set<EmpBean> emps;
	public Set<EmpBean> getEmps() {
		return emps;
	}
	public void setEmps(Set<EmpBean> emps) {
		this.emps = emps;
	}
	
	@Id
	private Integer projid;
	private String projname;
	@Override
	public String toString() {
		return "ProjBean [projid=" + projid + ", projname=" + projname + "]";
	}
	public Integer getProjid() {
		return projid;
	}
	public void setProjid(Integer projid) {
		this.projid = projid;
	}
	public String getProjname() {
		return projname;
	}
	public void setProjname(String projname) {
		this.projname = projname;
	}
}
