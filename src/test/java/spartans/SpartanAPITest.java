package spartans;

import io.restassured.RestAssured;
import org.junit.Before;
import org.junit.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class SpartanAPITest {

    @Before
    public void setUp(){

        RestAssured.baseURI = "http://107.20.25.103:8000/api" ;

    }

    @Test
    public void getSingleSpartanTest(){

        given()
                .log().all().
        when()
                .get("/spartans/395").
        then()
                .log().all()
                .statusCode(200) ;

    }

    @Test
    public void verifySpartanDataTest(){



    }


}
