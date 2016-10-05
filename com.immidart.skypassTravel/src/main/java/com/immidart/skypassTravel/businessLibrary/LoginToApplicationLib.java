package com.immidart.skypassTravel.businessLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.immidart.skypassTravel.genericLibrary.Driver;
import com.immidart.skypassTravel.genericLibrary.GenericClass;
import com.immidart.skypassTravel.pageFactory.LoginPage;

public class LoginToApplicationLib {

	public void loginToApplication() {

		GenericClass genericClassObject = new GenericClass();
		LoginPage loginPageObject = PageFactory.initElements(Driver.driver, LoginPage.class);
		loginPageObject.loginToApplication();
		Assert.assertEquals("Skypass",
				Driver.driver.findElement(By.xpath("//h2[contains(text(),'Skypass ')]")).getText());
		genericClassObject.implicitlyWait(3000);
	}

}
