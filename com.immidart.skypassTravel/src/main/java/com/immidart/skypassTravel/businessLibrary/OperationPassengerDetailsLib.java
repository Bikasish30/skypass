package com.immidart.skypassTravel.businessLibrary;

import org.openqa.selenium.support.PageFactory;

import com.immidart.skypassTravel.genericLibrary.Driver;
import com.immidart.skypassTravel.pageFactory.OperationTrackerPassengerDetails;
import com.immidart.skypassTravel.testData.OperationPassangerDetailsTestData;

public class OperationPassengerDetailsLib {

	OperationTrackerPassengerDetails operationTrackerPassengerDetailsObject;
	OperationPassangerDetailsTestData operationPassangerDetailsTestDataObject;

	public void operationTrackerPassengerDetails() {
		operationTrackerPassengerDetailsObject = PageFactory.initElements(Driver.driver,
				OperationTrackerPassengerDetails.class);

		operationPassangerDetailsTestDataObject = new OperationPassangerDetailsTestData();
		operationPassangerDetailsTestDataObject.getPassengerDetailsTestData("OperationPassangerDetails");

		operationTrackerPassengerDetailsObject.clickOnPassengerDetailsTab();
		operationTrackerPassengerDetailsObject
				.verifyPassengerDetailsFirstName(OperationPassangerDetailsTestData.firstName);
		operationTrackerPassengerDetailsObject
				.verifyPassengerDetailsLastName(OperationPassangerDetailsTestData.lastName);
		operationTrackerPassengerDetailsObject
				.verifyPassengerDetailsEmployeeNo(OperationPassangerDetailsTestData.employeeNo);
		operationTrackerPassengerDetailsObject
				.verifyPassengerDetailsEmploymentStatus(OperationPassangerDetailsTestData.employmentStatusCode);
		operationTrackerPassengerDetailsObject
				.verifyPassengerDetailsServiceType(OperationPassangerDetailsTestData.serviceType);
		operationTrackerPassengerDetailsObject
				.verifyPassengerDetailsEmployeeType(OperationPassangerDetailsTestData.employeeType);
		operationTrackerPassengerDetailsObject
				.verifyPassengerDetailsEmployeeGrade(OperationPassangerDetailsTestData.employeeGrade);
		operationTrackerPassengerDetailsObject
				.verifyPassengerDetailsDesignationCode(OperationPassangerDetailsTestData.designation);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
