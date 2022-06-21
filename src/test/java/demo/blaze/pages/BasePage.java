package demo.blaze.pages;

import demo.blaze.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(css = "[onclick='byCat(\\'notebook\\')']")
    public WebElement laptopButton;


}
