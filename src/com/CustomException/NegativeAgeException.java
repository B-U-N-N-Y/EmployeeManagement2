package com.CustomException;

import com.Operations.Create_New_Emp;

public class NegativeAgeException extends Exception {
	public NegativeAgeException(String message) {
		System.out.println(message);
		/*
		 * Surrounded by try catch block to give Specific solution
		 */
		try {
			new Create_New_Emp().newEmployee();
		} catch (NegativeAgeException e) {
			// TODO Auto-generated catch block
			System.out.println("Negative Age Entered! please try again");
		}
	}

}
