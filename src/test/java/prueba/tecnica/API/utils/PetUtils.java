package prueba.tecnica.API.utils;

import io.restassured.response.Response;

import java.util.List;
import java.util.Map;

public class PetUtils {
    public static void printData(Response response) {
        List<Map<String, Object>> pets = response.jsonPath().getList("$");
        for (Map<String, Object> pet : pets) {
            String id = pet.get("id").toString();
            String name = pet.get("name").toString();
            System.out.println("ID: " + id + ", Name: " + name);
        }

    }
    public static void printCountDuplicateNames(Response response) {
        List<Map<String, Object>> pets = response.jsonPath().getList("$");
        PetCount petCount = new PetCount(pets);
        Map<String, Integer> resul = petCount.countDuplicateNames();
        System.out.println("------Duplicate Pet Names and Their Corresponding Counts:-----");
        resul.forEach((key, value) -> {
            System.out.println(key + " " + value);
        });
    }
}

