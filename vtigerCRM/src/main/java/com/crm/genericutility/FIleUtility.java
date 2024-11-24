package com.crm.genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Kishan Kumar Gupta
 */
public class FIleUtility {
	/**
	 * This method is used to read data from property file.
	 * This method taskes key as a parameter and returns value.
	 * @param key
	 * @return
	 * @throws IOException
	 */
	
	public String getDataFromProperty(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData/commonData.properties");
		Properties prop = new Properties();
		prop.load(fis);
		return prop.getProperty(key);
	}
}
