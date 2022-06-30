package selenium.project.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.framework.aiert.MenegerAlert;
import selenium.framework.cookies.ManagerCookie;
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
        HomePage homePage = new HomePage();
        homePage.open();

        ManagerCookie.addCookie("example_key_1", "example_value_1");
        ManagerCookie.addCookie("example_key_2", "example_value_2");
        ManagerCookie.addCookie("example_key_3", "example_value_3");

        Assert.assertEquals (ManagerCookie.getSizeCookie(),  3, "amount cookies is not correct");

      ManagerCookie.deleteCookie("example_key_1");

        Assert.assertEquals(ManagerCookie.getSizeCookie(), 2, "delete");

//        WebElement login = driver.findElement(By.xpath("//input[@name='login']"));
//        login.sendKeys("koniuh.a");
//
//        WebElement in = driver.findElement(By.xpath("//button[@id='passp:sign-in']"));
//        in.click();
//        WebElement passwd = driver.findElement(By.xpath("//input[@name='passwd']"));
//        passwd.sendKeys("34174Kita");
//
//
//        WebElement in2 = driver.findElement(By.xpath("//button[@id='passp:sign-in']"));
//        in2.click();
//
//
//        WebElement in3 = driver.findElement(By.xpath("//html/body/div/div[2]/div[2]"));
//        in3.click();
//
//        WebElement catal = driver.findElement(By.xpath("//span[text()='Каталог']"));
//        catal.click();
//
//        List<WebElement> elements = driver.findElements(By.xpath("//[@li@data-zone-name = 'category-link']"));
//
//
//        Assert.assertEquals(elements.size(), 26, " ");
//        int random = (int) (Math.random() * elements.size());
//        elements.get(random).click();

    }

    @Test
    public void test2() throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.open();
        homePage.clickJSAlert();
        Assert.assertEquals(MenegerAlert.getText(), "I am a JS Alert", "text does not match");

    }

}




