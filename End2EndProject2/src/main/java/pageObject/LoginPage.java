package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage {


	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	By email = By.id("user_email");
	By passwd = By.id("user_password");
	By login = By.xpath("//input[@type='submit']");
	
	public WebElement getEmail() {
		
		return driver.findElement(email);
	}
	
    public WebElement getPasswd() {
		
		return driver.findElement(passwd);
	}
    
    public WebElement getLogin() {
		
		return driver.findElement(login);
	}
	
	

}