package prueba.tecnica.API.test;

import io.restassured.response.Response;

import prueba.tecnica.API.controllers.PetController;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static prueba.tecnica.API.utils.PetUtils.printCountDuplicateNames;
import static prueba.tecnica.API.utils.PetUtils.printData;

public class PetTest {


    Response response;
    PetController petController = new PetController();

    @org.testng.annotations.Test
    public void findPetByStatus() {
        response = petController.getPetByStatus("sold");
        assertThat(response.getStatusCode(),equalTo(200));
        printData(response);
        printCountDuplicateNames(response);

    }
}
