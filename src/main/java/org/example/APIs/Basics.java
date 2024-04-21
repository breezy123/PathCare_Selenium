package org.example.APIs;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.example.APIs.files.PayLoad;
import org.example.APIs.files.ReUsableMethod;
import org.testng.Assert;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Basics {

    public static void main(String[] args){
        //TODO
        /*//validate if the Add Place API is working as expected

         given - all input details
         when - submit the API
         then - validate the response
         */
        RestAssured.baseURI= "https://rahulshettyacademy.com";
        String response = given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
                .body(PayLoad.AddPlace())
                .when().post("maps/api/place/add/json?key=qaclick123")
                .then().assertThat().statusCode(200).body("scope", equalTo("APP"))
//                .header("server","Apache/2.4.18 (Ubuntu)");
                .extract().response().asString();

        System.out.println(response);
        JsonPath js = new JsonPath(response); //for parsing Json
        String place_id=js.getString("place_id");

        System.out.println("Place_ID: "+place_id);
        //add place -> Update Place with New Address -> Get Place to validate if New address is present in response

        //Update place
        String newAddress ="15 Wild Olive, Mandalay, Cape Town, USA";

        given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json")
                .body(PayLoad.UpdatePlace(place_id,newAddress))
                .when().put("maps/api/place/update/json")
                .then().assertThat().log().all().statusCode(200).body("msg", equalTo("Address successfully updated"));

        //Get place
        String getPlaceResponse = given().log().all().queryParam("key","qaclick123")
                .queryParam("place_id", place_id)
                .when().get("/maps/api/place/get/json")
                .then().assertThat().log().all().statusCode(200).extract().response().asString();

        JsonPath jsonPathGetPlace =ReUsableMethod.rawToJson(getPlaceResponse);


        String actualAddress =jsonPathGetPlace.getString("address");

        Assert.assertEquals(actualAddress,newAddress);
        // Using JUnit and Testng for validating

    }
}
