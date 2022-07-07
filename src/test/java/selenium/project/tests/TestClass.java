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
import selenium.project.model.MyPost;
import selenium.project.pages.HomePage;
import selenium.utils.Fixtures;
import selenium.utils.JsonUtils;

import java.io.FileNotFoundException;

public class TestClass extends BaseTest {

    private String cookieName1 = "example_key_1";
    private String cookieValue1 = "example_valye_1";
    private String cookieName2 = "example_key_2";
    private String cookieValue2 = "example_valye_2";
    private String cookieName3 = "example_key_3";
    private String cookieValue3 = "example_valye_3";


    @Test
    public void checkPostId88() throws FileNotFoundException {
        HttpResponse<JsonNode> responseId88 = RestManager.getPostById(88);
        Assert.assertNotNull(responseId88, "responseId88 is null");

        Assert.assertEquals(responseId88.getStatus(), 200);

        MyPost expected = JsonUtils.createOject(Fixtures.POST_ID_88, MyPost.class);
        MyPost actual = JsonUtils.createMyPostByJson(responseId88.getBody().toString());

        Assert.assertEquals(actual, expected, "");

    }

    @Test
    public void checkPostsId101()  throws FileNotFoundException {
        HttpResponse<JsonNode> responseId101 = RestManager.getPostById(101);
        Assert.assertNotNull(responseId101, "responseId101 is null");

        Assert.assertEquals(responseId101.getStatus(), 404);
        Assert.assertEquals(responseId101.getBody().toPrettyString(), "{}");

    }
}






