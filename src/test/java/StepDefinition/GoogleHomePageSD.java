package StepDefinition;

import DriverWrapper.Web;
import Functions.WebCommands;
import Pages.GoogleHomePage;
import Pages.SearchPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.BeforeClass;
import org.testng.Assert;

public class GoogleHomePageSD extends Web {
    GoogleHomePage googleHomePage = new GoogleHomePage();
    WebCommands webCommands = new WebCommands();


    @Given("I am on Google homepage")
    public void launchGoogle(){
        openWebpage();
    }
    @When("I click on Search Box")
    public void clickingSearchBox(){
        googleHomePage.clickSearchBox();
    }
    @And("I type '(.+)'")
    public void sendText(String data){
        googleHomePage.typeInSearchBox(data);
    }
    @And("I click search")
    public void clickingSearch(){
        googleHomePage.enterSearch();
    }
    @And("I quit")
    public void quitPage(){
        quitWebpage();
    }
}
