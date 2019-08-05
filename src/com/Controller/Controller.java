package com.Controller;

import com.Inputs.Delete_Menu;
import com.Inputs.Fetch_Menu;
import com.Operations.Create_New_Emp;

public class Controller  {

	public Controller(int user_choice) throws Exception{
		switch (user_choice) {
		case 1:
			Create_New_Emp ce = new Create_New_Emp();
			ce.newEmployee();
			break;
		case 2:
			new Fetch_Menu().options();
			break;
		case 3:
			new Delete_Menu().deleteOptions();;
			break;
		case 4:
			System.out.println("Thank You");
			System.exit(0);
			break;
		default:
			System.out.println("Wrong Option, Please select Correct Option");
		}

	}

}
