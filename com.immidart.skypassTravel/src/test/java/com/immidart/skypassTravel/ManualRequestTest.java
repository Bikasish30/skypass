package com.immidart.skypassTravel;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.immidart.skypassTravel.businessLibrary.CreateManualRequestLib;
import com.immidart.skypassTravel.businessLibrary.LoginToApplicationLib;
import com.immidart.skypassTravel.businessLibrary.LogoutFromApplicationLib;
import com.immidart.skypassTravel.businessLibrary.OperationTrackerSearchLib;
import com.immidart.skypassTravel.genericLibrary.Driver;

 // Create manual test

@Listeners(com.immidart.skypassTravel.genericLibrary.Listener.class)
public class ManualRequestTest {

	Driver driverObject = new Driver();
	CreateManualRequestLib createManualRequestObject;
	LoginToApplicationLib loginToApplicationObject;
	LogoutFromApplicationLib logoutFromApplicationObject;
	OperationTrackerSearchLib operationTracker;

	@BeforeClass
	public void beforeTest() {
		driverObject.openBrowser();
		driverObject.openApplication();
	}

	@BeforeMethod
	public void beforeTestMethod() {
		loginToApplicationObject = new LoginToApplicationLib();
		loginToApplicationObject.loginToApplication();
	}

	@Test
	public void createManualRequestTest() {
		createManualRequestObject = new CreateManualRequestLib();
		createManualRequestObject.creatManualRequest();
	}
	/*
	 * @Test(dependsOnMethods = { "createManualRequest" }) public void
	 * operationTrackerTest() { operationTracker = new OperationTracker();
	 * operationTracker.searchForARequest();
	 * 
	 * }
	 */

	@AfterMethod
	public void afterTestMethod() {
		logoutFromApplicationObject = new LogoutFromApplicationLib();
		logoutFromApplicationObject.logOutFromApplication();
	}

	@AfterClass
	public void afterTest() {
		driverObject.closeBrowser();
	}
}
