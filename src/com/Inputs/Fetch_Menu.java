package com.Inputs;

import java.io.IOException;
import java.util.*;

import com.Operations.Fetch_Operation;

public class Fetch_Menu {

	Scanner input = new Scanner(System.in);

	public Fetch_Menu() {
		System.out.println("\nPlease choose one of the below options\n" + " 1: All Employee\n" + " 2: Using Id\n"
				+ " 3: Using name\n" + " 4: Using Department\n");
		
	}

	public void options() throws IOException {

		Fetch_Operation fetch_emp = new Fetch_Operation();

		switch (input.nextInt()) {
		case 1:
			fetch_emp.fetchDetails();
			break;
		case 2:
			System.out.println("Please enter the id of the Employee");
			int id = input.nextInt();
			fetch_emp.fetchDetails(id);
			break;

		case 3:
			System.out.println("Please enter the Name of the Employee");
			input.nextLine();
			String name = input.nextLine();
			fetch_emp.fetchDetails(name);
			break;

		case 4:

			System.out.println("Please enter the Department of the Employee");
			input.nextLine();
			String department = input.nextLine();
			fetch_emp.fetchDetails(department);
			break;

		default:
			System.out.println("Sorry! Wrong Input");
		}
	}
}
