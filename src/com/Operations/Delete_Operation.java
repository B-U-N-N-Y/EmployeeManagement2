package com.Operations;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import com.FileConvert.Rewritten;

public class Delete_Operation extends Fetch_Operation {
	
	FileWriter fw;
	Rewritten rewrite = new Rewritten();
	
	public Delete_Operation() throws IOException
	{
		try {

			fw = rewrite.rewriteFile();
		} catch (IOException e) {
			System.out.println("File path not found");
		}
	}
	
	int flag = 0;
	
	public void delete() throws IOException  {
		while (sc.hasNextLine()) {
			String[] str = sc.nextLine().split(" ");

				for (String y : str) {
				}
				System.out.println("----------------------------");
				fw.close();
				rewrite.rename();
			}
			System.out.println("all Records deleted");
	}

	public void delete(String name)throws IOException {
		while (sc.hasNextLine()) {
			String[] str = sc.nextLine().split(" ");

			if (!str[0].equalsIgnoreCase(name) ||!str[6].equalsIgnoreCase(name)){
				flag = 1;
				for (String y : str) {
					fw.write(y);
					fw.write(" ");
				}
				System.out.println("----------------------------");
				fw.close();
				rewrite.rename();
			}
		}
		if (flag == 0) {
			System.out.println("No Records Found");
		}
	}

	public void delete(int id)throws IOException {

		while (sc.hasNextLine()) {
			String[] str = sc.nextLine().split(" ");

			if (!str[4].equals(Integer.toString(id))) {
				for (String y : str) {
					flag = 1;
					fw.write(y);
					fw.write(" ");
				}
				System.out.println("----------------------------");
				fw.close();
				rewrite.rename();
			}
		}

		if (flag == 0) {
			System.out.println("No Records Found");
		}
}
}
