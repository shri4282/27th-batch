package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.Forgotpage;
import Pojo.Browser;
import Utility.Parametrization;

public class ForgotuserIDTest 
{

	WebDriver driver;
	
	@BeforeMethod
	public void chrome() 
	{
		driver = Browser.test();
	}
	
	@Test
	 public void forgot() throws EncryptedDocumentException, IOException, InterruptedException {
		Forgotpage zerodha = new Forgotpage(driver);
		zerodha.clickonforgot();
		
		zerodha.clickonfrgtuserid();
		
		String pno = Parametrization.getdata(3, 1);
		zerodha.enterpanumber(pno);
		
		//String user = Parametrization.getdata(3, 1);
		//zerodha.enteruid(user);
		
		//String p = Parametrization.getdata(4, 1);
		//zerodha.enterpanno(p);
		
		//String e = Parametrization.getdata(5, 1);
		//zerodha.enteremail(e);
		
		
		zerodha.clickonsms();
		String number = Parametrization.getdata(6, 1);
		zerodha.enteronph(number);
	
		
		
	}
	
}
