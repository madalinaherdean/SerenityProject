package org.fasttrack.serenity.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa2.fasttrackit.org:8008/?page_id=7")
public  class AccountPage extends PageObject{
    @FindBy(xpath = "http://qa2.fasttrackit.org:8008/?page_id=7")
    private WebElementFacade helloText;

    public boolean isLoggedIn (String userName){
        String text = helloText.getText();
        return helloText.containsOnlyText("heloo"+userName);

    }
}




