package org.fasttrack.serenity.features.search;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrack.serenity.steps.serenity.LoginSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginTest {
   @Managed(uniqueSession = true)
    private WebDriver driver;

@Steps
LoginSteps loginSteps;


private String userEmail = "madalina_herdean@yahoo.com";
private String userPass = "madalina1234%";
private String userName = "madalina_herdean";

@Test
public void validLoginTest(){
    loginSteps.navigatetoLoginPage();
    loginSteps.performLogin(userName,userPass);
    loginSteps.checkLoggedIn(userName);

}




}
