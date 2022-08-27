package pe.com.bcp.devskiller;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.*;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Por favor ir a https://gorest.co.in/ para obtener más información
 *
 * Algunos endpoints:
 * https://gorest.co.in/public/v2/users
 * https://gorest.co.in/public/v2/posts
 * https://gorest.co.in/public/v2/comments
 * https://gorest.co.in/public/v2/todos
 *
 * 1.- debe verificar si el endpoint de Users esta disponible
 * 2.- debe verificar que el usuario con ID [XXXX] está Active
 * Nota: Para obtener ID del usuario hacer un [GET] /users y revisar los usuarios Active
 * o usar el método getActiveUser()
 */
public class ApiTest extends BaseTest {


    public Response getUsersEndpointResponse() {
//        devolver correctamente la Response
        return null;
    }


    @Test
    public void serviceIsOKTest()
    {
//        Validar que el servicio esté disponible
        getUsersEndpointResponse().then().assertThat().statusCode(1);
    }

    public Response getUserByIdResponse() {
//        devolver correctamente la Response de User por ID
//        puedes usar el método getActiveUserId()
        return when().get("");
    }

    @Test
    public void resourceIsActiveTest()
    {
//        Validar que el User obtenido tiene status:active
        throw new NotImplementedException();
    }


}
