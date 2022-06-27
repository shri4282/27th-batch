package POM;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dasboardpage 
{
	@FindBy(xpath = "//input[@type = 'password']")private WebElement pin;
	@FindBy(xpath = "//button[@type = 'submit']")private WebElement submit;
	@FindBy(xpath = "//input[@type = 'text']")private WebElement search;
	@FindBy(xpath = "//span[@class='nice-name']")private List<WebElement>sharename;
	@FindBy(xpath = "//utton[text()='B ']") private WebElement buybutton;
	@FindBy(xpath = "//label[@for='radio-214']")private WebElement intraday;
	@FindBy(xpath = "//input[@type = 'number']")private WebElement qty;
	@FindBy(xpath = "//label[@for='radio-242']")private WebElement limitprice;
	@FindBy(xpath = "//input[@label='Trigger price']")private WebElement triggerprice;
	@FindBy(xpath="//label[text()='Market']") private WebElement marketOrder;
	@FindBy (xpath="//label[text()='Limit']") private WebElement limit;
    @FindBy (xpath="//label[text()='SL']") private WebElement stopLoss;
    @FindBy (xpath="//label[text()='SL-M']") private WebElement stopLossMarket;
    @FindBy (xpath="//button[@type='submit']") private WebElement buyShareButton;
    @FindBy (xpath="//button[text()='Cancel ']") private WebElement cancelButton;
	
	public dasboardpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	
	public void enterpin(String pino) {
		pin.sendKeys(pino);
	}
	
	public void clickonsubmit() {
		submit.click();
	}
	
	public void clickonsearch() {
		search.click();
	}
	
	public void entersharename(String name) {
		search.sendKeys(name);
		search.sendKeys(Keys.ENTER);
		search.click();
	}
	
	public void clickonbuy() {
		buybutton.click();
	}
	
	public void clickonintraday(String quantity) {
		intraday.click();
		qty.sendKeys(quantity);
	}
	public void clickOnBuyShare1(String perticulerShare,WebDriver driver)
	{
		Actions action=new Actions(driver);
		for(WebElement stock:sharename)
		{
			if(stock.getText().equals(perticulerShare))
			{
				action.moveToElement(stock).perform();
				buybutton.click();
			}
		}
			
	}
	public void ClickOnLimit(String quantity,String price) throws InterruptedException
	{
		intraday.click();
		qty.clear();
		qty.sendKeys(quantity);
		limitprice.clear();
		limitprice.sendKeys(price);
		//buyShareButton.click();
		Thread.sleep(2000);
		cancelButton.click();
	}

	public void enterUserId(String userName) {
		// TODO Auto-generated method stub
		
	}

	public void enterPassword(String password) {
		// TODO Auto-generated method stub
		
	}

	public void clickOnLogin() {
		// TODO Auto-generated method stub
		
	}

	
	
	
	

}
