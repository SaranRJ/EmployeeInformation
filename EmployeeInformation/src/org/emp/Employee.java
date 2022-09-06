package org.emp;

//import org.client.Client;
import org.company.*;
//import org.project.Project;

public class Employee extends Company {

	public void empName() {
		System.out.println("Employee Name :Saran");

	}

	public static void main(String[] args) {
		Employee e = new Employee();
		e.empName();
		e.CompanyName();
		e.projectName();
		e.clientName();

		

	}

}
