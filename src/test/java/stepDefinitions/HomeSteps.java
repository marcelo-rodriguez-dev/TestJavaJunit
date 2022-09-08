package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.HomePage;
import utilities.DriverManager;

public class HomeSteps {
    private HomePage homePage = new HomePage(DriverManager.getInstance().getDriver());

    @Then("I am in the home page")
    @Then("I should be in the home page")
    public void verifyImHomePage(){
        homePage.verifyHomePageHeaderIsDisplayed();
    }

    @Then("I verify that {string} is displayed")
    public void verifyProductInHomePage(String product){
        homePage.verifyProductInHomePage(product);
    }

    @Then("I add Sauce Labs Bike Light product to the cart")
    public void addSauceLabsBikeLightToCar(){
        homePage.clickOnAddSauceLabsBikeLight();
    }

    @And("I click on the cart button")
    public void clickOnCartIcon(){
        homePage.clickOnCartIcon();
    }
}
