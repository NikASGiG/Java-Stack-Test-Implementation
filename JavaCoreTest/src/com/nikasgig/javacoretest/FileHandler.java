package com.nikasgig.javacoretest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandler {

	public String sep = File.separator;
	public String path;
	public File file;
	public Scanner fileScan;
	
	public FileHandler(String path) {
		this.path = path;
		file = OpenFile(path);
		try {
			fileScan = new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.println("File '" + path +"' is not open");
			
			
			try {
				
				path = "C:"+sep+"Users"+sep+"NikAS GiG"+sep+"git"+sep+"Java-Stack-Test-Implementation"+sep+"JavaCoreTest"+sep+"src"+sep+"com"+sep+"nikasgig"+sep+"javacoretest"+sep+"data"+sep+"text.txt";
				this.path = path;
				file = OpenFile(path);
				fileScan = new Scanner(file);
				
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
	
	
}
