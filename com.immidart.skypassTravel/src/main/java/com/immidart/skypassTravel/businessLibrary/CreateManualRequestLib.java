package com.immidart.skypassTravel.businessLibrary;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.immidart.skypassTravel.genericLibrary.Driver;
import com.immidart.skypassTravel.genericLibrary.SkypassConstraint;
import com.immidart.skypassTravel.pageFactory.LandingPage;
import com.immidart.skypassTravel.pageFactory.ManualFormPage;
import com.immidart.skypassTravel.testData.ManualRequestTestData;


public class CreateManualRequestLib {

	LandingPage landingPageObject;
	ManualFormPage manualFormObject;
	ManualRequestTestData manualREquestTestDataObject;

	public void creatManualRequest() {

		landingPageObject = PageFactory.initElements(Driver.driver, LandingPage.class);
		landingPageObject.clickOnManualFormLink();

		manualFormObject = PageFactory.initElements(Driver.driver, ManualFormPage.class);
		
		manualREquestTestDataObject = new ManualRequestTestData();
		manualREquestTestDataObject.getManualRequestData("CreateMenualRequestTestData");
		
		manualFormObject.selectClient(ManualRequestTestData.clientName);
		manualFormObject.selectClientLocation(ManualRequestTestData.clientLocation);
		manualFormObject.selectRequestType(ManualRequestTestData.requestType);
		manualFormObject.enterRequestNumber(ManualRequestTestData.requestNumber);
		manualFormObject.enterEmployNumber(ManualRequestTestData.employeeNumber);
		manualFormObject.enterFirstName(ManualRequestTestData.firstName);
		manualFormObject.enterLastName(ManualRequestTestData.lastName);
		manualFormObject.selectEmploymentStatus(ManualRequestTestData.employmentStatus);
		manualFormObject.selectServiceType(ManualRequestTestData.serviceType);
		manualFormObject.selectEmployeeType(ManualRequestTestData.employeeType);
		manualFormObject.selectEmployeeGrade(ManualRequestTestData.employeeGrade);
		manualFormObject.selectDesignation(ManualRequestTestData.designation);
		manualFormObject.enterDepatureDate(ManualRequestTestData.departureDate);
		manualFormObject.clickOnCreateRequestButton();

		if (landingPageObject.getTosterMessage().equalsIgnoreCase(SkypassConstraint.successfulRequestCreationMessage)) {
			try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {
				e.getMessage();
			}
			Reporter.log("Manual request created successfully..!");

		} else {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.getMessage();
			}
			Reporter.log("Request Already Exist...!");
			// Assert.fail();
			Assert.assertEquals(landingPageObject.getTosterMessage(),
					SkypassConstraint.successfulRequestCreationMessage, "Request Already Exist...!");
		}

	}

}
