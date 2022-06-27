package POM;
    import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	
	public class zerodhaloginpage 
	{
        @FindBy(xpath = "//input[@type = 'text']") private WebElement userid;
		@FindBy(xpath = "//input[@type = 'password']") private WebElement password;
		@FindBy(xpath = "//button[@type = 'submit']") private WebElement login;
		@FindBy(xpath = "//a[text() = 'Forgot user ID or password?']") private WebElement forgot;
		@FindBy(xpath = "//a[text() = \"Don't have an account? Signup now!\"]") private WebElement signup;
		
		public zerodhaloginpage (WebDriver driver) {
			PageFactory.initElements(driver, this);
			
		}
			
			public void enteruserid(String user) {
				userid.sendKeys(user);
			}
			
			public void enterpassword(String pass) {
				password.sendKeys(pass);
		}
			
			public void clickonlogin() {
				login.click();
			}
			
			public void clickonforgot() {
				forgot.click();
			}
			
			public void clickonsignup() {
				signup.click();
			}

			public void enterpin(String pin) {
				// TODO Auto-generated method stub
				
			}

			public void clickOnContinue() {
				// TODO Auto-generated method stub
				
			}

	}



