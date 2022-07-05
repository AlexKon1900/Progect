package selenium.project.tests;

import kong.unirest.Unirest;
import org.testng.annotations.BeforeMethod;
import selenium.framework.browser.Browser;
import selenium.utils.ConfigFileReader;

public class BaseTest {

    private ConfigFileReader config = ConfigFileReader.configFileReader;

    @BeforeMethod
    public void before() {
        Unirest.config().defaultBaseUrl(config.getApplicationUrl());
    }
}

