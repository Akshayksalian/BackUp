package jdbcDemo.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.sql.DataSource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class DBUtil {
	
	private final static String PROPERTIES_FILE_NAME = "db.properties";
	private static HikariDataSource ds;
	
	/*
	 * static block runs only once.
	 */
	static {
		
		try {
			
			Properties properties = new Properties();
			
			InputStream inputStream = DBUtil.class.getClassLoader().getResourceAsStream(PROPERTIES_FILE_NAME);
			
			if(inputStream == null) {
				throw new IOException("File not found");
			}
			
			properties.load(inputStream);
			
			HikariConfig config = new HikariConfig();
			config.setDriverClassName(properties.getProperty("DB_DRIVER"));
			config.setJdbcUrl(properties.getProperty("DB_URL"));
			config.setUsername(properties.getProperty("DB_USERNAME"));
			config.setPassword(properties.getProperty("DB_PASSWORD"));
			config.setMaximumPoolSize(Integer.parseInt(properties.getProperty("MAX_POOL_SIZE")));
			config.addDataSourceProperty("cachePrepStmts","true");
			config.addDataSourceProperty("prepStmtCacheSize","250");
			config.addDataSourceProperty("prepStmtCacheSqlLimit","2048");
			
			ds = new HikariDataSource(config);
			
		} catch(IOException i) {
			i.printStackTrace();
		}
		
	}
	
	public static DataSource getDataSource() {
		return ds;
		
	}

}
