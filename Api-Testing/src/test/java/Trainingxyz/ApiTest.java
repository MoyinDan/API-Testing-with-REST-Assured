package Trainingxyz;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;


class ApiTest {

    @Test
    public void getCategories() {
        String endpoint = "https://localhost:3307/api_testing/categories/read.php";
         var response =  given()
                 .when()
                        .get(endpoint)
                 .then();
         response. log(). body();
    }

    @Test
    public void getProduct(){
        String endpoint = "https://localhost:3307/api_testing/product/read_one.php";
               var response =
                       given().
                               queryParam("id", 2).
                       when().
                               get(endpoint).
                       then();
        response. log(). body();
    }
}