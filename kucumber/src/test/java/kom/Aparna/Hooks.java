package kom.Aparna;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    @Before

    public void setUp(){
        new DriverManager().openBrowser();

    }
    @After
    public void tearDown() {
        new DriverManager().closeBrowser();

    }
}
