package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginPage;

public class LoginStep {
    @Steps
    LoginPage loginPage;

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        loginPage.openUrl("https://www.saucedemo.com");
    }
//
//    @When("I input valid username")
//    public void iInputValidUsername() {
//        loginPage.inputUsername("standard_user");
//    }
//
//    @And("I input valid password")
//    public void iInputValidPassword() {
//        loginPage.inputPassword("secret_sauce");
//    }

    @And("I click Login button")
    public void iClickLoginButton() {
        loginPage.clickLoginBtn();
    }

//    @Then("I will go to dashboard")
//    public void iWillGoToDashboard() {
//        loginPage.headerDisplayed();
//    }
//
//    @When("I input locked username")
//    public void iInputLockedUsername() {
//        loginPage.inputUsername("locked_out_user");
//    }
//
//    @Then("I will get error message")
//    public void iWillGetErrorMessage() {
//        loginPage.errorMessageDisplayed();
//    }
//
//    @When("I input problem username")
//    public void iInputProblemUsername() {
//        loginPage.inputUsername("problem_user");
//    }
//
//    @When("I input performance glitch username")
//    public void iInputPerformanceGlitchUsername() {
//        loginPage.inputUsername("performance_glitch_user");
//    }

    @When("I input {string} username")
    public void iInputUsername(String arg0) {
        loginPage.inputUsername(arg0);
    }

    @And("I input {string} password")
    public void iInputPassword(String arg0) {
        loginPage.inputPassword(arg0);
    }

    @Then("I will get the {string}")
    public void iWillGetThe(String result) {
        if (result.equals("i can't login")){
            loginPage.errorMessageDisplayed();
        }
        else if (result.equals("i can login")){
            loginPage.headerDisplayed();
        }
    }
}
