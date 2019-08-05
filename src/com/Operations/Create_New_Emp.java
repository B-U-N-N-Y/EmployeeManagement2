package com.Operations;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import com.CustomException.NegativeAgeException;

public class Create_New_Emp {

	public void newEmployee() throws NegativeAgeException {
		try {

			Scanner input = new Scanner(System.in);
			System.out.println(" PERSONAL DETAILS    ");
			System.out.print("Please enter Employee Name:");
			String name = input.nextLine();
			System.out.print("Please enter Employee Age:");
			int age = input.nextInt();
			if (age <= 0) {
				throw new NegativeAgeException("Age Cannot be Negative! Please enter correct value");
			}

			input.nextLine();
			System.out.print("Please enter Gender of the Employee:");
			String gender = input.nextLine();
			System.out.print("Please enter Residence of the Employee:");
			String address = input.nextLine();

			System.out.println(" PROFESSIONAL DETAILS ");
			System.out.print("Please enter the Employee id:");
			int id = input.nextInt();
			System.out.print("Please enter the Employee Salary:");
			double salary = input.nextDouble();
			input.nextLine();
			System.out.print("Please enter your Employee Department:");
			String department = input.nextLine();
			System.out.print("Please enter the Skills Employee have:");
			String skills = input.nextLine();
			try {
				String s = name + " " + age + " " + gender + " " + address + " " + id + " " + salary + " " + department
						+ " " + skills + "\n";
				File file = new File("C:\\Users\\ARJUN.SANTRA\\eclipse-workspace\\EmployeeDetails.txt");
				FileWriter fw = new FileWriter(file, true);
				fw.write(s);
				fw.close();
			} catch (IOException e) {
			}
			System.out.println("Employee Added");
		} catch (InputMismatchException e) {
			System.out.println("Try Again wrong input");
			System.out.println("Please Enter Integer value");
			newEmployee();
		}
	}
}
