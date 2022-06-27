package Test;

import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POM.zerodhaloginpage;
import Pojo.Browser;
import Utility.Parametrization;

@Listeners(Tlisteners.class)
public class Loginpagetest extends Basetest {

	
	@BeforeMethod
	public void chrome() 
	{
	 driver = Browser.test();
	}
	
	@Test
	public void lohinpagetest() throws  EncryptedDocumentException, IOException {
		zerodhaloginpage Zerodhalogin = new zerodhaloginpage(driver);
		 String Username = Parametrization.getdata( 0, 1);
		String	 Password = Parametrization.getdata( 1, 1);
		Zerodhalogin.enteruserid(Username);
		Zerodhalogin.enterpassword(Password);
		Zerodhalogin.clickonlogin();
	}
}
		
		
	
	
	
	
	
	
	
	




	
		
	

