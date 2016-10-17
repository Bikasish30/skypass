package com.immidart.skypassTravel;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.immidart.skypassTravel.businessLibrary.LoginToApplicationLib;
import com.immidart.skypassTravel.businessLibrary.LogoutFromApplicationLib;
import com.immidart.skypassTravel.businessLibrary.OperationDependentDetailsLib;
import com.immidart.skypassTravel.businessLibrary.OperationItineraryDetailsLib;
import com.immidart.skypassTravel.businessLibrary.OperationPassengerDetailsLib;
import com.immidart.skypassTravel.businessLibrary.OperationProjectDetailsLib;
import com.immidart.skypassTravel.businessLibrary.OperationRequestBasicDetailsLib;
import com.immidart.skypassTravel.businessLibrary.OperationTrackerSearchLib;
import com.immidart.skypassTravel.genericLibrary.Driver;

// operation tracker comment

public class OperationTrackerTest {

	Driver driverObject = new Driver();
	LoginToApplicationLib loginToApplicationObject;
	LogoutFromApplicationLib logoutFromApplicationObject;
	OperationTrackerSearchLib operationTrackerSearch;
	OperationRequestBasicDetailsLib operationRequestBasicDetailsLibObject;
	OperationPassengerDetailsLib operationPassengerDetailsLibObject;
	OperationProjectDetailsLib operationProjectDetailsLibObject;
	OperationDependentDetailsLib operationDependentDetailsLibObject;
	OperationItineraryDetailsLib operationItineraryDetailsObject;

	@BeforeClass
	public void beforeClass() {
		driverObject.openBrowser();
		driverObject.openApplication();
		loginToApplicationObject = new LoginToApplicationLib();
		loginToApplicationObject.loginToApplication();
	}

	@Test
	public void operationTrackerSearchTest() {
		System.out.println("In 1nd test");
		operationTrackerSearch = new OperationTrackerSearchLib();
		operationTrackerSearch.searchForARequest();
	}

	@Test(dependsOnMethods = { "operationTrackerSearchTest" })
	public void OperationRequestBasicDetailsTest() {
		System.out.println("In 2nd test");
		operationRequestBasicDetailsLibObject = new OperationRequestBasicDetailsLib();
		operationRequestBasicDetailsLibObject.operationTrackerRequestBasicDetail();
	}

	@Test(dependsOnMethods = { "OperationRequestBasicDetailsTest" })
	public void operationTrackerPassengerDetailsTest() {
		System.out.println("In 3nd test");
		operationPassengerDetailsLibObject = new OperationPassengerDetailsLib();
		operationPassengerDetailsLibObject.operationTrackerPassengerDetails();
	}

	@Test(dependsOnMethods = { "operationTrackerPassengerDetailsTest" })
	public void operationTrackerProjectDetailsTest() {
		System.out.println("In 4nd test");
		operationProjectDetailsLibObject = new OperationProjectDetailsLib();
		operationProjectDetailsLibObject.operationTrackerProjectDetails();
	}

	@Test(dependsOnMethods = { "operationTrackerProjectDetailsTest" })
	public void operationTrackerDependentDetailsTest() {
		System.out.println("In 5nd test");
		operationDependentDetailsLibObject = new OperationDependentDetailsLib();
		operationDependentDetailsLibObject.operationTrackerDependentDetails();
	}

	@Test(dependsOnMethods = { "operationTrackerDependentDetailsTest" })
	public void OperationItineraryDetailsTest() {
		System.out.println("In 6nd test");
		operationItineraryDetailsObject = new OperationItineraryDetailsLib();
		operationItineraryDetailsObject.OperationItineraryDetails();
	}

	@AfterClass
	public void afterClass() {
		logoutFromApplicationObject = new LogoutFromApplicationLib();
		logoutFromApplicationObject.logOutFromApplication();
		driverObject.closeBrowser();
	}
}
