package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReader {
	
	static FileInputStream Fr;
	
	public static Properties getAPropertyFiles(){
		
	File file = new File("C:\\Users\\Kanisri\\eclipse-workspace\\Nykaa\\src\\main\\java\\com\\utility\\Nykaa.properties");
	try {
		Fr=new FileInputStream(file);
	} catch (FileNotFoundException e)
	{
		e.printStackTrace();
	}
	
	Properties property = new Properties();
	try {
		property.load(Fr);
	} catch (IOException e) 
	{
			e.printStackTrace();
	}
	return property;
	}

}
