package com.test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import sn.pages.SNHomePage;
import sn.pages.SNImpersonateUser;
import sn.pages.SNIncidentPage;

public class Test_Demote_Major_Incident {
	WebDriver driver = new ChromeDriver();

	@Test
	public void test2() throws InterruptedException {
		SNHomePage sNHomePage = new SNHomePage(driver);
		sNHomePage.waitpage();
		sNHomePage.URL();
		sNHomePage.signIn("admin", "6arZfR+^S0eP");
		SNImpersonateUser sNImpersonateUser = new SNImpersonateUser(driver);
		sNImpersonateUser.impersuser("Major");
		sNHomePage.incidentsURL();
		SNIncidentPage sNIncidentPage = new SNIncidentPage(driver);
		sNIncidentPage.openIncident();
		sNIncidentPage.cntextmenu();
		sNIncidentPage.demoteitem();
		sNIncidentPage.demtepopup("TEST");
		String message = sNIncidentPage.txtcnfrm1();
		assertEquals("INC0010138 is no longer a major incident", message);
		String fieldmessage = sNIncidentPage.majorincidentstate3();
		assertEquals("Canceled", fieldmessage);
		sNIncidentPage.update();
	}
}