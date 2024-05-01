//package features;
//
//import static net.serenitybdd.rest.SerenityRest.*;
//import static org.hamcrest.Matchers.equalTo;
//
//public class GetAllFeatures {
//
//    private String url, token;
//
//    public void setUrlAndValidToken (){
//        url = "https://api.todoist.com/rest/v2/projects" ;
//        token = "Bearer 4c9229437e7ff00d96acc69c79f9c5b3791bcd79";
//
//    }
//    public void setUrlAndInvalidToken (){
//        url = "https://api.todoist.com/rest/v2/projects" ;
//        token = "Bearer token";
//    }
//
//    public void requestGetAllFeatures (){
//        given().header("Authorization", token)
//                .header("Content-Type", "Application/json");
//        with().get(url);
//
//    }
//
//    public void validateStatusCode200(){
//        then().statusCode(200);
//    }
//
//    public void validateStatusCode401(){
//        then().statusCode(401);
//    }
//
//    public void validateForbiddenMessage(){
//        then().body(equalTo("Forbidden"));
//
//    }
//    public void validateGetListAll(){
//        then().body(equalTo("200 OK"));
//    }
//
//}
