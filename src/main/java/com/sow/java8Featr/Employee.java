package com.sow.java8Featr;

@FunctionalInterface
interface IEmployee {
	Employee emp (int employeeID, String employeeName, String employeeGender, String employeeCountry,
			String employeeState, String employeeCity);
}

public class Employee {

	private int employeeID;
	private String employeeName;
	private String employeeGender;
	private String employeeCountry;
	private String employeeState;
	private String employeeCity;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int employeeID, String employeeName, String employeeGender, String employeeCountry,
			String employeeState, String employeeCity) {
		super();
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.employeeGender = employeeGender;
		this.employeeCountry = employeeCountry;
		this.employeeState = employeeState;
		this.employeeCity = employeeCity;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeGender() {
		return employeeGender;
	}

	public void setEmployeeGender(String employeeGender) {
		this.employeeGender = employeeGender;
	}

	public String getEmployeeCountry() {
		return employeeCountry;
	}

	public void setEmployeeCountry(String employeeCountry) {
		this.employeeCountry = employeeCountry;
	}

	public String getEmployeeState() {
		return employeeState;
	}

	public void setEmployeeState(String employeeState) {
		this.employeeState = employeeState;
	}

	public String getEmployeeCity() {
		return employeeCity;
	}

	public void setEmployeeCity(String employeeCity) {
		this.employeeCity = employeeCity;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[Employee ID : " + employeeID + ", Employee Name : " + employeeName + ", Employee Gender : "
				+ employeeGender + ", Employee Country : " + employeeCountry + ", Employee State : " + employeeState
				+ ", Employee City : " + employeeCity + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((employeeCity == null) ? 0 : employeeCity.hashCode());
		result = prime * result + ((employeeCountry == null) ? 0 : employeeCountry.hashCode());
		result = prime * result + ((employeeGender == null) ? 0 : employeeGender.hashCode());
		result = prime * result + employeeID;
		result = prime * result + ((employeeName == null) ? 0 : employeeName.hashCode());
		result = prime * result + ((employeeState == null) ? 0 : employeeState.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Employee))
			return false;
		Employee other = (Employee) obj;
		if (employeeCity == null) {
			if (other.employeeCity != null)
				return false;
		} else if (!employeeCity.equals(other.employeeCity))
			return false;
		if (employeeCountry == null) {
			if (other.employeeCountry != null)
				return false;
		} else if (!employeeCountry.equals(other.employeeCountry))
			return false;
		if (employeeGender == null) {
			if (other.employeeGender != null)
				return false;
		} else if (!employeeGender.equals(other.employeeGender))
			return false;
		if (employeeID != other.employeeID)
			return false;
		if (employeeName == null) {
			if (other.employeeName != null)
				return false;
		} else if (!employeeName.equals(other.employeeName))
			return false;
		if (employeeState == null) {
			if (other.employeeState != null)
				return false;
		} else if (!employeeState.equals(other.employeeState))
			return false;
		return true;
	}
}