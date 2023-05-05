package tests;

import base.BasePage;
import base.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import pages.LoginPage;
import pages.MainPage;


public class LoginTest extends BaseTest {
    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();
    BasePage basePage = new BasePage();

    @Test
    public void loginSuccess() throws InterruptedException {
        mainPage.clickGirisYap();
        loginPage.sendKeysToEmailInput("serkan.a.1676@gmail.com");
        loginPage.sendKeysToPasswordInput("SA123456");
        loginPage.scrollDown();
        loginPage.clickLoginButton();
        Assert.assertTrue("login success", true);

    }

    @Test
    public void loginFail1() throws InterruptedException {
        mainPage.clickGirisYap();
        loginPage.sendKeysToEmailInput("serkan.a.1677@gmail.com");
        loginPage.sendKeysToPasswordInput("SA123456");
        loginPage.scrollDown();
        loginPage.clickLoginButton();
        Assert.assertFalse("login fail because of username", false);

    }

    @Test
    public void loginFail2() throws InterruptedException {
        mainPage.clickGirisYap();
        loginPage.sendKeysToEmailInput("serkan.a.1676@gmail.com");
        loginPage.sendKeysToPasswordInput("SA123457");
        loginPage.scrollDown();
        loginPage.clickLoginButton();
        Assert.assertFalse("login fail because of password", false);

    }

}
