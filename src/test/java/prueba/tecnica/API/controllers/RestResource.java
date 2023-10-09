package prueba.tecnica.API.controllers;

import io.restassured.response.Response;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static prueba.tecnica.API.config.SpecBuilder.*;

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

    public static Response getWithQueryParams(String path,Map<String,?> queryParams){
        return given(getRequestSpec())
                .when()
                .queryParams(queryParams)
                .get(path)
                .then()
                .spec(getResponseSpec())
                .extract()
                .response();
    }
}
