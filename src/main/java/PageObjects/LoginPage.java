package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}

	private By username=By.name("username");
	private By password=By.cssSelector("input[type='password']");
	private By LoginButton=By.cssSelector("input[class*='login-button']");
	private By ForgotPassword=By.xpath("//*[text()='Forgot your password?']");
	
	public WebElement getUsername() {
		return driver.findElement(username);
	}

	public WebElement getpassword() {
		return driver.findElement(password);
	}

	public WebElement getLoginButton() {
		return driver.findElement(LoginButton);
		
	}

	public WebElement getForgotPassword() {
		return driver.findElement(ForgotPassword);
		
	}




}
