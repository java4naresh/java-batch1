package corejavaprograms;

public class Methods
{
	int empID;
	String empName;
	double empSal;
	String role;
	public Methods(int empID, String empName, double empSal, String role)
	{
		super();
		this.empID = empID;
		this.empName = empName;
		this.empSal = empSal;
		this.role = role;
	}
	@Override
	public String toString()
	{
		return "Methods [empID=" + empID + ", empName=" + empName + ", empSal=" + empSal + ", role=" + role + "]";
	}
	@Override
	public int hashCode()
	{
		return this.empID;
		
	}
	@Override
	public boolean equals(Object obj)
	{
		Methods m=(Methods)obj;
		if(this.empID==m.empID&&this.empSal==m.empSal)
		{
			return true;
		}
		return false;
			
	}
	public static void main(String[] args)
	{
		Methods m1=new Methods(39," Divya", 15000.0, "Dev");
		Methods m2=new Methods(68,"Goutami",15000.0,"Tester");
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
		System.out.println(m1==m2);
		System.out.println(m1.equals(m2));
		
	}
	

}
