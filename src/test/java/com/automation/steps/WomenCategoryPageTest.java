package com.automation.steps;

import com.automation.pages.HomePage;
import com.automation.pages.ProductPage;
import com.automation.pages.WomenCategoryPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class WomenCategoryPageTest {

    @When("^I click on Women link$")
    public void iClickOnWomenLink() {
        new HomePage().clickOnWomenLink();
    }

    @Then("^I should see text \"([^\"]*)\"$")
    public void iShouldSeeText(String tab)  {
        String wTitle=new WomenCategoryPage().getWomenTitle().toUpperCase();
        Assert.assertEquals("Error message not displayed", tab, wTitle);

    }

    @When("^I select product \"([^\"]*)\"$")
    public void iSelectProduct(String product)  {
        new ProductPage().selProduct(product);

    }

    @And("^I change quantity \"([^\"]*)\"$")
    public void iChangeQuantity(String qty)  {
        new ProductPage().enterQtyAdd(qty);

    }

    @And("^I select size \"([^\"]*)\"$")
    public void iSelectSize(String size)  {
        new ProductPage().selectSize(size);

    }

    @And("^I select colour \"([^\"]*)\"$")
    public void iSelectColour(String colour)  {
        new ProductPage().selColour(colour);

    }

    @And("^I click on Add Cart$")
    public void iClickOnAddCart() {
        new ProductPage().clickAddCart();
    }

    @Then("^I should see the message \"([^\"]*)\"$")
    public void iShouldSeeTheMessage(String message)  {
        new ProductPage().getAddMes(message);

    }

    @And("^I click close button$")
    public void iClickCloseButton() {
        new ProductPage().setCloseBtn();
    }
}
