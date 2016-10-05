package com.immidart.skypassTravel.businessLibrary;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.immidart.skypassTravel.genericLibrary.Driver;
import com.immidart.skypassTravel.pageFactory.LandingPage;
import com.immidart.skypassTravel.pageFactory.OperationTrackerDependentDetails;
import com.immidart.skypassTravel.testData.OperationDependentDetailsTestData;



public class OperationDependentDetailsLib {

	OperationTrackerDependentDetails operationTrackerDependentDetailsObject;
	OperationDependentDetailsTestData operationDependentDetailsTestDataObject;
	LandingPage landingPageObject;

	public void operationTrackerDependentDetails() {
		operationTrackerDependentDetailsObject = PageFactory.initElements(Driver.driver,
				OperationTrackerDependentDetails.class);

		operationTrackerDependentDetailsObject.clickOnDependentDetailsTab();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.getMessage();
		}
		operationTrackerDependentDetailsObject.clickOnDependentAddButton();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.getMessage();
		}

		operationDependentDetailsTestDataObject = new OperationDependentDetailsTestData();
		operationDependentDetailsTestDataObject.getOperationDependentDetails();

		operationTrackerDependentDetailsObject
				.selectDependentRelationShip(OperationDependentDetailsTestData.dependentRelationship);
		operationTrackerDependentDetailsObject.enterDependentName(OperationDependentDetailsTestData.dependentName);
		operationTrackerDependentDetailsObject.selectDependentGender(OperationDependentDetailsTestData.dependentGender);
		operationTrackerDependentDetailsObject
				.enterDependentDateOfBirth(OperationDependentDetailsTestData.dependentDateOfBirth);
		operationTrackerDependentDetailsObject.enterDependentAge(OperationDependentDetailsTestData.dependenrtAge);
		operationTrackerDependentDetailsObject
				.selectDependentMealType(OperationDependentDetailsTestData.dependenrtMealType);
		operationTrackerDependentDetailsObject
				.selectDependentSeatType(OperationDependentDetailsTestData.dependentSeatType);
		operationTrackerDependentDetailsObject.clickOnDependentDetailsSaveButton();
		
		landingPageObject = new LandingPage();
		
		if (landingPageObject.getTosterMessage().equalsIgnoreCase("Travel Dependant Updated")) {
			try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {
				e.getMessage();
			}
			Reporter.log("Dependent created successfully..!");

		} else {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.getMessage();
			}
			Reporter.log("Dependent Already Exist...!");
			// Assert.fail();
			Assert.assertEquals(landingPageObject.getTosterMessage(),
					"Travel Dependant Updated", "Request Already Exist...!");
		}
		
	}
}
