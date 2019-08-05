package com.Inputs;

import com.Operations.Delete_Operation;

import java.util.*;

public class Delete_Menu extends Fetch_Menu {
	Scanner scanner = new Scanner(System.in);
	Delete_Operation dem = new Delete_Operation();

	public Delete_Menu()throws Exception {

	}

	public void deleteOptions() {
		try {

			switch (scanner.nextInt()) {
			case 1:
				dem.delete();
				break;
			case 2:
				System.out.println("Please enter the id of the Employee");
				int id = scanner.nextInt();
				dem.delete(id);
				break;

			case 3:
				System.out.println("Please enter the Name of the Employee");
				scanner.nextLine();
				String name = scanner.nextLine();
				dem.delete(name);
				break;

			case 4:

				System.out.println("Please enter the Department of the Employee");
				scanner.nextLine();
				String department = scanner.nextLine();
				dem.delete(department);
				break;

			default:
				System.out.println("Sorry! Wrong Input");
			}
		} catch (Exception e) {
			System.out.println("Sorry! Please enter the correct input");
			deleteOptions();
		}

	}
}
