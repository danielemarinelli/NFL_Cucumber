package steps;

import core.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    private DriverFactory df = null;

    @Before
    public void initBrowser(){
        df = new DriverFactory();
        BaseStep.setDriver(df.getDriver("Chrome"));

    }

    @After
    public void closeBrowser(){
        df.quitDriver();
    }


}
