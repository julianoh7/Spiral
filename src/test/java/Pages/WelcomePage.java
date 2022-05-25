package Pages;

import DriverWrapper.Web;
import Functions.WebCommands;
import org.openqa.selenium.By;

public class WelcomePage extends WebCommands {
    Web web = new Web();

    By clickBrooklynLocator = By.xpath("//button[text()='brooklyn']");
    By VerifyWelcomeTextLocator = By.xpath("//h2[contains (text(),'Welcome')]");
    By clickFirstPropertyInBrooklynLocator = By.xpath("(//p[contains (text(),'Brooklyn')])[1]");
    By imReadyToApplyLocator = By.xpath("(//div[@class='index-module_inner-text__4qU1f'])[12]");
    By clickYourHouseHoldLocator = By.xpath("(//div[@class='Standard-Body mt-2 card-subtitle h6'])[2]");


    By streetAddressLocator = By.xpath("//input[@name='address_line_1']");
    By aptLocator = By.xpath("(//input[@type='text'])[2]");
    By cityLocator = By.xpath("(//input[@type='text'])[3]");
    By stateLocator = By.xpath("(//input[@type='text'])[4]");
    By zipCodeLocator = By.xpath("(//input[@type='text'])[5]");

    public boolean verifyWelcomeText(){
       return isWebElementDisplayed(VerifyWelcomeTextLocator);
    }
    public void clickBrooklyn (){
        clickThis(clickBrooklynLocator);
    }
    public void clickFirstPropertyInBrooklyn (){
        clickThis(clickFirstPropertyInBrooklynLocator);
    }
    public void imReadyToApply (){
        clickThis(imReadyToApplyLocator);
    }
    public void clickYourHouseHold (){
        clickThis(clickYourHouseHoldLocator);
        clickUsingActionsClass(clickYourHouseHoldLocator);
    }
    public void typeStreetAddress (String val){
        type(val,streetAddressLocator);
    }
    public void typeApt (String val){
        type(val,aptLocator);
    }
    public void typeCity (String val){
        type(val,cityLocator);
    }
    public void typeZipCode (String val){
        type(val,streetAddressLocator);
    }
    public void selectState (String val){
        type(val,zipCodeLocator);
    }



}
