package com.immidart.skypassTravel.genericLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.MarionetteDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.EdgeDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import io.github.bonigarcia.wdm.MarionetteDriverManager;

public class Driver {

	public static WebDriver driver;
	Log4j loggerObject = new Log4j();

	public void openBrowser() {

		loggerObject.setLogger("Driver");

		switch (SkypassConstraint.browser.toUpperCase()) {
		case "CHROME":
			ChromeDriverManager.getInstance().setup();
			Reporter.log("Opening" + SkypassConstraint.browser.toUpperCase() + "browse..!");
			loggerObject.getLogger().info("Opening ["+SkypassConstraint.browser.toUpperCase()+"] browser..!");
			driver = new ChromeDriver();
			Reporter.log("Successfully opened" + SkypassConstraint.browser.toUpperCase() + " browser..!");
			driver.manage().window().maximize();
			break;
		case "FIREFOX":
			MarionetteDriverManager.getInstance().setup();
			Reporter.log("Opening" + SkypassConstraint.browser.toUpperCase() + "browse..!");
			driver = new MarionetteDriver();
			Reporter.log("Successfully opened" + SkypassConstraint.browser.toUpperCase() + " browser..!");
			driver.manage().window().maximize();
			break;
		case "IE":
			InternetExplorerDriverManager.getInstance().setup();
			Reporter.log("Opening" + SkypassConstraint.browser.toUpperCase() + "browse..!");
			driver = new InternetExplorerDriver();
			Reporter.log("Successfully opened" + SkypassConstraint.browser.toUpperCase() + " browser..!");
			driver.manage().window().maximize();
			break;
		case "EDGE":
			EdgeDriverManager.getInstance().setup();
			Reporter.log("Opening" + SkypassConstraint.browser.toUpperCase() + "browse..!");
			driver = new EdgeDriver();
			Reporter.log("Successfully opened" + SkypassConstraint.browser.toUpperCase() + " browser..!");
			driver.manage().window().maximize();
			break;
		default:
			Reporter.log("Valid browser has not been selected,Please select a valid browser..!");
			System.exit(0);
		}

	}

	public void openApplication() {
		driver.get(SkypassConstraint.skyPassQaUrl);
	}

	public void closeBrowser() {
		driver.close();
		driver.quit();
	}
}
