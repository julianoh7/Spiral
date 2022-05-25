package StepDefinition;

import DriverWrapper.Web;
import Functions.WebCommands;
import Pages.FindigsCreateAccPage;
import Pages.VerifyPhoneNumberPage;
import Pages.WelcomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class WelcomePageSD extends Web {
    FindigsCreateAccPage googleHomePage = new FindigsCreateAccPage();
    WebCommands webCommands = new WebCommands();
    VerifyPhoneNumberPage verifyPhoneNumberPage = new VerifyPhoneNumberPage();
    WelcomePage welcomePage =new WelcomePage();

    @Then("I verify Welcome before users name is displayed")
    public void verifyingWelcomeText(){
        Assert.assertTrue(welcomePage.verifyWelcomeText());
    }

    @And("I click Brooklyn")
    public void clickingBrooklyn (){
        welcomePage.clickBrooklyn();
    }
    @And("I select first property in Brooklyn")
    public void clickingFirstPropertyInBrooklyn(){
        welcomePage.clickFirstPropertyInBrooklyn();
    }
    @And("I click I'm ready to apply")
    public void clickingImReadyToApply (){
        welcomePage.imReadyToApply();
    }
    @And("I click start")
    public void clickingYourHouseHold (){
        welcomePage.clickYourHouseHold();
    }

    @And("I type my street address as '(.+)'")
    public void clickingYourHouseHold (String val){
        welcomePage.typeStreetAddress(val);
    }
    @And("I type my apt number '(.+)'")
    public void typingApt (String val){
        welcomePage.typeApt(val);
    }
    @And("I type my city '(.+)'")
    public void typingCity (String val){
        welcomePage.typeZipCode(val);
    }
    @And("I type my zip code '(.+)'")
    public void typingZipCode (String val){
        welcomePage.typeZipCode(val);
    }

}
