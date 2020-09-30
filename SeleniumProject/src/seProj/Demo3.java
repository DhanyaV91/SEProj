package seProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo3 {
	WebDriver driver;
	
	@BeforeTest
	public void bt() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	}
	
	@Test(groups={"Smoke"})
	public void testcase1() {
		WebElement un = driver.findElement(By.xpath("//*[@id='txtUsername']"));
		un.sendKeys("Admin");
		String expectedName = "Admin";
		String actualName = un.getAttribute("value");
		System.out.println(actualName);
		Assert.assertEquals(actualName, expectedName);
	}
	
	@Test(groups={"Smoke"})
	public void testcase2() {
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		String actual = driver.findElement(By.id("welcome")).getText();
		String expected = "Welcome Linda";
		Assert.assertEquals(actual, expected);
	}
	
	@Test(groups={"Regression"})
	public void testcase3() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id='welcome']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
	}
}
