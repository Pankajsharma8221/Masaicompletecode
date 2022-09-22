package com.q4;

public class Department {
	private int departmentId;
	private String departmentName; 
	
	public Department() {
		
	}
	
	
	public Department(int departmentId, String departmentName) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}


	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "Dempartment [departmentId=" + departmentId + ", departmentName=" + departmentName + "]";
	}
	
	
}
