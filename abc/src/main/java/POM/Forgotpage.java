package POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Forgotpage 
{
	@FindBy(xpath = "//a[text() = 'Forgot user ID or password?']") private WebElement forgotlink;
	@FindBy(xpath = "(//input[@type = 'text'])[1]")private WebElement userid;
	@FindBy(xpath = "(//input[@type = 'text'])[2]")private WebElement pan;
	@FindBy(xpath = "(//input[@type = 'text'])[3]")private WebElement email;
	@FindBy(xpath = "(//label[@class = 'su-radio-label'])[4]")private WebElement sms;
	@FindBy(xpath = "//input[@placeholder='Mobile number (as on account)']")private WebElement phnumber;
	@FindBy(xpath = "//label[@for = 'radio-31']")private WebElement frgtmyuserid;
	@FindBy(xpath = "//input[@placeholder = 'PAN']")private WebElement paan;

	public Forgotpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickonforgot() {
	 forgotlink.click();
	} 
	
	public void enteruid(String user) {
		userid.sendKeys(user);
	}
	
	public void enterp(String pno) {
		pan.sendKeys(pno);
	}
	
	public void enteremail(String emailid) {
		email.sendKeys(emailid);
	}
	
      
	public void clickonsms() {
		sms.click();
	}
	
	public void enteronph(String phno) {
		phnumber.sendKeys(phno);
	}
	 
	public void enteruserid(String username) {
		userid.sendKeys(username);
	}
	
	public void enterpanno(String pannumber) {
		pan.sendKeys(pannumber);
	}
	
	public void selectemail() {
		email.click();
	}
	
	public void enteremailaddress(String emails) {
		email.sendKeys(emails);
	}
	
	public void clickonfrgtuserid() {
		frgtmyuserid.click();
	}
	
	public void enterpanumber(String panno) {
		paan.sendKeys(panno);
	}
	
	
	
	
	
	
	

}

