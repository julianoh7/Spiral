package Functions;

import DriverWrapper.Web;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Set;

public class WebCommands {
    Web web = new Web();

    public WebElement getWebElement(By locator) {
        return web.getDriver().findElement(locator);
    }
    public List<WebElement> getWebElementsMethod(By locator) {
        return web.getDriver().findElements(locator);
    }
    public void getTextMethod(By locator) {
        getWebElement(locator).getText();
    }

    public void clickUsingActionsClass(By locator) {

        WebElement element = getWebElement(locator);
        Actions actions = new Actions(web.getDriver());
        actions.click(element).build().perform();
    }
    public void clickThis(By locator){
        getWebElement(locator).click();
    }

    public void type(String data, By locator) {
        getWebElement(locator).sendKeys(data);
    }

    public boolean isWebElementEnabled(By locator) {
        return getWebElement(locator).isEnabled();
    }

    public boolean isWebElementDisplayed(By locator) {
        return getWebElement(locator).isDisplayed();
    }

    public void scrollDown() {
        JavascriptExecutor b = (JavascriptExecutor) web.getDriver();
        b.executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }

    public void scrollBy300Pixels() {
        String lol = web.getDriver().getCurrentUrl();
        web.getDriver().switchTo().window(lol);

        JavascriptExecutor js = (JavascriptExecutor)web.getDriver().switchTo().window(lol);
        js.executeScript("scrollBy(0,300)");
    }
    public void scrollDownByPixels() {
        JavascriptExecutor js = (JavascriptExecutor) web.getDriver();
        js.executeScript("scrollBy(0,500)");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        js.executeScript("scrollBy(0,700)");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        js.executeScript("scrollBy(0,1000)");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        js.executeScript("scrollBy(0,2000)");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        js.executeScript("scrollBy(0,3000)");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        js.executeScript("scrollBy(0,3000)");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void scrollToView(By element){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        JavascriptExecutor je = (JavascriptExecutor) web.getDriver();
        je.executeScript("arguments[0].scrollIntoView()",getWebElement(element));
    }

    public void movingMouseHoverMethod(By locator) {
        Actions act = new Actions(web.getDriver());
        WebElement click1 = web.getDriver().findElement(locator);
        act.moveToElement(click1).build().perform();
    }
    public String getTextMethodAsString(By locator) {
        return getWebElement(locator).getText();
    }

    public void adultCount1 (By element ,String count){
        WebElement adults= getWebElement(element);
        adults.click(); //Click the dropdown
        Select adultAmount = new Select(adults);
        adultAmount.selectByVisibleText(count);

    }
    public void calendar (By element ,String count) {
        List<WebElement> dates = web.getDriver().findElements(element);
        for (WebElement date : dates) {
            if (date.getText().equalsIgnoreCase(count)) {
                date.click();
            }
        }
    }
    public void getWindowHandles(int windowHandleCount){
        Set<String> windowHandles = web.getDriver().getWindowHandles();
        for (String windowHandle : windowHandles){
            if (windowHandle.length()==windowHandleCount){
                break;
            }
        }
    }
    public void switchingWindowHandle (String url){
        Set<String> windowHandles = web.getDriver().getWindowHandles();
        String currentHandle = web.getDriver().getWindowHandle();

        for (String windowHandle : windowHandles){
            web.getDriver().switchTo().window(windowHandle);
            String currentUrl = web.getDriver().getCurrentUrl();
            if (currentUrl.contains(url)){
                return;
            }
        }
        web.getDriver().switchTo().window(currentHandle);
    }
    public void dropDown (By locator,String text){
        WebElement element = getWebElement(locator);
        Select dropDown = new Select(element);
        dropDown.selectByVisibleText(text);
    }
    public void getWebElementsAndClickUsingActionsClass (By element ,String count) {
        List<WebElement> dates = web.getDriver().findElements(element);
        Actions actions = new Actions(web.getDriver());
        switchingWindowHandle("https://www.directword.io/survey/domain=www.hotels.com/locale=en_US?metadata=%7B%22url%22%3A%22https%3A%2F%2Fwww.hotels.com%2F%22%2C%22pagename%22%3A%22home%20page%22%2C%22appname%22%3A%22kes%22%2C%22appversion%22%3A%221.1.2244%22%7D");
        for (WebElement date : dates) {
            if (date.getText().equalsIgnoreCase(count)) {
                actions.click(date).build().perform();
            }
        }
    }
    public void navigateBack (){
        web.getDriver().navigate().back();
    }
    public void navigateForward (){
        web.getDriver().navigate().forward();
    }

}

