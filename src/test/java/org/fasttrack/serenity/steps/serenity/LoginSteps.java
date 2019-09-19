package org.fasttrack.serenity.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrack.serenity.pages.AccountPage;
import org.fasttrack.serenity.pages.HomePage;
import org.fasttrack.serenity.pages.LoginPage;

public class LoginSteps {
    private AccountPage accountPage;
    private HomePage homePage;
    private LoginPage loginPage;

    @Step
    public void navigatetoLoginPage(){
        homePage.open();
        homePage.clickAccount();
    }
    @Step
    public void performLogin(String email,String pass) {
        loginPage.setEmailField(email);
        loginPage.setPassField(pass);
        loginPage.clickLoginButton();
    }
    @Step
    public void checkLoggedIn (String username){
        accountPage.isLoggedIn(username);

    }
}