package com.ne0t0n.usersstore;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static io.restassured.RestAssured.*;


//@SpringBootTest
class UserStoreApiTest {

    @Test
    public void getAllUsersTest() {
//        String url = "http://localhost:8081/users/all";
//        int statusCode = when().
//                get("http://localhost:8081/users/all").getStatusCode();
//
//        System.out.println("The response status is " + statusCode);
        given().when().get("http://localhost:8890/users/all").then().assertThat().statusCode(200);



    }
}