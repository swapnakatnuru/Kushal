package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.Properties;

public class GoogleEd {
    WebDriver driver;
public static Properties prop1;
 public  GoogleEd(WebDriver driver) {
     this.driver = driver;
     PageFactory.initElements(driver, this);

 }
  public void enterUrl() throws InterruptedException {
         Thread.sleep(5000);
      driver.navigate().to("www.google.com");
     }


}
