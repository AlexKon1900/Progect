package selenium.project.pages;

import org.openqa.selenium.By;
import selenium.framework.browser.Browser;
import selenium.framework.elements.FormElement;

public class HomePage extends BasePage {

    private FormElement button1 = new FormElement(By.xpath("//button[@onclick='jsAlert()'])"),"button1");

    public void open() {
        Browser.BROWSER.open();
    }

    public void clickJSAlert() {
        button1.click();
    }
}
