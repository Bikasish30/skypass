package com.immidart.skypassTravel.genericLibrary;

public interface SkypassConstraint {

	// Defining application URL
	public String skyPassQaUrl = "http://10.0.5.76/SkyPassQA/";

	// Defining credentials
	public String adminUser = "skypassadmin@skypass.com";
	public String adminUserPassword = "test";
	public String browser = "chrome";

	// ExcelData Path
	public String testDataExcel = "Z:\\Eclipse Neon 11-08-2016\\EclipseNeonWorkSpace"
			+ "\\com.immidart.skypassTravel\\src\\main\\resources\\SkyPassTestData.xlsx";

	// Data Table message

	public String noRecordFound = "No Record Available";

	// Successful creation of request
	public String successfulRequestCreationMessage = "Your Request Created Successfully";
	public String requestAlreadyExistMessage = "This Request Number Already Exists";

}
