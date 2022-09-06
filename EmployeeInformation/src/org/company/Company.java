package org.company;

import org.project.Project;

public class Company extends Project {

	public void CompanyName() {
		System.out.println("Company name : Atos");
	}

	public static void main(String[] args) {
		Company c= new Company();
		c.CompanyName();
		
	}

}
