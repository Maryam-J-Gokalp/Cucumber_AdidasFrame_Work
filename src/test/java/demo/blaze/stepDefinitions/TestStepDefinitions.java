package demo.blaze.stepDefinitions;

import demo.blaze.pages.ProductPage;
import demo.blaze.utilities.BrowserUtils;
import demo.blaze.utilities.ConfigurationProperties;
import demo.blaze.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestStepDefinitions {
    ProductPage productPage = new ProductPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);


    @Given("buyer is on the homepage of demoblaze")
    public void buyer_is_on_the_homepage_of_demoblaze() {
        Driver.getDriver().get(ConfigurationProperties.getProperty("web.site"));

    }
    @When("buyer adds from {string} category {string} product to cart")
    public void buyer_adds_from_category_product_to_cart(String string, String string2) {

        productPage.getLink(string);
        productPage.getLink(string2);
        productPage.getLink("Add to cart");
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();


    }
    @When("buyer clicks on {string} link")
    public void buyer_clicks_on_link(String string) {


        productPage.getLink(string);

    }
}
