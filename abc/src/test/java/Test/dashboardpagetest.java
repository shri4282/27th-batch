package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.dasboardpage;
import POM.zerodhaloginpage;
import POM.zerodhapinpage;
import Pojo.Browser;
import Utility.Parametrization;

public class dashboardpagetest 
{
	WebDriver driver;
	
	@BeforeMethod
	public void chrome() {
		driver = Browser.test();
	}
	@Test
	public void dashboard() throws EncryptedDocumentException, IOException, InterruptedException {
	dasboardpage zerodha = new dasboardpage(driver);
	String userName=Parametrization.getdata( 0, 1);
	String password=Parametrization.getdata( 1, 1);
	zerodha.enterUserId(userName);
	zerodha.enterPassword(password);
	zerodha.clickOnLogin();
	
	Thread.sleep(2000);
	
	zerodhaloginpage zerodhapinpage=new zerodhaloginpage(driver);
	String pin=Parametrization.getdata( 2, 1);
	System.out.println(pin);
	zerodhapinpage.enterpin(pin);
	zerodhapinpage.clickOnContinue();
	Thread.sleep(2000);

}
}
