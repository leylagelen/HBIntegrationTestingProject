package HBIntegrationTestingProject;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class IntegrationTesting {

    public final String SAMPLE_URL = "https://generator.swagger.io/api/gen/clients/ada";

    public final String SAMPLE_BODY = "{\n" +
            "  \"spec\": {},\n" +
            "  \"options\": {\n" +
            "    \"additionalProp1\": \"string\",\n" +
            "    \"additionalProp2\": \"string\",\n" +
            "    \"additionalProp3\": \"string\"\n" +
            "  },\n" +
            "  \"swaggerUrl\": \"http://petstore.swagger.io/v2/swagger.json\",\n" +
            "  \"authorizationValue\": {\n" +
            "    \"value\": \"string\",\n" +
            "    \"type\": \"string\",\n" +
            "    \"keyName\": \"string\"\n" +
            "  },\n" +
            "  \"securityDefinition\": {\n" +
            "    \"type\": \"string\",\n" +
            "    \"description\": \"string\"\n" +
            "  }\n" +
            "}";

    @org.junit.Test
    public void httpStatusWithGET()
    {
        given().contentType(ContentType.JSON).
                when()
                .get(SAMPLE_URL).
                then()
                .statusCode(200);
    }

    @org.junit.Test
    public void httpStatusWithPOST()
    {
        given().contentType(ContentType.JSON).body(SAMPLE_BODY).
                when()
                .post(SAMPLE_URL).
                then().statusCode(200);
    }
}
