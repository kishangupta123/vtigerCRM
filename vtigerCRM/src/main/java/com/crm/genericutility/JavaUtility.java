package com.crm.genericutility;

import java.time.LocalDateTime;
import java.util.Random;

/**
 * @author Kishan Kumar Gupta
 */
public class JavaUtility {
	/**
	 * This method is used to capture current system date and time.
	 * 
	 * @return String
	 */
	public String getJavaSystemTime() {
		return LocalDateTime.now().toString().replace(":", "-");
	}

	/**
	 * This method is used to generate random number within the specified range.
	 * 
	 * @return int
	 */
	public int getRandomNumber() {
		Random ran = new Random();
		return ran.nextInt(1000);
	}
}
