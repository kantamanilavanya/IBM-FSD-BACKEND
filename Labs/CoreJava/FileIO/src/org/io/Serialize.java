package org.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee(100,23,"lavanya"); 
			
			try {
				FileOutputStream file=new FileOutputStream("C:\\Users\\LavanyaKantamani\\Desktop\\console.txt");
				ObjectOutputStream o=new ObjectOutputStream(file);
				o.writeObject(e);
				
				FileInputStream files=new FileInputStream("C:\\Users\\LavanyaKantamani\\Desktop\\console.txt");
				ObjectInputStream file1=new ObjectInputStream(files);
				System.out.println(file1.readObject().toString());
				
				
				
				
			}catch(Exception exp) {
				exp.printStackTrace();
				//System.out.println(exp.get));
			}
			
			
		

	}

}
