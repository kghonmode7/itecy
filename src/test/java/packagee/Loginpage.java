package packagee;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	

		@FindBy(name = "password")	
		public WebElement pass;

		@FindBy(xpath = "//span[contains(text(),'Enter a password')]")
		public WebElement blankpass;

		@FindBy(xpath = "//div[@class='xgOPLd']")
		public WebElement Invalidpass;

		@FindBy(xpath = "//*[text()='Next']")
		public WebElement passnext;


		public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		}

		public void fill_pass(String X) {
		pass.sendKeys(X);
		}
		public void click_passnext(){
		passnext.click();	
		}
}
