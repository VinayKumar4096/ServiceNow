package sn.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SNImpersonateUser {
	WebDriver driver;

	public SNImpersonateUser(WebDriver dr) {
		// super(dr);
		this.driver = dr;
		PageFactory.initElements(dr, this);
	}

	@FindBy(css = ".user-name.hidden-xs.hidden-sm.hidden-md")
	WebElement sysadmin;
	@FindBy(id = "glide_ui_impersonator")
	WebElement impersonatoruser;
	@FindBy(id = "select2-chosen-2")
	WebElement search;
	@FindBy(xpath = "//*[@id='s2id_autogen2_search']")
	WebElement drpdwn;
	@FindBy(css = "li[class='select2-results-dept-0 select2-result select2-result-selectable select2-highlighted']")
	List<WebElement> options;

	public void impersuser(String name) {
		sysadmin.click();
		impersonatoruser.click();
		search.click();
		drpdwn.sendKeys(name);
		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase(name))
				;

			{
				option.click();
				break;
			}
		}
	}

}
