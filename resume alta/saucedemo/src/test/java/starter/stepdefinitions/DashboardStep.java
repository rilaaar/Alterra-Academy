package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.DashboardPage;
import starter.pages.LoginPage;

public class DashboardStep {
    @Steps
    LoginPage loginPage;
    @Steps
    DashboardPage dashboardPage;

    @Given("I am on login account")
    public void iAmOnLoginAccount() {
        loginPage.inputUsername("standard_user");
        loginPage.inputPassword("secret_sauce");
        loginPage.clickLoginBtn();
    }
    @When("I click sidebar button")
    public void iClickSidebarButton() {
        dashboardPage.clickSidebar();
    }

    @And("I click about button")
    public void iClickAboutButton() {
        dashboardPage.clickAboutButton();
    }

    @Then("I will go to about page")
    public void iWillGoToAboutPage() {
        dashboardPage.aboutDisplayed();
    }

    @And("I click logout button")
    public void iClickLogoutButton() {
        dashboardPage.clickLogoutButton();
    }

    @Then("I will go to login page")
    public void iWillGoToLoginPage() {
        dashboardPage.loginLogoPage();
    }

    @And("I click photo product")
    public void iClickPhotoProduct() {
        dashboardPage.photoProduct();
    }

    @Then("I will go to product detail page")
    public void iWillGoToProductDetailPage() {
        dashboardPage.detailPageProduct();
    }

    @And("I click name product")
    public void iClickNameProduct() {
        dashboardPage.nameProduct();
    }

    @And("I click add to cart button")
    public void iClickAddToCartButton() {
        dashboardPage.clickCartButton();
    }

    @Then("I get remove button")
    public void iGetRemoveButton() {
        dashboardPage.cartPageMenu();
    }

    @And("I click sort button")
    public void iClickSortButton() {
        dashboardPage.clickSortButton();
    }

    @And("I click name")
    public void iClickName() {
        dashboardPage.clickSortName();
    }

    @Then("I get custom list product Az")
    public void iGetCustomListProductAz() {
        dashboardPage.sortProductAz();
    }

    @And("I click price")
    public void iClickPrice() {
        dashboardPage.clickSortPrice();
    }

    @And("I click cart button")
    public void iClickCartButton() {
        dashboardPage.clickCartLink();
    }

    @Then("I will go to my cart page")
    public void iWillGoToMyCartPage() {
        dashboardPage.cartPageMenu();
    }

    @Then("I get custom list product Price")
    public void iGetCustomListProductPrice() {
        dashboardPage.sortProductPrice();
    }


}
