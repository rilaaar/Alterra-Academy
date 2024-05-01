package stepdefinitions;

import features.Auth.Login;
import features.Order.CreateOrder;
import features.Order.GetAllOrder;
import features.Order.OrderById;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class OrderStep {
    @Steps
    CreateOrder createOrder;
    @Steps
    GetAllOrder getAllOrder;
    @Steps
    OrderById orderById;
    @Steps
    Login login;

    @Given("I set an url api for Create a order")
    public void iSetAnUrlApiForCreateAOrder() {
        createOrder.setUrlCreateOrder();
    }

    @When("I set {string} product_id and {string} quantity")
    public void iSetProduct_idAndQuantity(String product_id, String quantity) {
        createOrder.setBodyData(product_id, quantity);
    }
    @Then("I request to create a order")
    public void iRequestToCreateAOrder() {
        createOrder.requestCreateOrder();
    }

    @Given("I set an url api for get all order")
    public void iSetAnUrlApiForGetAllOrder() {
        getAllOrder.setUrlGetAllOrder();
    }

    @When("I request to get all order with valid token")
    public void iRequestToGetAllOrderWithValidToken() {
        getAllOrder.requestGetAllOrderToken();
    }

    @When("I request to get all order with invalid token")
    public void iRequestToGetAllOrderWithInvalidToken() {
        getAllOrder.requestGetAllOrder();
    }

    @Given("I set an url api for get order  by ID")
    public void iSetAnUrlApiForGetOrderByID() {
        orderById.setUrlOrderById();
    }

    @When("I request to get order by ID with valid token")
    public void iRequestToGetOrderByIDWithValidToken() {
        orderById.requestOrderByIdToken();
    }

    @When("I request to get order by ID with invalid token")
    public void iRequestToGetOrderByIDWithInvalidToken() {
        orderById.requestOrderById();
    }

    @And("I will get {string} order")
    public void iWillGetOrder(String result) {
        if(result.equals("Failed")) {
            createOrder.validateStatusCode401();
        }
        else if(result.equals("Success")){
            login.validateStatusCode200();
        }
    }

    @Then("I will get code 401")
    public void iWillGetCode401() {
        createOrder.validateStatusCode401();
    }
}
