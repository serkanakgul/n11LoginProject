package base;

import driverFactory.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class BasePage {


    public void clickElementById(String id) {

        DriverManager.getInstance().getDriver().findElement(By.id(id)).click();

    }

    public void sendKeysById(String id, String keys) {

        DriverManager.getInstance().getDriver().findElement(By.id(id)).sendKeys(keys);

    }

    public void clickElementByxpath(String xpath) {
        DriverManager.getInstance().getDriver().findElement(By.xpath(xpath)).click();
    }

    public void sendKeysByxpath(String xpath, String keys) {
        DriverManager.getInstance().getDriver().findElement(By.xpath(xpath)).sendKeys(keys);
    }

    public void waitBySecond(int seconds) throws InterruptedException {
        TimeUnit.SECONDS.sleep(seconds);


    }


    public void scrollDownToElement(By selector) {
        WebElement element = DriverManager.getInstance().getDriver().findElement(selector);
        ((JavascriptExecutor) DriverManager.getInstance().getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void scrollDownToElement(WebElement element) {
        ((JavascriptExecutor) DriverManager.getInstance().getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void scrollDown() throws InterruptedException {
        Actions actions = new Actions(DriverManager.getInstance().getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
        waitBySecond(5);
        actions.sendKeys(Keys.PAGE_UP).build().perform();
        waitBySecond(5);


    }


}
