package propertiesPackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFileLoad {

	private static Properties loadProperties(String fileName) {
		
		InputStream propFile;
		Properties props = new Properties();
		
		try {
			propFile = new FileInputStream(fileName);
			props.load(propFile);
			propFile.close();
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}
		return props;
	}
	
	public static void main(String[] args) {
		final String PROPERTIES_FILE = "MyApplication.properties";
		Properties myProps;
		myProps = loadProperties(PROPERTIES_FILE);
		System.out.println(myProps.get("UserName"));
		System.out.println(myProps.get("Password"));
	}

}
