package org.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ConsoleExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter file =new FileWriter("C:\\Users\\LavanyaKantamani\\Desktop\\console.txt",true);
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer=new BufferedWriter(file);
		
		System.out.println("Enter EmployeeId");
		int id=reader.read();
		System.out.println("Enter EmployeeName");
		String name=reader.readLine();
		
		writer.write("EmployeeId"+" "+"EmployeeName");
		writer.newLine();
		
		writer.write(id+""+name);
		writer.flush();
		

	}

}
