package seProj;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Demo9 {
	WebDriver driver;
	
	@Test
	public void testcase() throws MalformedURLException {
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.ANY);
		driver = new RemoteWebDriver(new URL("http://192.168.43.215:4444/wd/hub"), cap);
		driver.manage().window().maximize();
		driver.navigate().to("http://www.google.com");
		System.out.println(driver.getTitle());
	}
}
