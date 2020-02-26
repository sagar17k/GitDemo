package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import pageObject.LoginPage;
import resources.Base;

public class HomePage extends Base {
	private static Logger log = LogManager.getLogger(validatTitle.class);
	
	@BeforeTest
	public void loadDriver() throws IOException
	{
		driver = initializeDriver();
		
	}
	
	@Test(dataProvider="getData")
	public void basePageNavigation(String name , String psswd) throws IOException {
		driver.get(prop.getProperty("url"));
		log.info("Driver is initialized");
		LandingPage ld = new LandingPage(driver);
		ld.getLogin().click();
		log.info("Login is clicked");
		LoginPage lp = new LoginPage(driver);
		lp.getEmail().sendKeys(name);
		log.info("EmailID is sent");
		lp.getPasswd().sendKeys(psswd);
		log.info("Password is sent");
		lp.getLogin().click();
		log.info("Clicked Login");
		
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
	}
	
	@DataProvider
	public Object[][] getData() {
		
		Object data [][]=new Object[2][2];
		data[0][0]="firstName";
		data[0][1]="firstpassword";
		data[1][0]="secondName";
		data[1][1]="secondpassword";
		
		return data;
	}
	
	
	
	
	

}