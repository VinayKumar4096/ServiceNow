package sn.pages;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SNHomePage /* extends SNBaseTest */ {
	WebDriver driver;

	public SNHomePage(WebDriver dr) {
		// super(dr);
		this.driver = dr;
		PageFactory.initElements(dr, this);
	}

	@FindBy(id = "user_name")
	WebElement uname;
	@FindBy(id = "user_password")
	WebElement password;
	@FindBy(id = "sysverb_login")
	WebElement submit;

	public void signIn(String u, String p) {

		driver.switchTo().frame(0);
		uname.sendKeys(u);
		password.sendKeys(p);

		submit.click();
	}

	public void openURL() {
		driver.manage().window().maximize();
		driver.get("https://dev216507.service-now.com/nav_to.do?uri=incident.do?sys_id=-1");

	}

	public void URL() {
		driver.manage().window().maximize();
		driver.get(
				"https://dev216507.service-now.com/nav_to.do?uri=%2Fui_page.do%3Fsys_id%3D57b0e69e47e23110ee86f5e3416d43c4");
	}

	public void waitpage() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	public void incidentsURL() {
		driver.manage().window().maximize();
		driver.get(
				"https://dev216507.service-now.com/nav_to.do?uri=%2Fincident_list.do%3Factive%3Dtrue%26sysparm_query%3Dactive%3Dtrue%5EEQ");
	}
}