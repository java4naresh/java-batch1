package com.divya.frontController;

public class StudentBO 
{
	private int Id;
	private String Name;
	private String Email;
	private String Branch;
	private int PhNo;
	public StudentBO()
	{
		super();
		
	}
	public StudentBO(int id, String name, String email, String branch, int phNo)
	{
		super();
		Id = id;
		Name = name;
		Email = email;
		Branch = branch;
		PhNo = phNo;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getBranch() {
		return Branch;
	}
	public void setBranch(String branch) {
		Branch = branch;
	}
	public int getPhNo() {
		return PhNo;
	}
	public void setPhNo(int phNo) {
		PhNo = phNo;
	}
	@Override
	public String toString() 
	{
		return "StudentBO [Id=" + Id + ", Name=" + Name + ", Email=" + Email + ", Branch=" + Branch + ", PhNo=" + PhNo
				+ "]";
	}
	
	

}
