package features.Product;

import org.json.simple.JSONObject;

import java.util.LinkedList;
import java.util.List;

import static net.serenitybdd.rest.SerenityRest.given;

public class NewProduct {
    private String url;
    private JSONObject body = new JSONObject();
    List<JSONObject> data = new LinkedList<>();

    public void setUrlNewProduct(){
        url = "https://alta-shop.herokuapp.com/api/products";
    }
    public void setBodyData(String nameproduct, String descriptionproduct, String priceproduct, String categoriesproduct) {
        List<Integer> category = new LinkedList<>();
        body.put("name", nameproduct);
        body.put("description", descriptionproduct);
        body.put("price", priceproduct);
        body.put("categories", categoriesproduct);
        data.add(body);
    }
    public void requestNewProduct(){
        given().header("content-type","application/json")
                .body(body)
                .when().post(url);
    }
}
