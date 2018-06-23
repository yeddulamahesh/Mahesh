package automation.maven;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

public class MaventestgroupTest {
	WebDriver driver;
	
  @Test(groups="flavour")
  public void f() {
	  System.out.println("i am venilla");
  }
  @Test(groups="flavour")
  public void g() {
	  System.out.println("i am icecreame");
	  

}
  @Test(groups="fruit")
  public void h() {
	  System.out.println("i am grape");
  }
}
