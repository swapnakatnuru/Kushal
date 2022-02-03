package PageObjects;

import org.apache.hc.client5.http.impl.async.H2AsyncClientBuilder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;
 @FindBy(linkText = "Gift Cards")
 public WebElement giftCardsLink;

    public HomePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void clickGiftCardLink(){
        giftCardsLink.click();
    }
}
