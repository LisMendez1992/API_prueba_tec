package prueba.tecnica.API.test;

import io.restassured.response.Response;
import prueba.tecnica.API.config.SpecBuilder;
import prueba.tecnica.API.controllers.UserController;
import prueba.tecnica.API.models.UserModel;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static prueba.tecnica.API.utils.RandomId.randomId;

public class UserTest extends SpecBuilder {

    Response response;
    private UserController userController = new UserController();

    @org.testng.annotations.Test
    public void createUserWithValidUserAndPassword() {

        UserModel newUser = UserModel.builder()
                .id(randomId())
                .username("caprini92")
                .firstName("lis")
                .lastName("mendez")
                .email("jessicalis@gmail.com")
                .password("pass")
                .phone("4234234324")
                .userStatus(0)
                .build();
        response = userController.createUser(newUser);
        assertThat(response.getStatusCode(),equalTo(200));
    }

    @org.testng.annotations.Test
    public void getUserAndValidateUserAndPassword() {
        response = userController.getUserByUserName("caprini92");
        response.then().log();
    }


}
