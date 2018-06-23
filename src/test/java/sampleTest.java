import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

public class sampleTest {
	WebDriver driver;
  @Test
  public void f() {
	  System.out.println("helo");
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("bye");
  }

}
