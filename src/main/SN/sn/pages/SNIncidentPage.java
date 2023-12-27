package sn.pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SNIncidentPage /* extends SNBaseTest */ {
	WebDriver driver;

	public SNIncidentPage(WebDriver dr) {
		this.driver = dr;
		PageFactory.initElements(dr, this);
	}
	// @FindBy(id="incident.number")
	// WebElement incnumber;

	@FindBy(xpath = "//*[contains(@value,'INC')]")
	WebElement incnumber;
	@FindBy(xpath = "//input[@id='sys_display.incident.caller_id']")
	WebElement caller;

	@FindBy(xpath = "//input[@id='incident.short_description']")
	WebElement sdescrpton;

	@FindBy(id = "gsft_main")
	WebElement fr;

	@FindBy(id = "sys_display.incident.business_service")
	WebElement servicetxt;
	@FindBy(id = "sys_display.incident.cmdb_ci")
	WebElement serviceofftxt;

	@FindBy(id = "incident.contact_type")
	WebElement channeldrpdwn;
	@FindBy(id = "sys_display.incident.assignment_group")
	WebElement asgnmtgrp;

	@FindBy(id = "sys_display.incident.assigned_to")
	WebElement asgnedto;
	@FindBy(id = "incident.description")
	WebElement incddescrptn;
	@FindBy(id = "sysverb_insert")
	WebElement submitbtn;

	@FindBy(xpath = "//a[contains(@aria-label,'Open record:')][1]")
	WebElement openincident;

	@FindBy(id = "sysverb_delete")
	WebElement deletebtn;

	@FindBy(id = "ok_button")
	WebElement deltecnfrmbtn;

	@FindBy(xpath = "//*[@id='row_incident_cd2129e547433110ee86f5e3416d43f4']/td[3]/a")
	WebElement incdntopen;
	@FindBy(xpath = "//*[@id='section-bf1d96e3c0a801640190725e63f8ac80.header']/nav/div/div[1]/button[2]")
	WebElement cntxtbtn;

	@FindBy(id = "sysverb_update")
	WebElement updatebutton;
	@FindBy(xpath = "//*[@id='context_1']/div[4]")
	WebElement cpyincdent;
	@FindBy(id = "incident.work_notes")
	WebElement txt;
	@FindBy(xpath = "//*[@id='context_1']/div[7]")
	WebElement problembutton;
	@FindBy(xpath = "//*[@id='output_messages']/div/div/div")
	WebElement text;
	@FindBy(xpath = "//*[@id='context_1']/div[13]")
	WebElement propseitem;
	@FindBy(id = "mim-propose-work-notes")
	WebElement notes;
	@FindBy(id = "mim-propose-button")
	WebElement propsebutton;
	@FindBy(xpath = "//*[@id='tabs2_section']/span[4]/span[1]/span[2]")
	WebElement majorIncidentTab;
	@FindBy(xpath = "//*[@id='sys_readonly.incident.major_incident_state']/option[2]")
	WebElement fieldtext;
	@FindBy(xpath = "//div[@title='Rejects Major Incident Candidate']")
	WebElement reject;
	@FindBy(id = "mim_rejection_reason_text")
	WebElement rnotes;
	@FindBy(id = "mim_rejection_reason_ok_btn")
	WebElement rejectbutton;
	@FindBy(xpath = "//*[@id='sys_readonly.incident.major_incident_state']/option[4]")
	WebElement ftext;
	@FindBy(xpath = "//div[@title='Promotes the current major incident candidate as a major incident']")
	WebElement promteitem;
	@FindBy(id = "mim-promote-work-notes")
	WebElement promotenotes;
	@FindBy(id = "mim-promote-button")
	WebElement promotebutton;
	@FindBy(xpath = "//*[@id='sys_readonly.incident.major_incident_state']/option[3]")
	WebElement aftext;
	@FindBy(xpath = "//div[normalize-space()='Demote Major Incident']")
	WebElement demoteitem;
	@FindBy(id = "mim_demote_reason_text")
	WebElement demotentes;
	@FindBy(id = "demote_notes_ok_btn")
	WebElement demotebutton;
	@FindBy(xpath = "//*[@id=\"sys_readonly.incident.major_incident_state\"]/option[5]")
	WebElement dftext1;

	public void incidentnumber() {
		driver.switchTo().frame("gsft_main");
		System.out.println(incnumber.getAttribute("value"));
	}
	// public void incidentnumber(){
	// driver.switchTo().frame("gsft_main");
	// System.out.println(incnumber.getText());
	// }

	public void caller1() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// driver.switchTo().frame("gsft_main");
		Thread.sleep(5000);
		// wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(fr));
		WebElement Category_Body = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.id("sys_display.incident.caller_id")));
		Category_Body.sendKeys("ITIL User");
		// driver.switchTo().defaultContent();
	}

	public void sdescrptn(String txt) {

		sdescrpton.sendKeys(txt);

		sdescrpton.click();
	}

	public void service(String txt) {
		servicetxt.sendKeys(txt);
		servicetxt.click();
	}

	public void serviceOffering(String txt) {
		serviceofftxt.sendKeys(txt);

		serviceofftxt.click();
	}

	public void channel(String txt) {
		channeldrpdwn.click();
		WebElement staticdropdown = channeldrpdwn;
		Select s = new Select(staticdropdown);
		s.selectByVisibleText(txt);
	}

	public void assignmentGroup(String txt) {
		asgnmtgrp.sendKeys(txt);
		asgnmtgrp.click();
	}

	public void assignedTo(String txt) {
		asgnedto.sendKeys(txt);
		asgnedto.click();
	}

	public void incidentDescription(String txt) {
		incddescrptn.sendKeys(txt);
		incddescrptn.click();
	}

	public void submit() {
		submitbtn.click();
	}

	public void openIncident() {
		driver.switchTo().frame("gsft_main");
		openincident.click();
	}

	public void deleteIncident() {
		deletebtn.click();
	}

	public void cnfrmdelte() {
		deltecnfrmbtn.click();
	}

	public void openincdnt() {
		driver.switchTo().frame("gsft_main");
		incdntopen.click();
	}

	public void cntextmenu() {
		cntxtbtn.click();
	}

	public void cpyIncdent() {
		cpyincdent.click();
	}

	public void txtcnfrm() {
		String text1 = txt.getText();
		System.out.println(text1);
	}

	public void caller2() {
		caller.click();
		caller.sendKeys("Deepa Shah");
	}

	public void prbinc() {
		problembutton.click();

	}

	public String txtcnfrm1() {
		String text1 = text.getText();
		return text1;
	}

	public void update() {

		updatebutton.click();

	}

	public void propose() {
		propseitem.click();
	}

	public void popup(String text) {
		notes.sendKeys(text);

		propsebutton.isEnabled();
		propsebutton.click();
	}

	public String majorincidentstate() {
		majorIncidentTab.click();
		String text = fieldtext.getText();
		return text;
	}

	public void rejectitem() {
		reject.click();

	}

	public void rpopup(String text) {
		rnotes.sendKeys(text);
		rejectbutton.click();

	}

//	public void rejectbtn()
//	{
//		rejectbutton.click();
//		String text1 = text.getText();
//		System.out.println(text1);
//		majorIncidentTab.click();
//		String text = ftext.getText();
//		System.out.println(text);
//	}
	public String majorincidentstate1() {
		majorIncidentTab.click();
		String text = ftext.getText();
		return text;
	}

	public void promoteitm() {
		promteitem.click();
	}

	public void promotepopup(String text) {
		promotenotes.sendKeys(text);
		promotebutton.click();
	}

	public String majorincidentstate2() {
		majorIncidentTab.click();
		String text = aftext.getText();
		return text;
	}

	public void demoteitem() {
		demoteitem.click();
	}

	public void demtepopup(String text) {
		demotentes.sendKeys(text);
		demotebutton.click();
	}

	public String majorincidentstate3() {
		majorIncidentTab.click();
		String text = dftext1.getText();
		return text;
	}
}
