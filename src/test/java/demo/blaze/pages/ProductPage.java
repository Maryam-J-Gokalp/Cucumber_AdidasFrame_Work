package demo.blaze.pages;

import demo.blaze.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage{



    public void getLink(String string){
        Driver.getDriver().findElement(By.partialLinkText(string)).click();
    }
}
