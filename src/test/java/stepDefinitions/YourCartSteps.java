package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.YourCartPage;
import utilities.DriverManager;

public class YourCartSteps {
    YourCartPage yourCartPage = new YourCartPage(DriverManager.getInstance().getDriver());
    @And("I click on checkout button")
    public void clickOnCheckoutButton(){
        yourCartPage.clickOnCheckoutButton();
    }

    @And("I click on the remove button")
    public void clickOnRemoveButton(){
        yourCartPage.clickOnRemoveButton();
    }

    @Then("I should be able to see the article Sauce Labs Bike Light into the cart")
    public void verifySauceLabsBikeLightMessage(){
        yourCartPage.verifyItemAddedIsVisible();
    }

    @Then("I should be able to see the cart page without the item Sauce Labs Bike Light into the cart")
    public void verifyItemDeletedIsNotVisible(){
        yourCartPage.verifyItemDeletedIsNotVisible();
    }
}
