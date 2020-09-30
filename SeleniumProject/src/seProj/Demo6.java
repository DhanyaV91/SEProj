package seProj;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Demo6 {
  public WebDriver driver;
  
	@Parameters("mybrowser")
	@BeforeTest
	public void beforeTest(String mybrowser) {
		if(mybrowser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			driver = new ChromeDriver();			
		}else if(mybrowser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
  }
  
  @Test
  public void testcase() {
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  String title = driver.getTitle();
	  System.out.println(title);
	  String Url = driver.getCurrentUrl();
	  System.out.println(Url);	  
  }  

  @AfterTest
  public void afterTest() throws InterruptedException {
	  Thread.sleep(2000);
	  driver.close();
  }

}
