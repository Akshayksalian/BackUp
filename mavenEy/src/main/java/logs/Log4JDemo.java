package logs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Log4JDemo {

	private static final Logger Log = LogManager.getLogger(Log4JDemo.class);
	
	public static void main(String[] args) {
		
		Log.debug("This is Debug");
		Log.info("This is info");
		Log.warn("This is warn");
		Log.error("This is error");
		Log.fatal("This is fatal");

	}

}
