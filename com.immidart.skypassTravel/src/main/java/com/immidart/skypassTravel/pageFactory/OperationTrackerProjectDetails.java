package com.immidart.skypassTravel.pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.immidart.skypassTravel.genericLibrary.GenericClass;

public class OperationTrackerProjectDetails {

	GenericClass genericClassObject = new GenericClass();

	@FindBy(xpath = "//a[contains(text(),'Project Details')]")
	private WebElement projectDetailsTab;

	public void clickOnProjectDetailsTab() {
		projectDetailsTab.click();
	}

	@FindBy(xpath = "//a[@id='showProjecthidebtn']/span")
	private WebElement projectDetailsEditButton;

	public void clickOnProjectDetailEditButton() {
		projectDetailsEditButton.click();
	}

	@FindBy(id = "SWONCode")
	private WebElement swonCodeTextBox;

	public void enterSwonCode(String swonCode) {
		genericClassObject.enterValueInTextBox(swonCodeTextBox, swonCode);
	}

	@FindBy(xpath = "//span[@id='select2-SWONCompanyNameCode-container']")
	private WebElement swonCompanyNameDropDown;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	private WebElement swonCompanyNameDropDownSearchText;

	public void selectSwonCompany(String swonCompanyName) {
		genericClassObject.selectValueInSearchBasedDropDown(swonCompanyNameDropDown, swonCompanyNameDropDownSearchText,
				swonCompanyName);
	}

	@FindBy(xpath = "//span[@id='select2-SWONLocationCode-container']")
	private WebElement swonCompanyLocationDropDown;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	private WebElement swonCompanyLocationDropDownSearchText;

	public void selectSwonCompanyLocation(String swonCompanyNameLocation) {
		genericClassObject.selectValueInSearchBasedDropDown(swonCompanyLocationDropDown,
				swonCompanyLocationDropDownSearchText, swonCompanyNameLocation);
	}

	@FindBy(id = "ParentIOU")
	private WebElement parentIOUTextBox;

	public void enterparentIOU(String parentIOU) {
		genericClassObject.enterValueInTextBox(parentIOUTextBox, parentIOU);
	}

	@FindBy(id = "CustomerName")
	private WebElement customerNameTextBox;

	public void enterCustomerName(String customerName) {
		genericClassObject.enterValueInTextBox(customerNameTextBox, customerName);
	}

	@FindBy(id = "btnProjectSave")
	private WebElement projectDetailsSaveButton;

	public void clickSaveProjectButton() {
		projectDetailsSaveButton.click();
	}

	@FindBy(xpath = "//a[contains(text(),'Cancel')]")
	private WebElement projectDetailsCancelButton;

	public void clickProjectDetailsCancelButton() {
		projectDetailsCancelButton.click();
	}
}
