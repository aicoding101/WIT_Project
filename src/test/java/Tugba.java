import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;

public class Tugba {
    public static void main(String[] args) throws  InterruptedException{
        TugbaTest();
    }

    public static void TugbaTest() throws InterruptedException{
        // Scenario # 1: Verifying if the url contains the word "disney" after loging to https://www.shopdisney.com
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.shopdisney.com/");
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assert.assertTrue(driver.getCurrentUrl().contains("disney"));

        Thread.sleep(3000);

        // Scenario # 2: Verifying if the url contains "sale" after clicking on the "SALE" button
        driver.get("https://www.shopdisney.com/");
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement sale = driver.findElement(By.linkText("SALE"));
        sale.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("sale"));


        Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.shopdisney.com");


        //search button
        driver.findElement(By.xpath("//*[@id=\"search-global\"]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"bar\"]/div/form/span[1]/span[1]/span/ul/li/input")).
                sendKeys("dolls"+ Keys.ENTER);
    }

}
