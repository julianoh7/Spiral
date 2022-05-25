package StepDefinition;

import DriverWrapper.Web;
import Functions.WebCommands;
import Pages.FindigsCreateAccPage;
import Pages.VerifyPhoneNumberPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class FindigsCreateAccPageSD extends Web {
    FindigsCreateAccPage findigsCreateAccPage = new FindigsCreateAccPage();
    WebCommands webCommands = new WebCommands();
    VerifyPhoneNumberPage verifyPhoneNumberPage = new VerifyPhoneNumberPage();


    @Given("I launch findigs create account page")
    public void launchFindigsCreateAccPage(){
        openWebpage();
    }

    @When("I type first name as '(.+)'")
   public void typingFirstName (String name){
        findigsCreateAccPage.typeFirstName(name);
   }

   @And("I type last name as '(.+)'")
    public void typingLastName (String lastName){
       findigsCreateAccPage.typeLastName(lastName);
    }
    @And("I type email as '(.+)'")
    public void typingEmail (String email){
        findigsCreateAccPage.typeEmail(email);
    }
    @And("I type phone number as '(.+)'")
    public void typingPhone(String tel){
        findigsCreateAccPage.typePhone(tel);
    }
    @And("I type password as '(.+)'")
    public void typingPsw(String psw){
        findigsCreateAccPage.typePswLocator(psw);
    }
    @And("I type password confirmation as '(.+)'")
    public void typingConfirmPsw(String psw){
        findigsCreateAccPage.typeConfirmPswLocator(psw);
    }
    @And("I click submit")
    public void clickingSubmit(){
        findigsCreateAccPage.clickSubmit();
    }





}
