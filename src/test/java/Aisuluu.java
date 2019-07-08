import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Aisuluu {

    public static void main(String[] args) throws InterruptedException {
        parkAndTravel();
        disneyland();
        disneyCruiseLine();
    }
    public static void parkAndTravel(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.disney.com/");

        WebElement travelAndParks= driver.findElement(By.id("goc-button"));
        travelAndParks.click();

        // WebElement WaltDisney = driver.findElement(By.xpath(""));
        // WaltDisney.click();

        List<WebElement> list = driver.findElements(By.xpath(
                "(//dl[@class='menu-section'])[1]/dd[3]/a"));
        System.out.println(list.size());

        for(int  i=0;i<list.size();i++) {
            System.out.println(list.get(i).getText());
            //  driver.findElement(By.linkText(list.get(i).getText())).click();


        }}
    public static void disneyland() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.disney.com/");
        WebElement travelAndParks= driver.findElement(By.id("goc-button"));
        travelAndParks.click();
        Thread.sleep(2000);

        driver.findElement(By.xpath(
                "//a[@href='https://disneyworld.disney.go.com/?DISCID=DI_flyawaynav_9']")).click();
        String string = driver.findElement(By.xpath("//input[@id='qqForm_adultCount']")).getAttribute("value");
        if (string.equals("2")) {
            System.out.println("Default value of 'Adults+18' is passed,2");
        } else {
            System.out.println("Default value didnt pass");
        }
        String child = driver.findElement(By.xpath("//input[@id='qqForm_childCount']")).getAttribute("value");
        if (child.equals("0")) {
            System.out.println("Default value of 'Children' is passed,0");
        } else {
            System.out.println("Default value didnt pass");
//                    driver.close();
        }
    }


    public static void disneyCruiseLine() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.disney.com/");
        WebElement travelAndParks= driver.findElement(By.id("goc-button"));
        travelAndParks.click();
        Thread.sleep(2000);



        driver.findElement(By.xpath("//a[@href='https://disneycruise.disney.go.com/?DISCID=DI_flyawaynav_11']")).click();

        driver.findElement(By.xpath("//span[.='Travel Party']")).click();
        driver.findElement(By.id("accessibility-checkbox-1")).click();
        driver.findElement(By.xpath("//span[.='I Understand']")).click();
        System.out.println(" Verification of reservation for Stateroom  has passed");

        driver.findElement(By.xpath("(//span[@class='ng-scope ng-binding'])[2]")).click();
        driver.findElement(By.id("2019-10-10")).click();
        driver.findElement(By.id("8 to 13")).click();
        driver.findElement(By.xpath("(//span[@class='ng-scope ng-binding'])[3]")).click();
        driver.findElement(By.id("hawai'i-cruises")).click();
        driver.findElement(By.xpath("(//span[@class='ng-scope ng-binding'])[4]")).click();
        driver.findElement(By.id("honolulu-hawai'i-")).click();
        driver.findElement(By.xpath("//span[.='Find Prices']")).click();

        System.out.println("Sorry, change your destinations or you will try travel next time ! You have to study Selenium for now");



    }

}
