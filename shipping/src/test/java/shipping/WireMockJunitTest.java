package shipping;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;

public class WireMockJunitTest {

	@Test
    public void testStatusCodePositive() {
        //WireMock.configureFor("localhost", wireMockServer.port());

        given().
                accept(ContentType.JSON).
                when().
                get("http://localhost:8080/api/shipping/calc/4374516").
                then().
                assertThat().statusCode(200);
    }
	
    
  
}