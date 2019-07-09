package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class pageModel {
	@FindBy(how=How.NAME,using="Email")
	static public WebElement username;
	@FindBy(how=How.NAME,using="Password")
	static public WebElement password;
	@FindBy(how=How.XPATH,using="//div[5]/input")
    static public WebElement signIn;
}
