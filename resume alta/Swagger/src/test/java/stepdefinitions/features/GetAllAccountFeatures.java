//package stepdefinitions.features;
//import features.GetAllFeatures;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import net.thucydides.core.annotations.Steps;
//
//public class GetAllAccountFeatures {
//
//    @Steps
//    GetAllFeatures getAllFeatures;
//
//    @Given("I set an url and valid token to get all account features")
//    public void iSetAnUrlAndValidTokenToGetAllAccountFeatures(){
//
//        getAllFeatures.setUrlAndValidToken();
//
//    }
//
//    @Given("I set an url and invalid token to get all account features")
//    public void iSetAnUrlAndInvalidTokenToGetAllAccountFeatures() {
//
//        getAllFeatures.setUrlAndInvalidToken();
//    }
//
//    @When("I request get account features")
//    public void iRequestGetAccountFeatures() {
//
//        getAllFeatures.requestGetAllFeatures();
//    }
//
//    @Then("I will get 200")
//    public void iWillGet200() {
//
//        getAllFeatures.validateStatusCode200();
//    }
//
//    @And("Get list all features")
//    public void getListAllFeatures() {
//
//        getAllFeatures.validateGetListAll();
//    }
//
//    @Then("I will get 401")
//    public void iWillGet401() {
//
//        getAllFeatures.validateStatusCode401();
//    }
//
//    @And("Get forbidden message")
//    public void getForbiddenMessage() {
//
//        getAllFeatures.validateForbiddenMessage();
//    }
//
//}
