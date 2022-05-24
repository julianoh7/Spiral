package Pages;

import DriverWrapper.Web;
import Functions.WebCommands;
import org.openqa.selenium.By;

public class GoogleHomePage extends WebCommands {
    Web web = new Web();
    By searchBoxLocator = By.xpath("//input[@title='Search']");
    By clickSearchLocator = By.xpath("(//input[@type='submit'])[1]");
    By clickOnANonClickableElementLocator = By.xpath("//img[@alt='Google']");




    public void clickSearchBox(){
        clickThis(searchBoxLocator);
    }
    public void typeInSearchBox(String data){
        type(data,searchBoxLocator);
    }
    public void enterSearch(){
        clickThis(clickSearchLocator);
    }

}
