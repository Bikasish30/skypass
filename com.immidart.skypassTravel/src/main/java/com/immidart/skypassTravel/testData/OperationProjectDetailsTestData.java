package com.immidart.skypassTravel.testData;

import com.immidart.skypassTravel.genericLibrary.ExcelDataReader;

public class OperationProjectDetailsTestData {

	ExcelDataReader ExcelDataReaderObject;

	public static String swonCode;
	public static String swonCompanyName;
	public static String swonLocation;
	public static String parentIOU;
	public static String customerName;

	public void getOperationProjectDetailsTestData() {
		ExcelDataReaderObject = new ExcelDataReader();
		ExcelDataReaderObject.getTesData("OperationProjectDetails");

		swonCode = ExcelDataReaderObject.data.get(0);
		swonCompanyName = ExcelDataReaderObject.data.get(1);
		swonLocation = ExcelDataReaderObject.data.get(2);
		parentIOU = ExcelDataReaderObject.data.get(3);
		customerName = ExcelDataReaderObject.data.get(4);

	}
}
