package seProj;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pgm1{
	//WebDriver driver;
	
	 // @Before
	 // protected void setUp(){
		//System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		//driver = new ChromeDriver();
	     //driver.get("http://demowebshop.tricentis.com/");
	     //driver.manage().window().maximize();
	     //driver.findElement(By.linkText("Log in")).click();
	   //}
	   //@After 
	   //protected void tearDown(){
	      
		//driver.quit();
	   //}
	  
	 // @Test
	  //public void testTitle() {
	      // write your code to login
	     /* driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("manzoormehadi26@gmail.com");
	      driver.findElement(By.xpath("//*[@id='Password']")).sendKeys("manzoor");
	      driver.findElement(By.xpath("//*[@value='Log in']")).click();
	      
		  String Expected ="manzoormehadi26@gmail.com";
		  String Actual = driver.getTitle();
		  System.out.println(Actual);
		  //assertEquals(Actual, Expected);*/
	  //}
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("http://demowebshop.tricentis.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.linkText("Log in")).click();
	    driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("manzoormehadi26@gmail.com");
	    driver.findElement(By.xpath("//*[@id='Password']")).sendKeys("manzoor");
	    driver.findElement(By.xpath("//*[@value='Log in']")).click();
	      
		String Expected ="manzoormehadi26@gmail.com";
		//List <WebElement> link = driver.findElements(By.tagName("a");
		//System.out.println(link);
		//String Actual = link.get(0);
			  
		
		
	}
	  
}
