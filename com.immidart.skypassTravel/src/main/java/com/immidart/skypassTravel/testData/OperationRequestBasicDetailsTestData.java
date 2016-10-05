package com.immidart.skypassTravel.testData;

import com.immidart.skypassTravel.genericLibrary.ExcelDataReader;

public class OperationRequestBasicDetailsTestData {

	ExcelDataReader excelDataReaderObject;
	
	public static String processingRemark;
	
	public void getRequestBasicdetailsData(){
		excelDataReaderObject = new ExcelDataReader();
		excelDataReaderObject.getTesData("OperationRequestBasicDetails");		
		
		processingRemark = excelDataReaderObject.data.get(0);
		
	}
}


