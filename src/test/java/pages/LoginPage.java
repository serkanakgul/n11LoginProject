package pages;

import base.BasePage;

public class LoginPage extends BasePage {
    private String emailInput = "email";
    private String passwordInput = "password";

    public void sendKeysToEmailInput(String email) throws InterruptedException {
        sendKeysById(emailInput, email);
        waitBySecond(5);

    }

    public void sendKeysToPasswordInput(String password) throws InterruptedException {
        sendKeysById(passwordInput, password);
        waitBySecond(5);
    }

    public void clickLoginButton() throws InterruptedException {
        clickElementById("loginButton");
        waitBySecond(5);

    }


}
