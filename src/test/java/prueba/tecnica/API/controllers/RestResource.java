package prueba.tecnica.API.controllers;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static prueba.tecnica.API.config.SpecBuilder.getRequestSpec;
import static prueba.tecnica.API.config.SpecBuilder.getResponseSpec;

public class RestResource {


    public static Response post(String path,Object request){
        return given(getRequestSpec())
                .body(request)
                .when()
                .post(path)
                .then()
                .spec(getResponseSpec())
                .extract()
                .response();
    }

    public static Response get(String path){
        return given(getRequestSpec())
                .when()
                .get(path)
                .then()
                .spec(getResponseSpec())
                .extract()
                .response();
    }





}
