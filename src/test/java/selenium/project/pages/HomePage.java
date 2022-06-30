package selenium.project.pages;

import org.openqa.selenium.By;
import selenium.framework.browser.Browser;
import selenium.framework.elements.FormElement;

public class HomePage extends BasePage {
    private FormElement responseAuth = new FormElement(By.xpath("/html/body/pre"), "responseAuth");

    public void open() {
        Browser.BROWSER.open();
    }

    public String getText () {
        return responseAuth.getText();

    }

}
