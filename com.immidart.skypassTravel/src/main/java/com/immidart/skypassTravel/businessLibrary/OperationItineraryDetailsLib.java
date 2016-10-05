package com.immidart.skypassTravel.businessLibrary;

import org.openqa.selenium.support.PageFactory;

import com.immidart.skypassTravel.genericLibrary.Driver;
import com.immidart.skypassTravel.genericLibrary.GenericClass;
import com.immidart.skypassTravel.pageFactory.OperationTrackerItineraryDetails;

public class OperationItineraryDetailsLib {

	OperationTrackerItineraryDetails OperationTrackerItineraryDetailsObject;
	GenericClass generiClassObject;

	public void OperationItineraryDetails() {
		OperationTrackerItineraryDetailsObject = PageFactory.initElements(Driver.driver,
				OperationTrackerItineraryDetails.class);		
		OperationTrackerItineraryDetailsObject.clickOnItineraryDetailsTab();
		OperationTrackerItineraryDetailsObject.clckOnAddItineraryButtonLink();
		OperationTrackerItineraryDetailsObject.selectTraveller();
		generiClassObject = new GenericClass();
		generiClassObject.implicitlyWait(2);
	}

}
