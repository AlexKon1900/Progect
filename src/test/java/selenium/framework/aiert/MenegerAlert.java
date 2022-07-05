package selenium.framework.aiert;

import org.openqa.selenium.WebDriver;
import selenium.framework.browser.Browser;

public class MenegerAlert {

    private static WebDriver driver = Browser.BROWSER.getDriver();

    public static String getText() {

        return driver.switchTo().alert().getText();
    }

}
