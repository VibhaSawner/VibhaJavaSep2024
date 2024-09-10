package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFilesReader {
	public static  Properties prop;
	
	public static void main(String[] args) throws IOException {
		
		File file=new File("C:\\Users\\hp\\eclipse-workspace\\SeleniumFeb2224\\src\\Second\\amazon.properties");
		FileInputStream input=new FileInputStream(file);
		prop=new Properties();
		prop.load(input);
		
	}
	
	public static String getValue(String word) {
		String name=prop.getProperty(word);
		System.out.println(name);
		return name;
	}
}
