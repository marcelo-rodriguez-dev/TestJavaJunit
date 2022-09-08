package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.YourInformationPage;
import utilities.DriverManager;

import java.util.List;

public class YourInformationSteps {
    YourInformationPage yourInformationPage = new YourInformationPage(DriverManager.getInstance().getDriver());
    @And("I fill the customer data with")
    public void fillCustomerInformation(DataTable customerData){
        List<String>data= customerData.transpose().asList(String.class);
        yourInformationPage.setNameTextBox(data.get(0));
        yourInformationPage.setLastNameTextBox(data.get(1));
        yourInformationPage.setZipCodeTextBox(data.get(2));
    }

    @And("I fill the customer data with name Blank")
    public void fillCustomerInformationNameBlank(DataTable customerData){
        List<String>data= customerData.transpose().asList(String.class);
        yourInformationPage.setLastNameTextBox(data.get(0));
        yourInformationPage.setZipCodeTextBox(data.get(1));
    }

    @And("I click on continue button")
    public void clickOnContinueButton(){
        yourInformationPage.clickContinueButton();
    }

    @Then("I should be able to see the error message {string}")
    public void verifyErrorMessageText(String errorText){
        yourInformationPage.verifyErrorMessageText(errorText);
    }
}

