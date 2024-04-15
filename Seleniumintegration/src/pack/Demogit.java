package pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demogit {
	  @Test
	  public void f() {
		  System.setProperty("webdriver.chrome.driver","D:\\REMYA\\STC\\STC\\SELENIUM\\chrome-driver\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.amazon.in/");
		  System.out.println("Amazon website launched");
		  

}
}