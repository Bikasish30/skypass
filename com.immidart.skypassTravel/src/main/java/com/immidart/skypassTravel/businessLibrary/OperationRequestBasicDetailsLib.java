package com.immidart.skypassTravel.businessLibrary;

import org.openqa.selenium.support.PageFactory;

import com.immidart.skypassTravel.genericLibrary.Driver;
import com.immidart.skypassTravel.pageFactory.OperationTrackerRequestBasicDetails;
import com.immidart.skypassTravel.testData.OperationRequestBasicDetailsTestData;

public class OperationRequestBasicDetailsLib {

	OperationTrackerRequestBasicDetails operationTrackerRequestBasicDetailsObject;
	OperationRequestBasicDetailsTestData operationRequestBasicDetailsTestDataObject;

	public void operationTrackerRequestBasicDetail() {
		operationTrackerRequestBasicDetailsObject = PageFactory.initElements(Driver.driver,
				OperationTrackerRequestBasicDetails.class);
		// operationTrackerRequestBasicDetailsObject.verifyRequestNoText(
		// SkypassConstraint.requestNumber);
		// operationTrackerRequestBasicDetailsObject.verifyEmployeeNoText(
		// SkypassConstraint.employeeNumber);
		// operationTrackerRequestBasicDetailsObject.verifyRequestType(
		// SkypassConstraint.requestType);
		// operationTrackerRequestBasicDetailsObject.verifyClient(
		// SkypassConstraint.clientName);
		operationTrackerRequestBasicDetailsObject.clickOnEditButton();
		// getting Request basic details test data
		operationRequestBasicDetailsTestDataObject = new OperationRequestBasicDetailsTestData();
		operationRequestBasicDetailsTestDataObject.getRequestBasicdetailsData();
		operationTrackerRequestBasicDetailsObject
				.enterTextInProcessingRemarktextArea(OperationRequestBasicDetailsTestData.processingRemark);
		operationTrackerRequestBasicDetailsObject.clickOnSavebutton();

	}
}
