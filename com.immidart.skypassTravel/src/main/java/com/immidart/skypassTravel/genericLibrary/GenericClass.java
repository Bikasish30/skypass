/*This Class will contain----- 
 * 		------all the generic methods*/

package com.immidart.skypassTravel.genericLibrary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class GenericClass {

	public void enterValueInTextBox(WebElement textBoxWebElement, String valueforTextBox) {
		textBoxWebElement.clear();
		textBoxWebElement.sendKeys(valueforTextBox);
	}

	public void selectValueInDropDown(WebElement dropDownWebElement, String dropDownValueToSelect) {
		Select selectClassObject = new Select(dropDownWebElement);
		selectClassObject.selectByVisibleText(dropDownValueToSelect);
	}

	public void selectValueInSearchBasedDropDown(WebElement dropdownWebElement, WebElement dropDownSearchTextBox,
			String dropDownValueSerchText) {
		dropdownWebElement.click();
		GenericClass genericClassObject = new GenericClass();
		genericClassObject.enterValueInTextBox(dropDownSearchTextBox, dropDownValueSerchText);
		Actions act = new Actions(Driver.driver);
		act.sendKeys(Keys.ENTER).build().perform();

	}

	public void implicitlyWait(int timeInSeconds) {
		Driver.driver.manage().timeouts().implicitlyWait(timeInSeconds, TimeUnit.SECONDS);
	}

	/*
	 * public void waitTillElementIsVisible(WebElement pageElement){
	 * WebDriverWait wait = new WebDriverWait(DriverClass.dvr,10);
	 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
	 * "//div[@class='toast-message']"))); }
	 */

	public void verifyData(Object expected, Object actual, String errorMessage) {
		// Assert.assertEquals(expected, actual,errorMessage);
		Assert.assertEquals(errorMessage, expected, actual);
	}

}
