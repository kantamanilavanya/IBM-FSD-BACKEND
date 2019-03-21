package org.io;

import java.io.BufferedReader;
import java.io.File;


public class FileExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("C:\\Temp");
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		System.out.println(file.isDirectory());
		System.out.println(file.lastModified());
		for(File files:file.listFiles()) {
			System.out.println(files.getName());
			
		}
		
		

	}

}
