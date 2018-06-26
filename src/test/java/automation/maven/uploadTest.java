package automation.maven;

import org.testng.annotations.Test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class uploadTest {
	WebDriver driver;
	
  @Test
  public void upload() throws Exception {
	  
	 driver.findElement(By.xpath("//label[@for='pdf2doc-switch']//span[@class='ui-button-text']")).click();
	 WebElement focus= driver.findElement(By.xpath("//span[@class='ui-button-text'][contains(text(),'Upload Files')]"));
	 focus.click();
	 Runtime.getRuntime().exec("C:\\Users\\new\\Desktop\\sample.exe");
	 
	  
  }
  @BeforeTest
  public void browser() {
	  
		  System.setProperty("webdriver.chrome.driver","F:\\selenium\\chromedriver.exe");
			 driver= new ChromeDriver();
			 driver.get("https://pdf2doc.com/");
			 driver.manage().window().maximize();

	  
  }

}
