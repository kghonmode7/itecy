package packagee;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Composepage {

	@FindBy(xpath = "//div[@class='T-I J-J5-Ji T-I-KE L3']")	
	public WebElement compos;

	public Composepage(WebDriver driver) {
		PageFactory.initElements(driver, this);


}

	
}