package org.fasttrack.serenity.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa2.fasttrackit.org:8008/")
public class HomePage extends PageObject {
@FindBy(xpath = "//*[@id=\"menu-item-64\"]/a")
    private WebElementFacade AccountLink;
public void clickAccount(){
    clickOn(AccountLink);
}
}
