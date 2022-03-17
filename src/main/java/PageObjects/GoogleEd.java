package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class GoogleEd {
    WebDriver driver;

    public  GoogleEd(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    
}
