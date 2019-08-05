package com.FileConvert;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FetchFromFile {

	public Scanner loadFile() throws IOException {
		File file = new File("C:\\Users\\ARJUN.SANTRA\\eclipse-workspace\\EmployeeDetails.txt");
		FileReader filereader = new FileReader(file);
		Scanner sc = new Scanner(filereader);
		return sc;
	}
}
