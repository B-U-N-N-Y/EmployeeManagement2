package com.Operations;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import com.FileConvert.FetchFromFile;

public class Fetch_Operation extends FetchFromFile {
	short flag = 0;
	Scanner sc;
	public Fetch_Operation() throws IOException {
		//In this constructor i'm loading the file into our java context code from FetchFromFile class
				try {
					sc = new FetchFromFile().loadFile();
				} catch (FileNotFoundException e) {

					System.out.println("File Path Not Found! Please give correct path.");
				}
			}

	public void fetchDetails() {
		while (sc.hasNextLine()) {
			String[] str = sc.nextLine().split(" ");

			for (String y : str) {
				flag = 1;
				System.out.println(y);
			}
			System.out.println("----------------------------");
		}

		if (flag == 0) {
			System.out.println("No Records Found");
		}
	}

	public void fetchDetails(String name) {
		while (sc.hasNextLine()) {
			String[] str = sc.nextLine().split(" ");

			if (!str[0].equalsIgnoreCase(name) ||!str[6].equalsIgnoreCase(name)) {
				flag = 1;
				for (String y : str) {
					System.out.println(y);
				}
				System.out.println("----------------------------");
			}
		}
		if (flag == 0) {
			System.out.println("No Records Found");
		}
	}

	public void fetchDetails(int id) {
		while (sc.hasNextLine()) {
			String[] str = sc.nextLine().split(" ");

			if (str[4].equals(Integer.toString(id))) {
				for (String y : str) {
					flag = 1;
					System.out.println(y);
				}
				System.out.println("----------------------------");
			}
		}

		if (flag == 0) {
			System.out.println("No Records Found");
		}
	}

}
