package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utilities.DriverManager;

public class LoginSteps {

    private LoginPage loginPage = new LoginPage(DriverManager.getInstance().getDriver());
    @And("I set the user name text box with {string}")
    public void setUserName(String userName){
        loginPage.setUserNameTextBox(userName);
    }
    @And("I set the password text box with {string}")
    public void setPassword(String password){
        loginPage.setPasswordTextBox(password);
    }

    @And("I click on the login button")
    public void clickOnLoginButton(){
        loginPage.clickOnLoginButton();
    }

    @Then("I verify that a error message that says {string} is displayed")
    public void verifyErrorMessageText(String errorText){
        loginPage.verifyErrorMessageText(errorText);
    }
}
