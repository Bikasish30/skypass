package com.immidart.skypassTravel.pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.immidart.skypassTravel.genericLibrary.GenericClass;

public class ManualFormPage {

	@FindBy(xpath = "//span[contains(text(),'Manual Form')]")
	private WebElement manualFormMenuBtn;

	@FindBy(id = "Clients")
	private WebElement clientNameDropDown;

	@FindBy(id = "ClientLocation")
	private WebElement clientLocationDropDown;

	@FindBy(id = "RequestType")
	private WebElement requestTypeDropDown;

	@FindBy(id = "RequestNo")
	private WebElement requestNoTextBox;

	@FindBy(id = "EmployeeId")
	private WebElement employeeNoTextBox;

	@FindBy(id = "FirstName")
	private WebElement firstNameTextBox;

	@FindBy(id = "LastName")
	private WebElement lastNameTextBox;

	@FindBy(id = "select2-EmploymentStatusCode-container")
	private WebElement employmentStatusDropDown;

	@FindBy(xpath = "//input[@role='textbox']")
	private WebElement employmentStatusDropDownSearchTextBox;

	@FindBy(id = "select2-ServiceTypeCode-container")
	private WebElement serviceTypeDropDown;

	@FindBy(xpath = "//input[@role='textbox']")
	private WebElement serviceTypeDropDownSearchTextBox;

	@FindBy(id = "select2-EmployeeTypeCode-container")
	private WebElement employeeTypeDropDown;

	@FindBy(xpath = "//input[@role='textbox']")
	private WebElement employeeTypeDropDownSearchTextBox;

	@FindBy(id = "select2-EmployeeGradeCode-container")
	private WebElement employeeGradeDropDown;

	@FindBy(xpath = "//input[@role='textbox']")
	private WebElement employeeGradeDropDownSearchTextBox;

	@FindBy(id = "select2-DesignationCode-container")
	private WebElement designationDropDown;

	@FindBy(xpath = "//input[@role='textbox']")
	private WebElement designationDropDownSearchTextBox;

	@FindBy(name = "DepartureDate")
	private WebElement depatureDateDatePicker;

	@FindBy(id = "btnCreateRequest")
	private WebElement createRequestButton;

	@FindBy(id = "btnReset")
	private WebElement resetButton;

	GenericClass genericClassObject = new GenericClass();

	public void selectClient(String clientName) {
		genericClassObject.selectValueInDropDown(clientNameDropDown, clientName);
	}

	public void selectClientLocation(String clientLocation) {
		genericClassObject.selectValueInDropDown(clientLocationDropDown, clientLocation);
	}

	public void selectRequestType(String requestType) {
		genericClassObject.selectValueInDropDown(requestTypeDropDown, requestType);
	}

	public void enterRequestNumber(String textBoxValue) {
		genericClassObject.enterValueInTextBox(requestNoTextBox, textBoxValue);
	}

	public void enterEmployNumber(String textBoxValue) {
		genericClassObject.enterValueInTextBox(employeeNoTextBox, textBoxValue);
	}

	public void enterFirstName(String textBoxValue) {
		genericClassObject.enterValueInTextBox(firstNameTextBox, textBoxValue);
	}

	public void enterLastName(String textBoxValue) {
		genericClassObject.enterValueInTextBox(lastNameTextBox, textBoxValue);
	}

	public void selectEmploymentStatus(String employeeStatus) {
		genericClassObject.selectValueInSearchBasedDropDown(employmentStatusDropDown,
				employmentStatusDropDownSearchTextBox, employeeStatus);
	}

	public void selectServiceType(String serviceType) {
		genericClassObject.selectValueInSearchBasedDropDown(serviceTypeDropDown, serviceTypeDropDownSearchTextBox,
				serviceType);
	}

	public void selectEmployeeType(String employeeType) {
		genericClassObject.selectValueInSearchBasedDropDown(employeeTypeDropDown, employeeTypeDropDownSearchTextBox,
				employeeType);
	}

	public void selectEmployeeGrade(String employeeGrade) {
		genericClassObject.selectValueInSearchBasedDropDown(employeeGradeDropDown, employeeGradeDropDownSearchTextBox,
				employeeGrade);
	}

	public void selectDesignation(String employeeDesignation) {
		genericClassObject.selectValueInSearchBasedDropDown(designationDropDown, designationDropDownSearchTextBox,
				employeeDesignation);
	}

	public void enterDepatureDate(String depatureDate) {
		genericClassObject.enterValueInTextBox(depatureDateDatePicker, depatureDate);
	}

	public void clickOnCreateRequestButton() {
		createRequestButton.click();
	}

	public void clickOnResetButton() {
		resetButton.click();
	}
}
