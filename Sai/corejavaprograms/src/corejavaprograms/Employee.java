package corejavaprograms;

public class Employee {
	String id;
	String name;
	float salary;
	String address;
	String mobileno;
	public Employee(String emp_Id, String emp_Name, float emp_Salary, String emp_Address, String emp_MobileNo) {

		id=emp_Id;
		name=emp_Name;
		salary=emp_Salary;
		address=emp_Address;
		mobileno=emp_MobileNo;


	} 
	public Employee(String emp_Id, String emp_Name, float emp_Salary, String emp_Address) {

		id=emp_Id;
		name=emp_Name;
		salary=emp_Salary;
		address=emp_Address;



	}

	public void getEmpDetails(){
		System.out.println("Emp_Details");
		System.out.println("");
		System.out.println("Employee Id:"+id);
		System.out.println("Employee Name:"+name);
		System.out.println("Employee Salary:"+salary);
		System.out.println("Employee MobileNo:"+mobileno);

	}


}