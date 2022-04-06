package propertiesPackage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.*;

public class PropertiesFile {
	
	private static Properties addProperties() {
		Properties props  = new Properties();
		props.setProperty("UserName","testUser");
		props.setProperty("Password","testUser@123");
		return props;	
	}
	
	private static void savePropertyFiles(Properties properties,String fileName) {
		
		try(OutputStream propFile = new FileOutputStream(fileName)){
			properties.store(propFile,"Properties File");
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		final String PROPERTIES_FILE = "MyApplication.properties";
		Properties myProps;
		myProps = addProperties();
		savePropertyFiles(myProps,PROPERTIES_FILE);
	}
}
