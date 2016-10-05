package com.immidart.skypassTravel.pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.immidart.skypassTravel.genericLibrary.GenericClass;

public class OperationTrackerRequestBasicDetails {

	GenericClass genericClassObject = new GenericClass();

	@FindBy(id = "pRequestNo")
	private WebElement requestNoValue;

	public void verifyRequestNoText(String expectedRequestNumber) {
		String actualReqNumber = requestNoValue.getText();
		genericClassObject.verifyData(expectedRequestNumber, actualReqNumber, "Request Number is not matching...");
	}

	@FindBy(id = "pEmployeeNo")
	private WebElement employeeNoValue;

	public void verifyEmployeeNoText(String expectedEmployeeNumber) {
		String actualEmployeeNo = employeeNoValue.getText();
		genericClassObject.verifyData(expectedEmployeeNumber, actualEmployeeNo, "Employee Number is not matching...");
	}

	@FindBy(id = "pRequestType")
	private WebElement requestTypeValue;

	public void verifyRequestType(String expectedRequestType) {
		String actualRequestType = requestTypeValue.getText();
		genericClassObject.verifyData(expectedRequestType, actualRequestType, "Request Number is not matching...");
	}

	@FindBy(id = "pClientId")
	private WebElement clientValue;

	public void verifyClient(String expectedRequestNumber) {
		String actualClient = clientValue.getText();
		genericClassObject.verifyData(expectedRequestNumber, actualClient, "Request Number is not matching...");
	}

	@FindBy(id = "showbtn")
	private WebElement editButton;

	public void clickOnEditButton() {
		editButton.click();
	}

	@FindBy(id = "txtProcessingRemark")
	private WebElement ProcessingRemarktextArea;

	public void enterTextInProcessingRemarktextArea(String ProcessingRemarkText) {
		genericClassObject.enterValueInTextBox(ProcessingRemarktextArea, ProcessingRemarkText);
	}

	@FindBy(id = "savebtn")
	private WebElement saveButton;

	public void clickOnSavebutton() {
		saveButton.click();
	}

	@FindBy(id = "cancelbtn")
	private WebElement cancelButton;

	public void clickOnCancelButtom() {
		cancelButton.click();
	}
}
