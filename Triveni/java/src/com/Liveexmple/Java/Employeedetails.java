package com.Liveexmple.Java;


public  class Employeedetails implements Comparable{
	int empNo;
	String empName;
	double salary;
	String position;
	String location;
	private Object emp;

	public Employeedetails(int empNo, String empName, double salary, String position, String location) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.salary = salary;
		this.position = position;
		this.location = location;
	}

	public final int getempNo() {
		return empNo;
	}

	public final void setempNo(int empNo) {
		this.empNo = empNo;
	}

	public final String getempName() {
		return empName;
	}

	public final void setempName(String empName) {
		this.empName = empName;
	}

	public final double getsalary() {
		return salary;
	}

	public final void setsalary(double salary) {
		this.salary = salary;
	}

	public final String getposition() {
		return position;
	}

	public final void setposition(String position) {
		this.position = position;
	}

	public final String getlocation() {
		return location;
	}

	public final void setlocation(String location) {
		this.location = location;
	}

	@Override
	public int hashCode() {
		return this.empNo;
	}

	@Override
	public boolean equals(Object obj) {
		Employeedetails emp = (Employeedetails) obj;
		if (this.empNo == emp.getempNo() && this.empName == emp.getempName() && this.salary == emp.getsalary()
				&& this.position == emp.getposition() && this.location == emp.getlocation())
			return true;
		/*if (this == obj)
			return true;
		if (emp == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employeedetails emp2 = (Employeedetails) obj;
		if (empNo != emp2.empNo)
			return false;
		if (empName == null) {
			if (emp2.empName != null)
				return false;
		} else if (!location.equals(emp2.location))
			return false;
		if (position == null) {
			if (emp2.position != null)
				return false;
		} else if (!position.equals(emp.position))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(emp.salary))
			return false;
		return true;*/
		return false;
	}

	@Override
	public String toString() {
		return "Employeedetails [empNo=" + empNo + ", empName=" + empName + ", salary=" + salary + ", position="
				+ position + ", location=" + location + "]";
	}
	@Override
	public int compareTo(Object ob)
	{
		Employeedetails emp=(Employeedetails)ob;
		return  this.position.compareTo(emp.getposition());
	}

	@Override
	public int empNo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String empName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double salary() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String position() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String location() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object emp() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
