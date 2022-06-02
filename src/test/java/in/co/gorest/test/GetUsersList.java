package in.co.gorest.test;

import in.co.gorest.testBase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class GetUsersList extends TestBase{
    @Test
    public void getUsersList(){
        Response response=given()
                .when()
                .get("/users");
        response.prettyPrint();
        response.then().statusCode(200);
        List<Integer> totalRecords =  response.then().extract().path("");
        System.out.println(" Total records are 20 : " +totalRecords.size());

        List<String> name = response.then().extract().path("findAll{it.id==3268}.name");
        System.out.println("Name value is : " + name);

        List<String> mail = response.then().extract().path("findAll{it.id==3268}.email");
        System.out.println("email value is : " + mail);

        List<String> genderFemale = response.then().extract().path("findAll{it.id==3268}.gender");
        System.out.println("Gender of ID 3269 is : " + genderFemale);

        List<String> genderMale = response.then().extract().path("findAll{it.id==3264}.gender");
        System.out.println("Gender of ID 3269 is : " + genderMale);

        List<String> status= response.then().extract().path("findAll{it.status=='active'}.id");
        System.out.println("Id of active status are : " +status);


    }



}

