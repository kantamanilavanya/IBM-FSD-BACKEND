package org.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderExample {
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			FileReader inReader=new FileReader("C:\\Users\\LavanyaKantamani\\Desktop\\Reader.txt");
			FileWriter outWriter=new FileWriter("C:\\Users\\LavanyaKantamani\\Desktop\\HelloWorldWriter.txt");
			int d;
			while((d=inReader.read())!=-1) {
				outWriter.write(d);
			}
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}

}
