package com.immidart.skypassTravel.genericLibrary;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class ScreenShot {
	public static void getScreenShot(String screenShotFileName) throws Exception {

		EventFiringWebDriver obj;

		// Date time capturing
		DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
		DateFormat timeFormat = new SimpleDateFormat("hhmm");
		Date date = new Date();
		String capturedDate = dateFormat.format(date);
		String captureTime = timeFormat.format(date);
		
		String dateTime = capturedDate+"_"+captureTime+"hrs";
		
		String projectPath = System.getProperty("user.dir");
		String fileName = screenShotFileName;
		String fileExtention = ".png";
		String forwardSlash = "//";
		String folderName = "ScreenShots";
		
		String newFolderPath = projectPath + forwardSlash + folderName;
		
		String folderPath = projectPath + forwardSlash + folderName + forwardSlash + fileName + dateTime + fileExtention;
		File folder = new File(folderPath);

		

		if (folder.exists()) {
			obj = new EventFiringWebDriver(Driver.driver);
			File takenScreenShot = obj.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(takenScreenShot, folder);
		} else {
			File newFolder = new File(newFolderPath);
			newFolder.mkdir();

			String newFolderPathForScreenShot = newFolderPath + forwardSlash + fileName + dateTime + fileExtention;
			File destFolderForScreenShot = new File(newFolderPathForScreenShot);

			obj = new EventFiringWebDriver(Driver.driver);
			File takenScreenShot = obj.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(takenScreenShot, destFolderForScreenShot);
		}
	}
}
