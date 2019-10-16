package packagee;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	@FindBy(xpath = "//input[@id='identifierId']")	
	 public WebElement uid;

@FindBy(xpath = "//div[@class='ZFr60d CeoRYc']")
    public WebElement uidnext;

@FindBy(xpath="//div[@class='GQ8Pzc']")
    public WebElement blankuid;

@FindBy(xpath= "//div[@class='GQ8Pzc']")
    public WebElement Invaliduid;

public Homepage(WebDriver driver) {
PageFactory.initElements(driver, this);
}

public void fill_uid(String X) {
uid.sendKeys(X);
}
public void click_uidnext() {
uidnext.click();
}
		
}
