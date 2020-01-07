package spartans;

import org.junit.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class SpartanAPITest {

    @Test
    public void getSingleSpartanTest(){

        when()
                .get("http://107.20.25.103:8000/api/spartans/395").
        then()
                .statusCode(200) ;


    }


}
