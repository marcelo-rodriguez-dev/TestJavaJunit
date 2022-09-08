package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import org.junit.Assert;

public class OverviewPage {
    private Page driver;
   // private Locator SauceLabsBikeLightItem;


    public OverviewPage(Page driver){
        this.driver = driver;
    }

   public void verifySauceLabsBikeLightMessage(){
       Assert.assertTrue(driver.
               isVisible("//*[@id=\"item_0_title_link\"]/div"));
   }

}
