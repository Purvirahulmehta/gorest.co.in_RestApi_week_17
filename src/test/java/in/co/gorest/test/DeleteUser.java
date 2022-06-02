package in.co.gorest.test;

import in.co.gorest.testBase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;



import static io.restassured.RestAssured.given;

public class DeleteUser extends TestBase {
    @Test
    public void deleteUser(){
        Response response=given()
                .pathParam("id", 18107)
                .when()
                .delete("/users/{id}");
        response.prettyPrint();
        response.then().statusCode(200);


    }

    }


