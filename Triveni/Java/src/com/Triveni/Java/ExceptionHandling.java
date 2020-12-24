package com.Triveni.Java;

import java.io.IOException;

public class ExceptionHandling {

			
			private static Employee[] employees = { new Employee(1, "Naresh"), new Employee(2, "Sai"), new Employee(3, "Divya"),
					new Employee(4, "Triveni") };

			public static void main(String[] args) throws IOException {
				try {
				int empId = 0;
				if(empId == 0) {
					throw new IOException("Employee Id never be null");
				}
				for (Employee employee : employees) {
					if(employee.getEmpId() == empId) {
						System.out.println(employee);
					}
				}
				} catch(EmployeeIdCheckException e) {
					System.err.println(e.getMessage());
				}

			}

		}

	}

}
