package prueba.tecnica.API.controllers;

import io.restassured.response.Response;
import prueba.tecnica.API.models.PetModel;

import java.util.HashMap;
import java.util.Map;

public class PetController {

    private static final String PATH = "/pet";

    public Response getPetByStatus(String status){
        Map<String,String> queryParams = new HashMap<>();
        queryParams.put("status",status);
        return RestResource.getWithQueryParams(PATH+"/"+"findByStatus",queryParams);
    }
}
