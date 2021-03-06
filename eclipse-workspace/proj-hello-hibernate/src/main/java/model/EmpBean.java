package model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "emp")
public class EmpBean implements Serializable {
	@ManyToMany
	@JoinTable(
			name = "projemp",
			joinColumns = {
					@JoinColumn(name="empid", referencedColumnName = "empid")	
			},
			inverseJoinColumns = {
					@JoinColumn(name="projid", referencedColumnName = "projid")
			}
	)
	private Set<ProjBean> projs;
	public Set<ProjBean> getProjs() {
		return projs;
	}
	public void setProjs(Set<ProjBean> projs) {
		this.projs = projs;
	}

	@ManyToOne
	@JoinColumn(
			name = "deptid",
			referencedColumnName = "deptid",
			insertable = false,
			updatable = false
	)
	private DeptBean dept;
	public DeptBean getDept() {
		return dept;
	}
	public void setDept(DeptBean dept) {
		this.dept = dept;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer empid;
	private String empname;
	private Integer salary;
	private String sex;
	private byte[] photo;
	private Integer deptid;
	@Override
	public String toString() {
		return "EmpBean [empid=" + empid + ", empname=" + empname + ", salary=" + salary + ", sex=" + sex + ", deptid="
				+ deptid + "]";
	}
	public Integer getEmpid() {
		return empid;
	}
	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	public Integer getDeptid() {
		return deptid;
	}
	public void setDeptid(Integer deptid) {
		this.deptid = deptid;
	}
}
