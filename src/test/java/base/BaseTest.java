package base;

import driverFactory.DriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    public WebDriver driver;

    @Before
    public void setUpDriver() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.n11.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().getPageLoadTimeout();
        DriverManager.getInstance().setDriver(driver);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
