package teja;

public class Member {
	private String empId,empname,empdoj,empyoe,empdesignation;
	
	public Member() {
		super();
	}

	public Member(String empId, String empname, String empdoj, String empyoe, String empdesignation) {
		super();
		this.empId = empId;
		this.empname = empname;
		this.empdoj = empdoj;
		this.empyoe = empyoe;
		this.empdesignation = empdesignation;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getEmpdoj() {
		return empdoj;
	}

	public void setEmpdoj(String empdoj) {
		this.empdoj = empdoj;
	}

	public String getEmpyoe() {
		return empyoe;
	}

	public void setEmpyoe(String empyoe) {
		this.empyoe = empyoe;
	}

	public String getEmpdesignation() {
		return empdesignation;
	}

	public void setEmpdesignation(String empdesignation) {
		this.empdesignation = empdesignation;
	}
	
	

}
