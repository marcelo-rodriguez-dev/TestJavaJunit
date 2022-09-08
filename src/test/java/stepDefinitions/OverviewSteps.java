package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.OverviewPage;
import utilities.DriverManager;

public class OverviewSteps {

    private OverviewPage overviewPage = new OverviewPage(DriverManager.getInstance().getDriver());

    @Then("I should be able to see the article willow Sauce Labs bike on the OverviewPage page")
    public void verifySauceLabsBikeLightMessage(){
        overviewPage.verifySauceLabsBikeLightMessage();
    }
}
