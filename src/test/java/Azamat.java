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
    }

    public static void AzamatTestOne() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();

        driver.get("https://www.disney.com");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

//        CD.FindAndClick("xpath", "//body//div/button[@class='goc-button']");
//        CD.FindAndClick("xpath", "//body//dl//a//u");

        driver.findElement(By.id("goc-button")).click();
        driver.findElement(By.xpath("//body//div//a[.='Sale']")).click();

        Thread.sleep(3000);

//        WebElement sale = driver.findElement(By.xpath("//body//div//a[@href='/sale']"));
//        List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"side-nav-categories\"]/ul[1]/li[2]/div[2]/div/div/ul[2]/li/ul[2]/li/ul"));

        CD.MoveToElement("xpath", "//body//div//a[@href='/sale']");

//        for(WebElement elem:elements){
//            Thread.sleep(3000);
//            Actions action = new Actions(driver);
//            action.moveToElement(sale).perform();
//            Thread.sleep(3000);
//            elem.click();
//            System.out.println(elem.getAttribute("href") + "\n" + driver.getCurrentUrl());
//        }

        CD.Done();
    }

}