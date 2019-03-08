package SDET.SDET;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {
	WebDriver driver;
	@BeforeTest
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium drivers\\chromedriver.exe");
		System.out.println("*******Start of Application********");
	 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demowebshop.tricentis.com/login");
	}
	@Test
	public void login() {
		driver.findElement(By.id("Email")).sendKeys("suresha37298@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Anbs@8513!");
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.xpath("//*[@value='Log in']")).click();
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}
}

