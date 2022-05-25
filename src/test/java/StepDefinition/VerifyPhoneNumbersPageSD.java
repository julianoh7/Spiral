package StepDefinition;

import DriverWrapper.Web;
import Functions.WebCommands;
import Pages.FindigsCreateAccPage;
import Pages.VerifyPhoneNumberPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class VerifyPhoneNumbersPageSD extends Web {
    FindigsCreateAccPage googleHomePage = new FindigsCreateAccPage();
    WebCommands webCommands = new WebCommands();
    VerifyPhoneNumberPage verifyPhoneNumberPage = new VerifyPhoneNumberPage();



    @Then("I verify 'Let’s verify your phone number.' is displayed")
    public void verifyLetsVerifyYourPhoneNumberIsDisplayed(){
        Assert.assertTrue(verifyPhoneNumberPage.isVerifyPhoneNumberTextLocatorDisplayed());
    }
    @And("I type verification code as '(.+)'")
    public void typingVerificationCode(String val) {
        verifyPhoneNumberPage.typeVerificationCode(val);
    }
    @Then("I click Verify")
    public void clickingVerify() {
        verifyPhoneNumberPage.clickVerify();
    }

}
