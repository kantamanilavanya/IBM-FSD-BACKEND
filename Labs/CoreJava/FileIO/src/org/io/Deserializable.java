package org.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class Deserializable {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Employee e=null;
		try {
		FileInputStream file=new FileInputStream("C:\\Users\\LavanyaKantamani\\Desktop\\console.txt");
		ObjectInputStream oStream=new ObjectInputStream(file);
		oStream.readLine();
		e=(Employee) oStream.readObject();
		}
		catch(Exception exp) {
			System.out.println(exp.getMessage());
		}
		System.out.println(e.id);
		System.out.println(e.name);
		System.out.println(e.age);

	}

}
