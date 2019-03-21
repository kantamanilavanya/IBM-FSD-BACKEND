package org.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream in=null;
		FileOutputStream out=null;
		
		try {
			in=new FileInputStream("C:\\Users\\LavanyaKantamani\\Desktop\\HelloWorld.txt");
			out=new FileOutputStream("C:\\Users\\LavanyaKantamani\\Desktop\\HelloWorld1.txt");
			Scanner input=null;
			  input=new Scanner(new BufferedReader(new FileReader("C:\\Users\\LavanyaKantamani\\Desktop\\HelloWorld.txt")));
			  while(input.hasNextLine()) {
				  System.out.println(input.nextLine());
			  }
			int c;
			
			
			  while((c=in.read())!=-1) { //System.out.println((char)c); out.write(c);
			  
			  }
			  
			 
			
			System.out.println("copied Succesfully");
		}catch(FileNotFoundException e) {
		System.out.println();	
		}
		finally {
			if(in!=null) {
				in.close();
			}
			if(out!=null) {
				out.close();
			}
		}
		

	}

}
