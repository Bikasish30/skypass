package com.immidart.skypassTravel.testData;

import com.immidart.skypassTravel.genericLibrary.ExcelDataReader;

public class ManualRequestTestData {
	ExcelDataReader excelDataReaderObject;

	public static String clientName;
	public static String clientLocation;
	public static String requestType;
	public static String requestNumber;
	public static String employeeNumber;
	public static String firstName;
	public static String lastName;
	public static String employmentStatus;
	public static String serviceType;
	public static String employeeType;
	public static String employeeGrade;
	public static String designation;
	public static String departureDate;

	public void getManualRequestData(String sheetName) {
		excelDataReaderObject = new ExcelDataReader();
		excelDataReaderObject.getTesData(sheetName);

		clientName = excelDataReaderObject.data.get(0);
		clientLocation = excelDataReaderObject.data.get(1);
		requestType = excelDataReaderObject.data.get(2);
		requestNumber = excelDataReaderObject.data.get(3);
		employeeNumber = excelDataReaderObject.data.get(4);
		firstName = excelDataReaderObject.data.get(5);
		lastName = excelDataReaderObject.data.get(6);
		employmentStatus = excelDataReaderObject.data.get(7);
		serviceType = excelDataReaderObject.data.get(8);
		employeeType = excelDataReaderObject.data.get(9);
		employeeGrade = excelDataReaderObject.data.get(10);
		designation = excelDataReaderObject.data.get(11);
		departureDate = excelDataReaderObject.data.get(12);
	}

	/*
	 * for(int i=0; i<excelDataReaderObject.data.size(); i++){
	 * System.out.println(excelDataReaderObject.data.get(i)); }
	 */
}
