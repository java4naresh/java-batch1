package com.Triveni.Java;

class Details {
	String name;
	String mailId;
	String designation;
	double salary;

	Details() {
	}

	Details(String name) {
		this.name = name;
	}

	Details(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	Details(String name, double salary, String mailId) {
		this.name = name;
		this.mailId = mailId;
		this.salary = salary;
	}

	Details(String name, double salary, String mailId, String designation) {
		this.name = name;
		this.mailId = mailId;
		this.designation = designation;
		this.salary = salary;
	}

	public static void main(String[] args) {
		Details s1 = new Details();
		Details s2 = new Details("Triveni");
		Details s3 = new Details("Mouni", 30000);
		Details s4 = new Details("Priya", 60000, "adb@gmail.com");
		Details s5 = new Details("SaiSree", 80000, "sai@gmail.com", "java Developer");
		System.out.println(" -----Constructor with out arguments --  " + s1);
		System.out.println(" ----Constructor with 1 arguments ------ ");
		System.out.println(s2.name);
		System.out.println("----Constructor with 2 arguments----");
		System.out.println(s3.name);
		System.out.println(s3.salary);
		System.out.println("----Constructor with 3 arguments---");
		System.out.println(s4.name);
		System.out.println(s4.salary);
		System.out.println(s4.mailId);
		System.out.println("------Constructor with 4 arguments----");
		System.out.println(s5.name);
		System.out.println(s5.salary);
		System.out.println(s5.mailId);
		System.out.println(s5.designation);

	}
}
