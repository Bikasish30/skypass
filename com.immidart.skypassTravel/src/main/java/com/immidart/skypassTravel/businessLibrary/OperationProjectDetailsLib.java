package com.immidart.skypassTravel.businessLibrary;

import org.openqa.selenium.support.PageFactory;

import com.immidart.skypassTravel.genericLibrary.Driver;
import com.immidart.skypassTravel.pageFactory.OperationTrackerProjectDetails;
import com.immidart.skypassTravel.testData.OperationProjectDetailsTestData;

public class OperationProjectDetailsLib {

	OperationTrackerProjectDetails operationTrackerProjectDetailsObject;
	OperationProjectDetailsTestData operationProjectDetailsTestDataObject;

	public void operationTrackerProjectDetails() {
		operationTrackerProjectDetailsObject = PageFactory.initElements(Driver.driver,
				OperationTrackerProjectDetails.class);
		operationTrackerProjectDetailsObject.clickOnProjectDetailsTab();
		operationTrackerProjectDetailsObject.clickOnProjectDetailEditButton();
		// getting Test data for Project Details
		operationProjectDetailsTestDataObject = new OperationProjectDetailsTestData();
		operationProjectDetailsTestDataObject.getOperationProjectDetailsTestData();
		operationTrackerProjectDetailsObject.enterSwonCode(OperationProjectDetailsTestData.swonCode);
		operationTrackerProjectDetailsObject.selectSwonCompany(OperationProjectDetailsTestData.swonCompanyName);
		operationTrackerProjectDetailsObject.selectSwonCompanyLocation(OperationProjectDetailsTestData.swonLocation);
		operationTrackerProjectDetailsObject.enterparentIOU(OperationProjectDetailsTestData.parentIOU);
		operationTrackerProjectDetailsObject.enterCustomerName(OperationProjectDetailsTestData.customerName);
		operationTrackerProjectDetailsObject.clickSaveProjectButton();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.getMessage();
		}
	}
}
