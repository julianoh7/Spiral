package Pages;

import DriverWrapper.Web;
import Functions.WebCommands;
import org.openqa.selenium.By;

public class VerifyPhoneNumberPage extends WebCommands {
    Web web = new Web();

    By VerifyPhoneNumberTextLocator = By.xpath("//h2[text()='Let’s verify your phone number.']");
    By typeVerificationCodeLocator = By.xpath("//input[@name='code']");
    By clickVerifyLocator = By.xpath("//div[text()='Verify']");

    public boolean isVerifyPhoneNumberTextLocatorDisplayed (){
       return isWebElementDisplayed(VerifyPhoneNumberTextLocator);
    }
    public void typeVerificationCode (String val){
        type(val,typeVerificationCodeLocator);
    }
    public void clickVerify (){
        clickThis(VerifyPhoneNumberTextLocator);
        clickThis(clickVerifyLocator);
    }



}
