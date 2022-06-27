package Test;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.Signupage;
import Pojo.Browser;
import Utility.Parametrization;

public class Signuppagetest 
{
	WebDriver driver;
	
	@BeforeMethod
	public void chrome() {
		driver=Browser.test();
	}
	
	@Test
	public void signuptest() throws EncryptedDocumentException, IOException {
		Signupage as = new Signupage(driver);
		as.clickonsignup();
		Set<String> cl = driver.getWindowHandles();
		Iterator<String> i = cl.iterator();
		String address = i.next();
		String address2 = i.next();
		System.out.println(address2);
		driver.switchTo().window(address2);
		String pno = Parametrization.getdata(6, 1);
		as.enterphno(pno);
		as.clickonsubmit();
	
		
	
	


}
}
