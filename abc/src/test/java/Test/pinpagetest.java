package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.zerodhaloginpage;
import POM.zerodhapinpage;
import Pojo.Browser;
import Utility.Parametrization;

public class pinpagetest 
{
	WebDriver driver;

	@BeforeMethod
	public void chrome() 
	{
	 driver = Browser.test();
	}
	
	@Test
	public void demo() throws EncryptedDocumentException, IOException, InterruptedException {
		
			zerodhaloginpage Zerodhalogin = new zerodhaloginpage(driver);
			 String Username = Parametrization.getdata( 0, 1);
			String	 Password = Parametrization.getdata( 1, 1);
			Zerodhalogin.enteruserid(Username);
			Zerodhalogin.enterpassword(Password);
			Zerodhalogin.clickonlogin();
			
			Thread.sleep(2000);
			
		zerodhapinpage zerodhapin = new zerodhapinpage(driver);
		String Pin = Parametrization.getdata( 2, 1);
		Thread.sleep(3000);
		zerodhapin.enterpin(Pin);
		zerodhapin.clickonsubmit();
		
	}

}
