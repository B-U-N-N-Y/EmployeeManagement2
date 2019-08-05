package com.FileConvert;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Rewritten {

	public FileWriter rewriteFile() throws IOException {
		File file = new File("C:\\Users\\ARJUN.SANTRA\\eclipse-workspace\\EmployeeDetails.txt");
		FileWriter filewriter = new FileWriter(file);
		return filewriter;
	}

	/*
	 * In this method, i'm rewriting the file of the new data
	 */
	public void rename() throws IOException, ArrayIndexOutOfBoundsException {
		FileReader filereader = new FileReader("C:\\Users\\ARJUN.SANTRA\\eclipse-workspace\\EmployeeDetails1.txt");
		FileWriter filewriter = new FileWriter("C:\\Users\\ARJUN.SANTRA\\eclipse-workspace\\EmployeeDetails.txt");
		Scanner sc1 = new Scanner(filereader);
		while (sc1.hasNextLine()) {
			String[] str1 = sc1.nextLine().split(" ");
			for (String x : str1) {
				filewriter.write(x + " ");
			}
			filewriter.write("\n");
		}
		sc1.close();
		filereader.close();
		filewriter.close();
	}
}
