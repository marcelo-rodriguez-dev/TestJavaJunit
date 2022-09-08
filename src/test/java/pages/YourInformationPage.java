package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import org.junit.Assert;

public class YourInformationPage {
    private Page driver;
    private Locator nameTextBox;
    private Locator lastNameTextBox;
    private Locator zipCodeTextBox;
    private Locator continueButton;
    private  Locator errorMessage;
    public  YourInformationPage(Page driver){
        this.driver = driver;
        this.nameTextBox = driver.locator("id=first-name");
        this.lastNameTextBox = driver.locator("id=last-name");
        this.zipCodeTextBox = driver.locator("id=postal-code");
        this.continueButton= driver.locator("id=continue");
        this.errorMessage = driver.locator("//h3[@data-test='error']");
    }

    public void setNameTextBox(String name){
            nameTextBox.type(name);
    }

    public void setLastNameTextBox(String lastName){
        lastNameTextBox.type(lastName);
    }

    public void setZipCodeTextBox(String zipCode){
        zipCodeTextBox.type(zipCode);
    }

    public void clickContinueButton(){
        continueButton.click();
    }

    public void verifyErrorMessageText(String errorText){
        Assert.assertEquals(errorText,errorMessage.textContent());
    }


}
