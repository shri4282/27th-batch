package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class zerodhapinpage 
{
	@FindBy(xpath = "//input[@id = 'pin']")private WebElement pin;
	@FindBy(xpath = "//button[@type = 'submit']")private WebElement submit;
	@FindBy(xpath = "//a[text() = 'Forgot 2FA?']")private WebElement forgot;
	@FindBy(xpath = "//a[text() = \"Don't have an account? Signup now!\"]")private WebElement signup;
	
	public zerodhapinpage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterpin(String pinNumber) {
		pin.sendKeys(pinNumber);
	}
	public void clickonsubmit() {
		submit.click();
	}
	public void clickonforgor() {
		forgot.click();
	}
	public void clickonsignup() {
		signup.click();
	}

}
