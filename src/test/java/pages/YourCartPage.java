package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import org.junit.Assert;

public class YourCartPage {
    private Page driver;
    private Locator checkoutButton;
    private Locator removeButton;
    public YourCartPage(Page driver){
        this.driver = driver;
        this.checkoutButton=driver.locator("id=checkout");
        this.removeButton = driver.locator("id=remove-sauce-labs-bike-light");
    }
    public void clickOnCheckoutButton(){
        checkoutButton.click();
    }

    public void clickOnRemoveButton(){
        removeButton.click();
    }

    public void verifyItemAddedIsVisible(){
        Assert.assertTrue(driver.isVisible("//*[@id=\"item_0_title_link\"]/div"));
    }

    public void verifyItemDeletedIsNotVisible(){
        Assert.assertTrue(!driver.isVisible("//*[@id=\"item_0_title_link\"]/div"));
    }

}
