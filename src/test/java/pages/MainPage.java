package pages;

import base.BasePage;

public class MainPage extends BasePage {
    private String girisYapButton = "//a[@class='btnSignIn']";


    public void clickGirisYap() throws InterruptedException {
        clickElementByxpath(girisYapButton);
        waitBySecond(5);
    }
}
