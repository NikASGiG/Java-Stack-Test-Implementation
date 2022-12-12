package com.nikasgig.javacoretest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileHandler {

	public String sep = File.separator;
	public String path;
	public String path2;
	public File file;
	public File file2;
	public Scanner fileScan;
	public PrintWriter pw;
	
	public FileHandler(String path) {
		this.path = path;
		file = OpenFile(path);
		try {
			fileScan = new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.println("File '" + path +"' is not open");
			
			
			try {
				
				path = "src"+File.separator+"com"+File.separator+"nikasgig"+File.separator+"javacoretest"+ File.separator +"data" + File.separator +"text.txt";
				this.path = path;
				file = OpenFile(path);
				fileScan = new Scanner(file);
				this.path2 = "src"+File.separator+"com"+File.separator+"nikasgig"+File.separator+"javacoretest"+ File.separator +"data" + File.separator +"out.txt";
				file2 = OpenFile(path2);
				
				pw = new PrintWriter(file2);
				
				
			} catch (FileNotFoundException e2) {
				System.out.println("File '" + path +"' is not open");
				// TODO: handle exception
				e2.printStackTrace();
			}
			
			
		}
	}
	
	public File OpenFile(String path) {
		return new File(path);
	}
	
	public void ShowFile() {
		while (fileScan.hasNext()) {
			String string = (String) fileScan.next();
			System.out.println(string);
		}
	}
	
	public void Write(String str) {
		pw.println(str);
	}
	
	
	
	
	
	
}
