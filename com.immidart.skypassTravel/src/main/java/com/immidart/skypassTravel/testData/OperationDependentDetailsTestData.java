package com.immidart.skypassTravel.testData;

import com.immidart.skypassTravel.genericLibrary.ExcelDataReader;

public class OperationDependentDetailsTestData {

	ExcelDataReader excelDataReaderObject;
	public static String dependentRelationship;
	public static String dependentName;
	public static String dependentGender;
	public static String dependentDateOfBirth;
	public static String dependenrtAge;
	public static String dependenrtMealType;
	public static String dependentSeatType;

	public void getOperationDependentDetails() {
		excelDataReaderObject = new ExcelDataReader();
		excelDataReaderObject.getTesData("OperationDependentDetails");

		dependentRelationship = excelDataReaderObject.data.get(0);
		dependentName = excelDataReaderObject.data.get(1);
		dependentGender = excelDataReaderObject.data.get(2);
		dependentDateOfBirth = excelDataReaderObject.data.get(3);
		dependenrtAge = excelDataReaderObject.data.get(4);
		dependenrtMealType = excelDataReaderObject.data.get(5);
		dependentSeatType = excelDataReaderObject.data.get(6);

	}
}
