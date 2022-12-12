package com.nikasgig.javacoretest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

public class FileWriterObj {

	public String path2 = "src"+File.separator+"com"+File.separator+"nikasgig"+File.separator+"javacoretest"+ File.separator +"data" + File.separator;
	
	public File file2;
	public PrintWriter pw;
	public FileOutputStream fos;
	public ObjectOutputStream oos;
	
	
	public FileInputStream fis;
	public ObjectInputStream ois;
	
	public FileWriterObj(String path) {
		this.path2 += path;
		// TODO Auto-generated constructor stub
		file2 = OpenFile(path);
		
		try {
			fos = new FileOutputStream(path2);
			try {
				oos = new ObjectOutputStream(fos);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			pw = new PrintWriter(file2);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File '" + path + "' is not open");
			e.printStackTrace();
		}
		
		//////////////////// fis ois
		
		try {
			fis = new FileInputStream(path2);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			ois = new ObjectInputStream(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	public File OpenFile(String path) {
		return new File(path);
	}
	
	public void Close() {
		try {
			oos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void Add(Object obj) {
		try {
			oos.writeObject(obj);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public Corgi Get(Corgi obj) {
		
			try {
				obj = (Corgi) ois.readObject();
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return obj;
	}
	
	
	

}
