package in.co.gorest.test;

import in.co.gorest.model.Pojo;
import in.co.gorest.testBase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PatchUpdateUser extends TestBase {
    @Test
            public void updateUser(){
        Pojo pojo=new Pojo();
        pojo.setName("Tenali Ramakrishna");
        pojo.setGender("Female");
        pojo.setEmail("tenali.ramakrishn@gmail.com");
        pojo.setStatus("active");
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer c426452f777927f6e49219f45652a5fd08178e3f873af217a5b982a6fdd15dac")
                .when()
                .patch("/users/18107");
        response.prettyPrint();
        response.then().statusCode(200);

    }

    }




