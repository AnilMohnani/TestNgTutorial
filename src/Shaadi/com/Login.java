package Shaadi.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Login {
	WebDriver driver;
	@Parameters({"URL"})
	@BeforeMethod
	public void initBrowser(String url)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	}
	@Parameters({"USER","PASS"})
	@Test
	public void shaadiLogin(String username,String password)
	{
	driver.findElement(By.cssSelector("a.blue")).click();
	driver.findElement(By.id("login_page")).sendKeys(username);
	driver.findElement(By.id("password_page")).sendKeys(password);
	driver.findElement(By.linkText("Sign In")).click();
	driver.switchTo().alert().dismiss();
	}
	
}
