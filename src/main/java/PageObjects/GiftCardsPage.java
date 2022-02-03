package PageObjects;

import Utilis.DriverFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GiftCardsPage {
    WebDriver driver;
    public static Properties prop;
@FindBy(linkText = "Register")
public WebElement registerlink;
@FindBy(css = "input#gender-female")
public WebElement femaleradiobtn;
@FindBy(id="FirstName")
public WebElement firstnametxtbox;
@FindBy(id="LastName")
public WebElement lastnametxtbox;
@FindBy(name="DateOfBirthDay")
public WebElement dayofbirthday;
@FindBy(name="DateOfBirthMonth")
public WebElement dateofMonth;
@FindBy(name="DateOfBirthYear")
public WebElement dateofYear;
@FindBy(id = "Email")
public WebElement email;
@FindBy(name="Company")
public WebElement company;
@FindBy(id="Password")
public WebElement pwd;
@FindBy(id="ConfirmPassword")
public WebElement conpwd;
@FindBy(id="register-button")
public  WebElement regbtn;
@FindBy(xpath = "//a[text()='Continue']")
public WebElement continuebtn;
public  GiftCardsPage(WebDriver driver){
    this.driver=driver;
    PageFactory.initElements(driver,this);
}
public void clickRegisterLink(){
    registerlink.click();
}
public void femaleRadioBtn(){
    femaleradiobtn.click();
}



public void firstNameTxtBox(String fn) {
   //firstnametxtbox.sendKeys(DriverFactory.prop.getProperty("FirstName"));
   firstnametxtbox.sendKeys(fn);
}
public void lastNameTxtBox(String ln){
    lastnametxtbox.sendKeys(ln);
}

public void dateOfBirthDay(String da){
    Select s1=new Select(dayofbirthday);
    s1.selectByVisibleText(da);

}
public void dateOfMonthDrop(String mn){
    Select s2 = new Select(dateofMonth);
    s2.selectByVisibleText(mn);
}
public void dateOfYearDrop(String yr){
    Select s3 = new Select(dateofYear);
    s3.selectByValue(yr);
}
public void enterEmail(String em){
    email.sendKeys(em);
}
public  void  enterCompany(String cm){
    company.sendKeys(cm);
}
public void enterpwd(String pw){
    pwd.sendKeys(pw);
}
public void enterConPwd(String cpwd){
    conpwd.sendKeys(cpwd);
}
public void clickRegBtn() {
    regbtn.click();


}
public void clickContine(){
    continuebtn.click();
}
}
