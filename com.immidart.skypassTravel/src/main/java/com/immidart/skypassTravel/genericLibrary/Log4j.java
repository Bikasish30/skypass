package com.immidart.skypassTravel.genericLibrary;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4j {

	private static Logger log;

	public Logger getLogger() {
		return log;
	}

	public void setLogger(String loginngClassName) {
		Log4j.log = Logger.getLogger(loginngClassName);
		PropertyConfigurator.configure("log4j.properties");
	}

}
