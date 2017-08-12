package kom.Aparna;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class DriverManager {
    public static WebDriver driver;
    public void openBrowser()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\katuk_000\\Downloads\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://demo.nopcommerce.com" +
                "");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }
    public void closeBrowser(){
        driver.quit();
    }
}

    //public void setUp() throws Exception {
        //invoke the driver
        //System.setProperty("web.chrome.driver","chromedriver.exe");
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\katuk_000\\Downloads\\chromedriver.exe");


        //"C:\Program Files (x86)\Google\Chrome\Application\chrome.exe"
        //driver = new ChromeDriver();
        //open url
        //driver.get("http://demo.nopcommerce.com/register");
       // driver.manage().window().maximize();