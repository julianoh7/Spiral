package Pages;

import DriverWrapper.Web;
import Functions.WebCommands;
import org.openqa.selenium.By;

public class SearchPage extends WebCommands {
    Web web = new Web();

    By resultsTextLocator = By.id("result-stats");
    By getGoogleSearchTextLocator= By.xpath("(//input[@value='ducks'])[1]");


    public boolean resultsTextDisplayed (){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       return isWebElementDisplayed(resultsTextLocator);
    }

    public boolean isDuckDisplayed (){
        return isWebElementDisplayed(getGoogleSearchTextLocator);
    }







}
