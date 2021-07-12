package com.srm.cjava.week3.day18.serialization;
import java.io.*;

public class DeseriImpl {

	public static void main(String[] args) throws Exception{

		try {
			FileInputStream fis = new FileInputStream("Seridata.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Employee empl = (Employee) ois.readObject();
			System.out.println("Employee details has been deserialized.");
			
			
			
            System.out.println("Employee Details======>");
			System.out.println("Name = " + empl.getEname());
            System.out.println("Id = " + empl.getEid());
            System.out.println("Age = " + empl.getAge());
			System.out.println("Designation = " + empl.getDesig());
            System.out.println("Salary = " + empl.getSal());


            fis.close();
			ois.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
