package resourceBundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleDemo {
	public static void main(String[] args) {
		
		// Locale class is used
		// Constructor for local object will be (languageCode,contryCode)
		Locale localeUS = new Locale("en","US");
		// Abstract class resourceBundle is used.
		// format is the fileName 
		// localUS is the object name of the class.
		ResourceBundle bundle = ResourceBundle.getBundle("format",localeUS);
		//use getString or else memory address will be printed.
		// argument is the key.
		System.out.println(bundle.getString("dateformat"));
		
		Locale localeFr = new Locale("fr");
		ResourceBundle bundle2 = ResourceBundle.getBundle("format",localeFr);
		System.out.println(bundle2.getString("dateformat"));
		Locale localeUK = new Locale("en","UK");
		ResourceBundle bundle3 = ResourceBundle.getBundle("format",localeUK);
		System.out.println(bundle3.getString("dateformat"));
		Locale localeFrError = new Locale("fr");
		ResourceBundle bundle4 = ResourceBundle.getBundle("error",localeFrError);
		System.out.println(bundle4.getString("nameerror"));
	}
}
