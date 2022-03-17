package APITask;
import com.google.gson.JsonObject;
import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.apache.http.HttpStatus;
import org.hamcrest.Matchers.*;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.replaceFiltersWith;

public class Categories {
    String BaseUrl ="http://localhost:3030/categories";
    private static String requestBody = "{\n" +
            "  \"name\": \"farahA\",\n" +
            "  \"id\": \"25\" \n}";
     //JSON.parse(requestBody);
    @Test
    public void CheckStatusCode()
    {
    given().get(BaseUrl).then().statusCode(200);
    }
    @Test
    public void ADDCategory()
    {
         given()
                .header("Content-type", "application/json")
                .and()
                .body(requestBody)
                .when()
                .post(BaseUrl)
                .then()
                .statusCode(201);



    }
    @Test
    public void CategoryByID()
    {

        RequestSpecification httpRequest = RestAssured.given();
        Response response= httpRequest.get(BaseUrl+ "/25");
        ResponseBody body = response.getBody();
        System.out.println("Response Body is: " + body.asString());
        Assert.assertEquals(body.asString().contains("farahA"),true,"farahA");
        System.out.println("Response Body is: " + body.asString());
    }

    @Test
    public void DeleteCategory() {

            Response response = given()
                    .header("Content-type", "application/json")
                    .when()
                    .delete(BaseUrl+"/25")
                    .then()
                    .extract().response();

            Assert.assertEquals(response.getStatusCode(),200);

    }

}
