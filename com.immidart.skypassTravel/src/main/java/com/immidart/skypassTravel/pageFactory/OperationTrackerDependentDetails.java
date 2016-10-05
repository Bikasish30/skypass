package com.immidart.skypassTravel.pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.immidart.skypassTravel.genericLibrary.GenericClass;

public class OperationTrackerDependentDetails {

	GenericClass genericClassObject = new GenericClass();

	@FindBy(xpath = "//a[contains(text(),'Dependent Details')]")
	private WebElement dependentDetailsTab;

	public void clickOnDependentDetailsTab() {
		dependentDetailsTab.click();
	}

	@FindBy(id = "btnAddDependent")
	private WebElement dependentAddButton;

	public void clickOnDependentAddButton() {
		dependentAddButton.click();
	}

	@FindBy(xpath = "//span[@id='select2-RelationshipCode-container']")
	private WebElement relationshipDropDown;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	private WebElement relationshipDropDownSearchTextBox;

	public void selectDependentRelationShip(String dependentRelationshipSearchText) {
		genericClassObject.selectValueInSearchBasedDropDown(relationshipDropDown, relationshipDropDownSearchTextBox,
				dependentRelationshipSearchText);
	}

	@FindBy(id = "Name")
	private WebElement nameTextBox;

	public void enterDependentName(String enterDependentName) {
		genericClassObject.enterValueInTextBox(nameTextBox, enterDependentName);
	}

	@FindBy(id = "Gender")
	private WebElement dependentGenderDropDown;

	public void selectDependentGender(String DependentGender) {
		genericClassObject.selectValueInDropDown(dependentGenderDropDown, DependentGender);
	}

	@FindBy(xpath = "//input[@id='DateOfBirth']")
	private WebElement dependentDateOfBirthDatePicker;

	public void enterDependentDateOfBirth(String dependentDateOfBirth) {
		genericClassObject.enterValueInTextBox(dependentDateOfBirthDatePicker, dependentDateOfBirth);
	}

	@FindBy(id = "Age")
	private WebElement dependentAge;

	public void enterDependentAge(String enterDependentAge) {
		genericClassObject.enterValueInTextBox(dependentAge, enterDependentAge);
	}

	@FindBy(xpath = "//span[@id='select2-MealTypeCode-container']")
	private WebElement dependentMealType;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	private WebElement dependentMealTypeSeartTextBox;

	public void selectDependentMealType(String enterDependentMealType) {
		genericClassObject.selectValueInSearchBasedDropDown(dependentMealType, dependentMealTypeSeartTextBox,
				enterDependentMealType);
	}

	@FindBy(xpath = "//span[@id='select2-SeatTypeCode-container']")
	private WebElement dependentSeatType;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	private WebElement dependentSeatTypeSeartTextBox;

	public void selectDependentSeatType(String enterdependentSeatType) {
		genericClassObject.selectValueInSearchBasedDropDown(dependentSeatType, dependentSeatTypeSeartTextBox,
				enterdependentSeatType);
	}

	@FindBy(xpath = "//button[@id='btnDependentSave']")
	private WebElement dependentDetailsSaveButton;

	public void clickOnDependentDetailsSaveButton() {
		dependentDetailsSaveButton.click();
	}

	@FindBy(xpath = "//a[contains(@class,'Cancel')]")
	private WebElement dependentDetailsCancelButton;

	public void clickOnDependentDetailsCancelButton() {
		dependentDetailsCancelButton.click();
	}
	
	@FindBy(xpath = "//div[contains(text(),'Record Exits with same Relationship Type')]")
	private WebElement tosterMessage;

	public String getTosterMessage() {
		return tosterMessage.getText();
	}
	
}
