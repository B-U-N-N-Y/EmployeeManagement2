package com.Inputs;

import java.util.*;

import com.Controller.Controller;

public class Inputs {
	final private static String Password = "Atmecs";
	final private static String Usernam = "Arjun";
	Scanner input = new Scanner(System.in);
	public int user_choice;

	public void login() {
		try {
		System.out.println("*****  Login  *****");
		System.out.print("Please Enter your Username: ");
		String username = input.nextLine();
		System.out.print("Please Enter your Password: ");
		String password = input.nextLine();
		if (Password.equals(password) && Usernam.equals(username)) {
			System.out.println("\nSuccefully Login\n");
			userOption();
		} else {
			System.out.println("You Enter Wrong Details");
		}

	}
		catch(NullPointerException e)
		{
			System.out.println("UserName or Password cannot be Empty");
		}
	}

	public void userOption() {
		try {
		while (1 > 0) {
			System.out.println("Please choose one of the below options" + "\n1:Create New Employee."
					+ "\n2:Fetch Employee Details." + "\n3:Delete Employee Details." + "\n4:Exit ");
			user_choice = input.nextInt();
			new Controller(user_choice);
		}
		}
		catch (Exception e) {
			System.out.println("Wrong input\n Please select from the given options only");
			 userOption();
		}

	}

}
