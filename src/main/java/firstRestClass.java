import static io.restassured.RestAssured.given;

public class firstRestClass {

public void getResponseBody(){

    given().queryParam("CUSTOMER_ID","68195")
            .queryParam("PASSWORD","1234!")
            .queryParam("Account_No","1")
            .when().get("http://demo.guru99.com/V4/sinkministatement.php").then().log()
            .body();



}

    public static void main(String[] args) {
        firstRestClass obj = new firstRestClass();
        obj.getResponseBody();
    }


}
