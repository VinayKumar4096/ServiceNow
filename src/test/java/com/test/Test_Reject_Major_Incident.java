package com.test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import sn.pages.SNHomePage;
import sn.pages.SNImpersonateUser;
import sn.pages.SNIncidentPage;

public class Test_Reject_Major_Incident {
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
		sNIncidentPage.rejectitem();
		sNIncidentPage.rpopup("TEST");
		String message = sNIncidentPage.txtcnfrm1();
		assertEquals("Major incident candidate INC0010138 has been rejected.", message);
		String fieldmessage = sNIncidentPage.majorincidentstate1();
		assertEquals("Rejected", fieldmessage);
		sNIncidentPage.update();
	}
}