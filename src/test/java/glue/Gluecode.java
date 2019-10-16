package glue;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import packagee.Composepage;
import packagee.Homepage;
import packagee.Loginpage;


public class Gluecode {

	public WebDriver driver;
	public WebDriverWait wait;
	public Scenario s;
	public Properties p;
	public Homepage hp;
	public Loginpage lp;
	public Composepage c;
		
	@Before
	public void method(Scenario s) throws Exception {
	this.s =s;
	FileInputStream f = new FileInputStream("D:\\OSWOrkplace\\itecy\\src\\test\\resources\\ran\\file.properties");
	p = new Properties();
	p.load(f);
	}

	@Given("^Launch the site$")
	public void launch_site() {
		System.setProperty("WebDriver.chrome.driver",p.getProperty("cdpath"));
		hp = new Homepage(driver);
		lp = new Loginpage(driver);
		c =new Composepage(driver);
		driver.get(p.getProperty("url"));
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, 100);
	}

	@When("^enter the uid like \"(.*)\" value$")
	public void enter_uid(String X) {
		wait.until(ExpectedConditions.visibilityOf(hp.uid));
		hp.fill_uid(X);
	}

	@And("^click on the next$")
	public void Click_next() {
	wait.until(ExpectedConditions.visibilityOf(hp.uidnext));
	hp.click_uidnext();
	}
	@Then("^Validate the uid output with \"(.*)\" with \"(.*)\" criteria$")
	public void validate_uid(String X, String Y) {
		try {
			if(X.length()==0 && hp.blankuid.isDisplayed()) {
				s.write("Blank Uid test is passed");
			}
				
			else if(Y.equalsIgnoreCase("Invalid") && hp.Invaliduid.isDisplayed()) {
				s.write("Invalid Uid");
			}
		
		
			else if(Y.equalsIgnoreCase("Valid") && lp.pass.isDisplayed()) {
				s.write("Valid Uid test is passed");
			}
		  
			else {
				
			byte[] b =((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			s.embed(b,"uid test failed");
			
			}
			
		}
		catch(Exception ex) {
			s.write(ex.getMessage());
		}
	}

	@When("^close the site$")
	public void close_site() {
		driver.quit();
	}

	@When("^enter the pass like \"(.*)\" value$")
	public void enter_pass(String X) {
		wait.until(ExpectedConditions.visibilityOf(lp.pass));
		lp.fill_pass(X);
	}

	@And("^click on pass next button$")
	public void Click_on_next() {
		lp.click_passnext();
	}

	@Then("^validte pass button \"(.*)\" with \"(.*)\" criteria$") 
	public void validate_pass(String X, String Y) {
		try {
			if(X.length()==0 && lp.blankpass.isDisplayed()) {
				s.write("Blank pass test is passed");
			}
				
			else if(Y.equalsIgnoreCase("Invalid") && lp.Invalidpass.isDisplayed()) {
				s.write("Invalid pass");
			}
		
		
			else if(Y.equalsIgnoreCase("Valid") && c.compos.isDisplayed()) {
				s.write("Valid pass test is passed");
			}
		  
			else {
				
			byte[] b =((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			s.embed(b,"pass test failed");
			
			}
			
		}
		catch(Exception ex) {
			s.write(ex.getMessage());
		}
	}
	
	
	
}
