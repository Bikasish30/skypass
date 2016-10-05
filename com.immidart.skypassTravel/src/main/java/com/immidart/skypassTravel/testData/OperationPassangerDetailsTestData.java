package com.immidart.skypassTravel.testData;

import com.immidart.skypassTravel.genericLibrary.ExcelDataReader;

public class OperationPassangerDetailsTestData {

	private ExcelDataReader excelDataReaderObject;

	public static String firstName;
	public static String lastName;
	public static String employeeNo;
	public static String employmentStatusCode;
	public static String serviceType;
	public static String employeeType;
	public static String employeeGrade;
	public static String designation;

	public void getPassengerDetailsTestData(String sheetName) {
		excelDataReaderObject = new ExcelDataReader();
		excelDataReaderObject.getTesData(sheetName);

		firstName = excelDataReaderObject.data.get(0);
		lastName = excelDataReaderObject.data.get(1);
		employeeNo = excelDataReaderObject.data.get(2);
		employmentStatusCode = excelDataReaderObject.data.get(3);
		serviceType = excelDataReaderObject.data.get(4);
		employeeType = excelDataReaderObject.data.get(5);
		employeeGrade = excelDataReaderObject.data.get(6);
		designation = excelDataReaderObject.data.get(7);

	}
}
