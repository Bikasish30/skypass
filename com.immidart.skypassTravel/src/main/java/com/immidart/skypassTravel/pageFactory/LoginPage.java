package com.immidart.skypassTravel.pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import com.immidart.skypassTravel.genericLibrary.SkypassConstraint;

public class LoginPage {

	@FindBy(id = "userName")
	private WebElement userNameField;

	@FindBy(id = "password")
	private WebElement passwordField;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginButton;

	public void loginToApplication() {

		Reporter.log("Trying to enter UserName..!");
		userNameField.sendKeys(SkypassConstraint.adminUser);
		Reporter.log("Successfully entered User Name..!");

		Reporter.log("Trying to enter Password..!");
		passwordField.sendKeys(SkypassConstraint.adminUserPassword);
		Reporter.log("Successfully entered Password..!");

		loginButton.click();
		Reporter.log("Clicked Login Button..!");

	}
}
