package StepDefinition;

import DriverWrapper.Web;
import Functions.WebCommands;
import Pages.SearchPage;
import cucumber.api.java.en.Then;
import org.testng.Assert;

import java.awt.*;

public class SearchPageSD  extends Web {
    WebCommands webCommands = new WebCommands();
    SearchPage searchPage = new SearchPage();

    @Then("I verify results is Displayed")
    public void verifyResults (){
        Assert.assertTrue(searchPage.resultsTextDisplayed());
    }

    @Then("I verify duck is present on Search Box")
    public void verifyWord(){
        Assert.assertTrue(searchPage.isDuckDisplayed());
    }


}
