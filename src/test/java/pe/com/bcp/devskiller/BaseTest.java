package pe.com.bcp.devskiller;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.junit.Before;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Properties;
import java.util.logging.Logger;

import static io.restassured.RestAssured.when;

public class BaseTest {
    @Before
    public void setup() throws IOException {
        Properties properties = new Properties();
        properties.load(BaseTest.class.getResourceAsStream("/config.properties"));
        RestAssured.baseURI = properties.getProperty("BASE_URI");
        RestAssured.port = Integer.parseInt(properties.getProperty("PORT"));
    }

    public String getActiveUserId() {
        JsonPath users = when().get("/users").then().extract().jsonPath();
        Logger.getLogger("Get active User ID").info(users.prettify());
        return ((ArrayList<LinkedHashMap<String, Object>>) users.get())
                .stream().filter(u -> u.get("status").equals("active")).findFirst().get().get("id").toString();
    }
}
