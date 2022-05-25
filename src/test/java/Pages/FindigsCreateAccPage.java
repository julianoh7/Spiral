package Pages;

import DriverWrapper.Web;
import Functions.WebCommands;
import org.openqa.selenium.By;

public class FindigsCreateAccPage extends WebCommands {
    Web web = new Web();
    By searchBoxLocator = By.xpath("//input[@title='Search']");
    By clickSearchLocator = By.xpath("(//input[@type='submit'])[1]");
    By clickOnANonClickableElementLocator = By.xpath("//img[@alt='Google']");

    By firstNameLocator = By.xpath("//input[@name='firstName']");
    By lastNameLocator = By.xpath("//input[@name='lastName']");
    By emailLocator = By.xpath("//input[@name='email']");
    By phoneLocator = By.xpath("//input[@type='tel']");
    By pswLocator = By.xpath("//input[@name='newPassword']");
    By confirmPswLocator = By.xpath("//input[@name='confirmNewPassword']");
    By submitButtonLocator = By.xpath("//div[text()='Create an account']");
    By clickCreateAnAccountText = By.xpath("//*[contains (text(),'Create an account')]");





    public void typeFirstName (String val){
        type(val,firstNameLocator);
    }
    public void typeLastName (String val){
        type(val,lastNameLocator);
    }
    public void typeEmail (String val){
        type(val,emailLocator);
    }
    public void typePhone (String tel){
        type(tel,phoneLocator);
    }
    public void typePswLocator (String psw){
        type(psw,pswLocator);
    }
    public void typeConfirmPswLocator (String psw){
        type(psw,confirmPswLocator);
    }
    public void clickSubmit (){
        clickThis(clickCreateAnAccountText);
        clickThis(submitButtonLocator);
    }





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
