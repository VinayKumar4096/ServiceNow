package com.test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
//import sn.pages.SNBaseTest;
import sn.pages.SNHomePage;
import sn.pages.SNIncidentPage;
public class Create_Incident{
WebDriver driver = new ChromeDriver();
@Test

public void test1() throws InterruptedException{
	SNHomePage sNHomePage = new SNHomePage(driver);
	sNHomePage.waitpage();
	sNHomePage.openURL();
	sNHomePage.signIn("admin", "6arZfR+^S0eP");
	
	SNIncidentPage sNIncidentPage = new SNIncidentPage(driver);
	sNIncidentPage.incidentnumber();
	sNIncidentPage.caller1();
	sNIncidentPage.service("SAP Controlling");
	sNIncidentPage.serviceOffering("*BETH-IBM");
	
	
	sNIncidentPage.channel("Phone");
	sNIncidentPage.assignmentGroup("Incident Management");
	sNIncidentPage.assignedTo("Incident Manager");
	sNIncidentPage.sdescrptn("test");
	sNIncidentPage.incidentDescription("test");
	
	sNIncidentPage.submit();
}	
}