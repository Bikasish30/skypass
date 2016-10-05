package com.immidart.skypassTravel.testData;

import com.immidart.skypassTravel.genericLibrary.ExcelDataReader;

public class OperationTrackerSearchTestData {

	ExcelDataReader excelDataReaderObject;

	public static String clientName;
	public static String clientlocation;
	public static String requestType;
	public static String requestMode;
	public static String requestNumber;
	public static String employeeNumber;
	public static String swonNumber;
	public static String requestStatus;
	public static String departureStartDate;
	public static String departureEndDate;
	public static String agingTimeSpan;
	public static String applicationCreatedStartDate;

	public void getOperationTrackersearchCriteriaData() {
		excelDataReaderObject = new ExcelDataReader();
		excelDataReaderObject.getTesData("OperationTrackerSearch");

		clientName = excelDataReaderObject.data.get(0);
		clientlocation = excelDataReaderObject.data.get(1);
		requestType = excelDataReaderObject.data.get(2);
		requestMode = excelDataReaderObject.data.get(3);
		requestNumber = excelDataReaderObject.data.get(4);
		employeeNumber = excelDataReaderObject.data.get(5);
		/*
		 * swonNumber = excelDataReaderObject.data.get(6); requestStatus =
		 * excelDataReaderObject.data.get(7); departureStartDate =
		 * excelDataReaderObject.data.get(8);
		 */

	}
}
