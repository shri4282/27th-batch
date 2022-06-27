package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signupage 
{
	@FindBy(xpath = "//a[@class='text-light']")private WebElement signup;
	@FindBy(xpath = "//input[@id ='user_mobile']")private WebElement phnumber;
	@FindBy(xpath = "//button[@type = 'submit']")private WebElement submit;
	
	public Signupage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickonsignup() {
		signup.click();
	}
	 
	public void enterphno(String pno) {
		phnumber.sendKeys(pno);
	}
	
	public void clickonsubmit() {
		submit.click();
	}
}
