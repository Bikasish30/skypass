package com.immidart.skypassTravel.pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.immidart.skypassTravel.genericLibrary.GenericClass;

public class OperationTrackerPassengerDetails {

	GenericClass genericClassObject = new GenericClass();

	@FindBy(xpath = "//a[contains(text(),'Passenger Details')]")
	private WebElement passengerDetailsTab;

	public void clickOnPassengerDetailsTab() {
		passengerDetailsTab.click();
	}

	@FindBy(id = "pFirstName")
	private WebElement firstNameTextValue;

	public void verifyPassengerDetailsFirstName(String firstName) {
		genericClassObject.verifyData(firstName, firstNameTextValue.getText(),
				"Passenger [First Name] is not matching...");
	}

	@FindBy(id = "pLastName")
	private WebElement lastNameValue;

	public void verifyPassengerDetailsLastName(String lastName) {
		genericClassObject.verifyData(lastName, lastNameValue.getText(), "Passenger [Last Name] is not matching...");
	}

	@FindBy(id = "pPsgEmployeeNo")
	private WebElement employeeNumberValue;

	public void verifyPassengerDetailsEmployeeNo(String employeeNo) {
		genericClassObject.verifyData(employeeNo, employeeNumberValue.getText(),
				"Passenger [Employee Number] is not matching...");
	}

	@FindBy(id = "pEmploymentStatusCode")
	private WebElement employStatusCodeValue;

	public void verifyPassengerDetailsEmploymentStatus(String employmentStatus) {
		genericClassObject.verifyData(employmentStatus, employStatusCodeValue.getText(),
				"Passenger [Employment Status] is not matching...");
	}

	@FindBy(id = "pServiceTypeCode")
	private WebElement serviceTypeValue;

	public void verifyPassengerDetailsServiceType(String serviceType) {
		genericClassObject.verifyData(serviceType, serviceTypeValue.getText(),
				"Passenger [Service Type] is not matching...");
	}

	@FindBy(id = "pEmployeeTypeCode")
	private WebElement employeeTypeValue;

	public void verifyPassengerDetailsEmployeeType(String employeeType) {
		genericClassObject.verifyData(employeeType, employeeTypeValue.getText(),
				"Passenger [Employee Type] is not matching...");
	}

	@FindBy(id = "pEmployeeGradeCode")
	private WebElement employeeGradeValue;

	public void verifyPassengerDetailsEmployeeGrade(String employeeGrade) {
		genericClassObject.verifyData(employeeGrade, employeeGradeValue.getText(),
				"Passenger [Employee Grade] is not matching...");
	}

	@FindBy(id = "pDesignationCode")
	private WebElement designationValue;

	public void verifyPassengerDetailsDesignationCode(String designationCode) {
		genericClassObject.verifyData(designationCode, designationValue.getText(),
				"Passenger [Designation Code] is not matching...");
	}

	@FindBy(xpath = "//button[contains(text(),'Save')]")
	private WebElement saveButton;

	public void clickOnPassengerDetailsSaveButton() {
		saveButton.click();
	}

	@FindBy(xpath = "//a[contains(text(),'Cancel')]")
	private WebElement cancelButton;

	public void clickOnPassengerDetailsCancelButton() {
		cancelButton.click();
	}
}
