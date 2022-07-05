package selenium.project.tests;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.framework.aiert.MenegerAlert;
import selenium.framework.cookies.ManagerCookie;
import selenium.framework.rest.RestManager;
import selenium.project.pages.HomePage;

public class TestClass extends BaseTest {

    private String cookieName1 = "example_key_1";
    private String cookieValue1 = "example_valye_1";
    private String cookieName2 = "example_key_2";
    private String cookieValue2 = "example_valye_2";
    private String cookieName3 = "example_key_3";
    private String cookieValue3 = "example_valye_3";


    @Test
    public void test() {
        HttpResponse<JsonNode> responseId88 = RestManager.getPostById(88);
        Assert.assertNotNull(responseId88, "responseId88 is null");

        Assert.assertEquals(responseId88.getStatus(), 200);
        Assert.assertEquals(responseId88.getBody().toPrettyString(), "{\n" +
                "  \"userId\": 9,\n" +
                "  \"id\": 88,\n" +
                "  \"title\": \"sapiente omnis fugit eos\",\n" +
                "  \"body\": \"consequatur omnis est praesentium\\nducimus non iste\\nneque hic deserunt\\nvoluptatibus veniam cum et rerum sed\"\n" +
                "}");
    }

}






