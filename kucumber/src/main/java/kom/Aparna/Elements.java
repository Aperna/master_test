package kom.Aparna;

import org.openqa.selenium.By;

public class Elements extends DriverManager {

    public void  searchForAProduct()
    {
        driver.findElement(By.id("small-searchterms")).sendKeys("computers");
    }
    public  void isOnHomePage()
    {
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[1]/div[1]/div[2]/ul/li[1]/a")).click();

    }
    public boolean ishouldgetthatproduct(){
        return true;

    }
    public void addedtobasket(){
       driver.findElement(By.xpath("/html/body/div[6]/div[3]/div[2]/div[2]/div/div[2]/div[1]/div/div[1]/div/h2/a")).click();
       driver.findElement(By.xpath("/html/body/div[6]/div[3]/div[2]/div[2]/div/div[2]/div[3]/div/div[3]/div/div[2]/h2/a")).click();
       driver.findElement(By.name("type")).click();
}}
