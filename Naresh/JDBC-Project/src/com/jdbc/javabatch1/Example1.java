package com.jdbc.javabatch1;



public class Example1 {

	public static void main(String[] args) {
		Student s = new Student(6,"Chiranjeevi", "Konidela", "mega@gmail.com","E.C.E", 101, "Hyderabad");
		CrudOperations co = new CrudOperations();
		//co.show();
		//co.save(s);
		//co.updateFirstName("Megastar", 5);
		co.delete(6);
	}

}
