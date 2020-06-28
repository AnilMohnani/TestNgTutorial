package Shaadi.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;		

@Listeners(Shaadi.com.Listeners.class)
public class LoginProvider {

	WebDriver driver;
	@Parameters({"URL"})
	@BeforeMethod
	public void initBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\Browser drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fhelp%2Fcustomer%2Fdisplay.html%3FnodeId%3DG4CY3HAXTSFLGC22%26ref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	}
	
@Test(dataProvider="getData")
public void login(String user,String password) {
	driver.findElement(By.id("ap_email")).sendKeys(user);
	driver.findElement(By.id("continue")).click();
	driver.findElement(By.id("ap_password")).sendKeys(password);
	driver.findElement(By.id("signInubmit")).click();
	
}
@DataProvider
public Object[][] getData()
{
	
	return new Object[][] 
	{{"9043745992","Neha6746"}
		
	};
	
}

}
