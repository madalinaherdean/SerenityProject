package org.fasttrack.serenity.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;

@DefaultUrl("http://qa2.fasttrackit.org:8008/?page_id=7")
public class LoginPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"username\"]")
    private WebElementFacade emailField;
    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElementFacade passField;
    @FindBy(xpath = "//*[@id=\"customer_login\"]/div[1]/form/p[3]/button")
    private WebElementFacade loginButton;

    public void setEmailField(String email) {
        typeInto(emailField, email);
    }

    public void setPassField(String pass) {
        typeInto(emailField, pass);
    }

    public void clickLoginButton() {
        clickOn(loginButton);
    }
}
