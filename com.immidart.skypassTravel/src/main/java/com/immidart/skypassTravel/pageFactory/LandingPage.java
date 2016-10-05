package com.immidart.skypassTravel.pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LandingPage {

	@FindBy(xpath = "//span[contains(text(),'Operation Tracker')]")
	private WebElement operationTrackerMenuLink;

	@FindBy(xpath = "//span[contains(text(),'Manual Form')]")
	private WebElement manualFormMeneLink;

	@FindBy(xpath = "//span[contains(text(),'Reports')]")
	private WebElement reportMenuLink;

	@FindBy(xpath = "//span[contains(text(),'Admin Settings')]")
	private WebElement adminSettingMenuLink;

	@FindBy(xpath = "//div[@class='toast-message']")
	private WebElement tosterMessage;

	@FindBy(xpath = "//div[@class='user-account-nav']")
	private WebElement changePasswordAndlogoutMenu;

	@FindBy(xpath = "//a[@href='/SkyPassQA/Account/ChangePassword']")
	private WebElement changePasswordLink;

	@FindBy(xpath = "//i[@class='fa fa-sign-out fa-fw']")
	private WebElement logOutLink;

	public void clickOnOperationTrackerLink() {
		operationTrackerMenuLink.click();
	}

	public void clickOnManualFormLink() {
		manualFormMeneLink.click();
		Reporter.log("Clicked on Manual Request Link..!");

	}

	public void clickOnReportsLink() {
		reportMenuLink.click();
		Reporter.log("Clicked on Manual Report Link..!");
	}

	public String getTosterMessage() {
		return tosterMessage.getText();
	}

	public void clickOnAdminSettingLink() {
		adminSettingMenuLink.click();
	}

	public void logoutFromApplication() {
		try{
			Thread.sleep(6000);	
		}catch(InterruptedException e){
			e.getMessage();
		}
		
		changePasswordAndlogoutMenu.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.getMessage();
		}
		logOutLink.click();
		Reporter.log("Clicked logout Button..!");
		Reporter.log("Logged Out From Application..!");
	}

}
