package prueba.tecnica.API.test;

import io.restassured.response.Response;
import prueba.tecnica.API.config.SpecBuilder;
import prueba.tecnica.API.controllers.UserController;
import prueba.tecnica.API.models.UserModel;
import prueba.tecnica.API.utils.ConfigLoader;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static prueba.tecnica.API.utils.RandomId.randomId;


public class UserTest extends SpecBuilder {

    Response response;
    private UserController userController = new UserController();

    @org.testng.annotations.Test
    public void createUserWithValidData() {

        UserModel newUser = UserModel.builder()
                .id(randomId())
                .username(ConfigLoader.getInstance().getProperty("username"))
                .firstName(ConfigLoader.getInstance().getProperty("firstName"))
                .lastName(ConfigLoader.getInstance().getProperty("lastName"))
                .email(ConfigLoader.getInstance().getProperty("email"))
                .password(ConfigLoader.getInstance().getProperty("password"))
                .phone(ConfigLoader.getInstance().getProperty("phone"))
                .userStatus(Integer.valueOf(ConfigLoader.getInstance().getProperty("userStatus")))
                .build();
        response = userController.createUser(newUser);
        assertThat(response.getStatusCode(),equalTo(200));
    }

    @org.testng.annotations.Test
    public void getUser() {
        response = userController.getUserByUserName(ConfigLoader.getInstance().getProperty("username"));
        assertThat(response.getStatusCode(),equalTo(200));
        response.then().log();
    }
}
