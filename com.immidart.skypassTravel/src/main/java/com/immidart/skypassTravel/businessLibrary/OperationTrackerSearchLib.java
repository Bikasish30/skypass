package com.immidart.skypassTravel.businessLibrary;

import org.openqa.selenium.support.PageFactory;

import com.immidart.skypassTravel.genericLibrary.Driver;
import com.immidart.skypassTravel.genericLibrary.GenericClass;
import com.immidart.skypassTravel.pageFactory.OperationTrackerSearchPage;
import com.immidart.skypassTravel.testData.OperationTrackerSearchTestData;

public class OperationTrackerSearchLib {

	OperationTrackerSearchPage operationTrackerSearchPageObject;
	OperationTrackerSearchTestData operationTrackerSearchTestDataObject;
	GenericClass genericClassObject;
	LogoutFromApplicationLib logoutFromApplicationLibObject;

	public void searchForARequest() {
		operationTrackerSearchPageObject = PageFactory.initElements(Driver.driver, OperationTrackerSearchPage.class);
		operationTrackerSearchPageObject.operationTrackerSubMenuSearchLinkClick();

		operationTrackerSearchTestDataObject = new OperationTrackerSearchTestData();
		operationTrackerSearchTestDataObject.getOperationTrackersearchCriteriaData();

		operationTrackerSearchPageObject.selectClientNameDrorDown(OperationTrackerSearchTestData.clientName);
		operationTrackerSearchPageObject.selectLocationDropDown(OperationTrackerSearchTestData.clientlocation);
		operationTrackerSearchPageObject.selectRequestType(OperationTrackerSearchTestData.requestType);
		operationTrackerSearchPageObject.selectRequestMode(OperationTrackerSearchTestData.requestMode);
		operationTrackerSearchPageObject.enterRequestNumber(OperationTrackerSearchTestData.requestNumber);
		operationTrackerSearchPageObject.enterEmployeeNumber(OperationTrackerSearchTestData.employeeNumber);
		// operationTrackerPageObject.enterSwonNumber("s/won number");
		// operationTrackerPageObject.selectRequestStatus("status value");
		// operationTrackerPageObject.selectStartDate(SkypassConstraint.departureDate);
		// operationTrackerPageObject.selectEndDate("End Date");
		operationTrackerSearchPageObject.clickOperationSearchButton();
		operationTrackerSearchPageObject.clickOnRequestNoPresentInDataTable();

	}
}
