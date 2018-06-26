package automation.maven;

import org.testng.annotations.Test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class uploadTest {
	WebDriver driver;
	
  @Test
  public void uoload() {
	  
	 driver.findElement(By.xpath("//label[@for='pdf2doc-switch']//span[@class='ui-button-text']")).click();
	  
  }
  @BeforeTest
  public void browser() {
	  
		  System.setProperty("webdriver.chrome.driver","F:\\selenium\\chromedriver.exe");
			 driver= new ChromeDriver();
			 driver.get("https://pdf2doc.com/");
			 driver.manage().window().maximize();

	  
  }

}
