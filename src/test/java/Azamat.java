import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Azamat {
    public static void main(String[] args)throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();

        driver.get("https://www.disney.com");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        CD.FindAndClick("id", "goc-button");
        CD.FindAndClick("xpath", "//body//dl//a//u");

//        driver.findElement(By.id("goc-button")).click();
//        driver.findElement(By.xpath("//a[@class = ' goc-icn-1']")).click();

//        CD.FindAndClick("xpath", "//li[@data-category='SALE']");

//        List<WebElement> list = driver.findElements(By.xpath("//li[@data-subitem='Limited Time Offers']/ul//a"));
//
//        for(WebElement l:list){
//            Thread.sleep(3000);
//            Actions action = new Actions(driver);
//            action.moveToElement(sale).perform();
//            Thread.sleep(3000);
//            l.click();
//            System.out.println(l.getText());
//        }

        CD.Done();


    }
}