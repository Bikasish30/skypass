package com.immidart.skypassTravel.businessLibrary;

import org.openqa.selenium.support.PageFactory;

import com.immidart.skypassTravel.genericLibrary.Driver;
import com.immidart.skypassTravel.pageFactory.LandingPage;

public class LogoutFromApplicationLib {

	public void logOutFromApplication() {
		LandingPage landingPageObject = PageFactory.initElements(Driver.driver, LandingPage.class);
		landingPageObject.logoutFromApplication();
	}
}
