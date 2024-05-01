package PageObjectfile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginclass {
	WebDriver currentdriver;
	public Loginclass(WebDriver d) {
		currentdriver=d;
		PageFactory.initElements(d,this);
	}
	@FindBy(id="username")WebElement username;
	@FindBy(id="password")WebElement password;
	@FindBy(id="submit")WebElement submit;
	public void user(String user)
	{
		username.sendKeys(user);
	}
	public void pass(String pass)
	{
		password.sendKeys(pass);
	}
	public void sub()
	{
		submit.click();
	}
}

		
	


