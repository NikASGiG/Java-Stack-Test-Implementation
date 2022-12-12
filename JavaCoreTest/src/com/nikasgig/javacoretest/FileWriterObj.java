package com.nikasgig.javacoretest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileWriterObj {

	public String path = "src"+File.separator+"com"+File.separator+"nikasgig"+File.separator+"javacoretest"+ File.separator +"data" + File.separator;
	
	public File file;
	public PrintWriter pw;
	
	public FileWriterObj(String path) {
		this.path += path;
		// TODO Auto-generated constructor stub
		file = OpenFile(path);
		
		try {
			pw = new PrintWriter(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File '" + path + "' is not open");
			e.printStackTrace();
		}
		
		
	}
	
	public File OpenFile(String path) {
		return new File(path);
	}
	
	
	
	
	
	
	
	
	
	
	

}
