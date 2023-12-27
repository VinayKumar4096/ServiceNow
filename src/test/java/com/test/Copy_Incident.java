package com.test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import sn.pages.SNHomePage;
import sn.pages.SNIncidentPage;
public class Copy_Incident {
WebDriver driver = new ChromeDriver();
@Test
public void test2() throws InterruptedException{
	
	SNHomePage sNHomePage = new SNHomePage(driver);
	sNHomePage.waitpage();
	sNHomePage.incidentsURL();
	sNHomePage.signIn("admin", "6arZfR+^S0eP");
	SNIncidentPage sNIncidentPage = new SNIncidentPage(driver);
	sNIncidentPage.openincdnt();
	sNIncidentPage.cntextmenu();
	sNIncidentPage.cpyIncdent();
	sNIncidentPage.caller2();
	sNIncidentPage.txtcnfrm(); ;


}
}