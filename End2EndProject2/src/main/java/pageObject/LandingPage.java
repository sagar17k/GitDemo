package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;

	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	By login = By.xpath("//a[@href='http://qaclickacademy.usefedora.com/sign_in']");
	//By title = By.cssSelector("#content > div > div > h2");
	By contact = By.cssSelector("#homepage > header > div.navbar.navbar-default.navbar-static-top > div > nav > ul > li:nth-child(8) > a");
	
	
	public WebElement getLogin() {
		
		return driver.findElement(login);
	}
	
	public WebElement getTitle() {
		
		return driver.findElement(contact);
	}
	
	

}
