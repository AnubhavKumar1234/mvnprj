package Generic_Utitlity;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Property_Utility 
{
	/**
	 * this method is used to fetch the data from property file
	 * @author anubhav
	 * @param key
	 * @return
	 * @throws Throwable
	 */
	public String getKeyValue(String key ) throws Throwable
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/commondata.properties");
		Properties pro=new Properties();
		pro.load(fis);
		String value = pro.getProperty(key);
		return value;
		
	}

}
