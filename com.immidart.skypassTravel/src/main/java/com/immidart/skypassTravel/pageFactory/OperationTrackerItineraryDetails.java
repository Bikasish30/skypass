package com.immidart.skypassTravel.pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.immidart.skypassTravel.genericLibrary.GenericClass;

public class OperationTrackerItineraryDetails {
	
	@FindBy(xpath="//a[contains(text(),'Itinerary Details')]")
	private WebElement itineraryDetailsTab;

	@FindBy(xpath="//select[@id='TPassangerNameselect']")
	private WebElement	travellerNameDropDown;				
	
	@FindBy(xpath ="//input[@class='select2-search__field']")
	private WebElement 	travellerNameDDSearchTextBox;
	
	/*public WebElement getTravellerNameDropDown(){
		return travellerNameDropDown;		
	}
	
	public WebElement getTravellerNameDDSearchTExtBox(){
		return travellerNameDDSearchTextBox;		
	}*/
	
	GenericClass genericClassObject = new GenericClass();
	
	public void clickOnItineraryDetailsTab(){
		genericClassObject.implicitlyWait(2);
		itineraryDetailsTab.click();
	}
	
	public void selectTraveller(){
		genericClassObject.selectValueInSearchBasedDropDown(travellerNameDropDown, travellerNameDDSearchTextBox, "God Father");
	}
}
