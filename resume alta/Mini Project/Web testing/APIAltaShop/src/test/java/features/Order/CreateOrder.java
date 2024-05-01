package features.Order;

import org.json.simple.JSONObject;

import java.util.LinkedList;
import java.util.List;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;

public class CreateOrder {
    private String url, token;
    private JSONObject body = new JSONObject();
    List<JSONObject> data = new LinkedList<>();

    public void setUrlCreateOrder(){
        url = "https://alta-shop.herokuapp.com/api/orders";
        token = " Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.qWDOcd2UDoTGumbak_fRlZZtf-H7va3sH2a339KGiKU";
    }
    public void setBodyData(String product_id, String quantity) {
        List<Integer> category = new LinkedList<>();
        body.put("product_id", product_id);
        body.put("quantity", quantity);
        data.add(body);
    }
    public void requestCreateOrder(){
//        given().header("Authorization", token)
        given().header("content-type","application/json")
                .body(body)
                .when().post(url);
    }
    public void validateStatusCode401(){
        then().statusCode(401);
    }
}
