package com.immidart.skypassTravel.pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.immidart.skypassTravel.genericLibrary.GenericClass;

public class OperationTrackerSearchPage {

	@FindBy(xpath = "//a[contains(text(),'Search')]")
	private WebElement operationTrackerSubMenuSearchBtn;

	@FindBy(xpath = "//select[@id='Client']/following-sibling::span")
	private WebElement selectClientDropDown;

	@FindBy(xpath = "//input[@placeholder='Select Client']")
	private WebElement textBoxInsideSelectClientDropDown;

	@FindBy(xpath = "//select[@id='Location']/following-sibling::span")
	private WebElement selectLocationDropDown;

	@FindBy(xpath = "//input[@placeholder='Select Location']")
	private WebElement textBoxInsideSelectLocationDropDown;

	@FindBy(xpath = "//select[@id='RequestType']/following-sibling::span")
	private WebElement selectRequestTypeDropDown;

	@FindBy(xpath = "//input[@placeholder='Select Request Type']")
	private WebElement textBoxInsideSelectRequestTypeDropDown;

	@FindBy(xpath = "//select[@id='RequestMode']/following-sibling::span")
	private WebElement selectRequestModeDropDown;

	@FindBy(xpath = "//input[@placeholder='Select Request Mode']")
	private WebElement textBoxInsideSelectRequestModeDropDown;

	@FindBy(id = "RequestNo")
	private WebElement requestNumberTextBox;

	@FindBy(id = "EmployeeId")
	private WebElement employeeNumberTextBox;

	@FindBy(id = "SWon")
	private WebElement swonCodeTextBox;

	@FindBy(xpath = "//input[@placeholder='Select Request Status']")
	private WebElement selectRequestStatusDropDown;

	@FindBy(id = "StartDate")
	private WebElement startDateDatePicker;

	@FindBy(id = "EndDate")
	private WebElement endDateDatePicker;

	@FindBy(xpath = "//span[contains(text(),'Select Aging Time Span')]")
	private WebElement agingTimeSpanDropDown;

	@FindBy(id = "operationSearch")
	private WebElement operationSearchButton;

	@FindBy(xpath = "//tbody[@id='tblBody']/tr/td[1]/a")
	private WebElement requestNoFromDataTable;

	@FindBy(xpath = "//font[contains(text(),'No Record Available')]")
	private WebElement noRecordFound;

	GenericClass genericClassObject = new GenericClass();

	public void operationTrackerSubMenuSearchLinkClick() {
		genericClassObject.implicitlyWait(5000);
		operationTrackerSubMenuSearchBtn.click();
	}

	public void selectClientNameDrorDown(String clientName) {
		genericClassObject.implicitlyWait(5000);
		genericClassObject.selectValueInSearchBasedDropDown(selectClientDropDown, textBoxInsideSelectClientDropDown,
				clientName);
	}

	public void selectLocationDropDown(String clientLocation) {
		genericClassObject.implicitlyWait(5000);
		genericClassObject.selectValueInSearchBasedDropDown(selectLocationDropDown, textBoxInsideSelectLocationDropDown,
				clientLocation);
	}

	public void selectRequestType(String requestType) {
		genericClassObject.implicitlyWait(5000);
		genericClassObject.selectValueInSearchBasedDropDown(selectRequestTypeDropDown,
				textBoxInsideSelectRequestTypeDropDown, requestType);
	}

	public void selectRequestMode(String requestMode) {
		genericClassObject.implicitlyWait(5000);
		genericClassObject.selectValueInSearchBasedDropDown(selectRequestModeDropDown,
				textBoxInsideSelectRequestModeDropDown, requestMode);
	}

	public void enterRequestNumber(String requestNumber) {
		genericClassObject.implicitlyWait(5000);
		genericClassObject.enterValueInTextBox(requestNumberTextBox, requestNumber);
	}

	public void enterEmployeeNumber(String employeeNumber) {
		genericClassObject.implicitlyWait(5000);
		genericClassObject.enterValueInTextBox(employeeNumberTextBox, employeeNumber);
	}

	public void enterSwonNumber(String swonNumber) {
		genericClassObject.implicitlyWait(5000);
		genericClassObject.enterValueInTextBox(swonCodeTextBox, swonNumber);
	}

	public void selectRequestStatus(String requestStatus) {
		genericClassObject.implicitlyWait(5000);
		genericClassObject.selectValueInDropDown(selectRequestStatusDropDown, requestStatus);
	}

	public void selectStartDate(String startDate) {
		genericClassObject.implicitlyWait(5000);
		genericClassObject.enterValueInTextBox(startDateDatePicker, startDate);
	}

	public void selectEndDate(String endDate) {
		genericClassObject.implicitlyWait(5000);
		genericClassObject.enterValueInTextBox(endDateDatePicker, endDate);
	}

	public void clickOperationSearchButton() {
		genericClassObject.implicitlyWait(5000);
		operationSearchButton.click();
	}

	public void clickOnRequestNoPresentInDataTable() {
		genericClassObject.implicitlyWait(5000);
		requestNoFromDataTable.click();
	}

	public String getNoRecordFoundMessageInDataTable() {
		return noRecordFound.getText();
	}
}
