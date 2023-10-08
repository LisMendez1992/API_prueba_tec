package prueba.tecnica.API.config;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;
import static org.hamcrest.Matchers.lessThan;


public class SpecBuilder {
    private static final String BASE_URI = "https://petstore.swagger.io";
    private static final String BASE_PATH = "/v2";

    public static RequestSpecification getRequestSpec() {
        return new RequestSpecBuilder()
                .setBaseUri(BASE_URI)
                .setBasePath(BASE_PATH)
                .addHeader("Content-Type", ContentType.JSON.toString())
                .log(LogDetail.ALL)
                .build();
    }
    public static ResponseSpecification getResponseSpec() {
        return new ResponseSpecBuilder()
                .expectResponseTime(lessThan(5000L), TimeUnit.MILLISECONDS)
                .expectContentType(ContentType.JSON)
                .log(LogDetail.ALL).build();
    }
}
