package restart;

public class GetnSetExp {
	
	private int eid;
	private String eName;
	private String eDesignation;
	private String eCompany;
	
	public int getEid() {
		return eid;
	}
	public void setEmpid(final int eid) {
		this .eid = eid;
	}
	public String getEmpName() {
		return eName;
	}
	public void setEmpName(final String eName) {
		 if(eName == null || eName.length()<=0)
		 {
			 throw new IllegalArgumentException();
		}
	this.eName = eName;
}
	public String getEmpDesignation() {
		return eDesignation;
	}
	
	public void setEmpDesignation(final String eDesignation) {
		this.eDesignation = eDesignation;
	}
	public String getEmpCompany() {
		return eCompany;
	}
	public void setEmpCompany(final String eCompany) {
		this.eCompany = eCompany;
	}
	public String toString() {
		//String str = "Employee:[id ="+getEid()+",name ="+getEmpName()+",designation="+getEmpDesignation()+",company="+getEmpCompany()+"]";
		String str = "id = "+getEid()+", Name = "+getEmpName()+", designation = "+getEmpDesignation()+", company = "+getEmpCompany();
		return str;
	}
//	public  getterSetterExample1() {
//		
//	}

	public static void main(String[] args) {
		final GetnSetExp emp = new GetnSetExp();
		emp.setEmpid(107);
		emp.setEmpName("Kath");
		emp.setEmpDesignation("software Tester");
		emp.setEmpCompany("xyz Corporation");
        
		System.out.println(emp.toString());
	}

}
