package propertiesPackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/*
 * in this file we don't take input using code.
 * we directly create a .properties file in resource folder.
 */

public class DBProperties {
	
	// This method is used to load the Properties file
	private Properties loadProperties() {
		InputStream iStream = null;
		Properties props = new Properties();
		try {
			// to load properties file from the classPath.
			iStream = this.getClass().getClassLoader().getResourceAsStream("myprops.properties");
			if(iStream==null){
				throw new IOException("File not found.");
			}
			props.load(iStream);
		} catch(IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				if(iStream != null) {
					iStream.close();
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		return props;
	}
	
	private void readProperties(Properties properties) {
		System.out.println("User name : "+properties.getProperty("username"));
		System.out.println("User name : "+properties.getProperty("password"));
	}

	public static void main(String[] args) {
		DBProperties propDemo = new DBProperties();
		Properties props = propDemo.loadProperties();
		propDemo.readProperties(props);
	}

}
