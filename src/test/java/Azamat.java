import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Azamat {
    public static void main(String[] args) throws InterruptedException{
        AzamatShopTest();
    }

    public static void AzamatShopTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("https://www.shopdisney.com/?CMP=OTL-Dcom_DropRollover_Store_EFC_280559");
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
//        driver.findElement(By.id("goc-button")).click();
//        driver.findElement(By.xpath("//a[@href='https://www.shopdisney.com/?CMP=OTL-Dcom_DropRollover_Store_EFC_280559']")).click();
        WebDriverWait wait = new WebDriverWait(driver, 30); // added explicit wait
        WebElement sale = driver.findElement(By.xpath("//li[@data-category='SALE']"));

        //SALE
        //CLOTHING
        System.out.println("\nCLOTHING\n");
        Actions action = new Actions(driver);
        action.moveToElement(sale).build().perform();
        driver.findElement(By.xpath("//a[@href='/sale/coats-jackets']")).click();

        if (driver.getCurrentUrl().contains("coats-jackets"))
            System.out.println("Sale Coats & Jackets page verification Passed!");
        else System.out.println("Sale Coats & Jackets page verification Failed!");

        sale = driver.findElement(By.xpath("//li[@data-category='SALE']"));
        action.moveToElement(sale).build().perform();
        driver.findElement(By.xpath("//a[@href='/sale/costumes-accessories']")).click();
        if (driver.getCurrentUrl().contains("costumes"))
            System.out.println("Costumes page verification Passed!");
        else System.out.println("Costumes page verification Failed!");

        sale = driver.findElement(By.xpath("//li[@data-category='SALE']"));
        action.moveToElement(sale).build().perform();
        driver.findElement(By.xpath("//a[@href='/sale/dresses-and-skirts']")).click();

        if (driver.getCurrentUrl().contains("dresses-and-skirts"))
            System.out.println("Dresses and Skirts page verification Passed!");
        else System.out.println("Dresses and Skirts page verification");


        sale = driver.findElement(By.xpath("//li[@data-category='SALE']"));
        action.moveToElement(sale).build().perform();
        driver.findElement(By.xpath("//a[@href='/sale/sleepwear']")).click();

        if (driver.getCurrentUrl().contains("sleepwear"))
            System.out.println("Sleepwear page verification Passed!");
        else System.out.println("Sleepwear page verification Failed");

        sale = driver.findElement(By.xpath("//li[@data-category='SALE']"));
        action.moveToElement(sale).build().perform();
        driver.findElement(By.xpath("//a[@href='/sale/sweaters-sweatshirts']")).click();
        if (driver.getCurrentUrl().contains("sweaters-sweatshirts"))
            System.out.println("Sweaters & Sweatshirts page verifiation Passed!");
        else System.out.println("Sweaters & Sweatshirts page verifiation Failed!");

        sale = driver.findElement(By.xpath("//li[@data-category='SALE']"));
        action.moveToElement(sale).build().perform();
        driver.findElement(By.xpath("//a[@href='/sale/t-shirts-tops']")).click();
        if (driver.getCurrentUrl().contains("t-shirts-tops"))
            System.out.println("T-Shirts & Tops page verification Passed!");
        else System.out.println("T-Shirts & Tops page verification Failed");

        sale = driver.findElement(By.xpath("//li[@data-category='SALE']"));
        action.moveToElement(sale).build().perform();
        driver.findElement(By.xpath("//div[@data-curr-subsection='SALE']//a[@href='/sale/clothes']")).click();
        if (driver.getCurrentUrl().contains("clothes"))
            System.out.println("SHOP ALL Clothing page verification Passed!");
        else System.out.println("SHOP ALL Clothing page verification Failed!");


        //ACCESSORIES
        System.out.println("\nACCESSORIES\n");

        sale = driver.findElement(By.xpath("//li[@data-category='SALE']"));
        action.moveToElement(sale).build().perform();
        driver.findElement(By.xpath("//a[@href='/sale/bags-backpacks']")).click();
        if (driver.getCurrentUrl().contains("bags-backpacks"))
            System.out.println("Bags & Backpacks page verification Passed!");
        else System.out.println("Bags & Backpacks page verification Failed!");

        sale = driver.findElement(By.xpath("//li[@data-category='SALE']"));
        action.moveToElement(sale).build().perform();
        driver.findElement(By.xpath("//div[@data-curr-subsection='SALE']//a[@href='/sale/hats-gloves']")).click();
        if (driver.getCurrentUrl().contains("hats-gloves"))
            System.out.println("Hats & Gloves page verification Passed!");
        else System.out.println("Hats & Gloves page verification Failed!");

        sale = driver.findElement(By.xpath("//li[@data-category='SALE']"));
        action.moveToElement(sale).build().perform();
        driver.findElement(By.xpath("//a[@href='/sale/jewelry-watches']")).click();
        if (driver.getCurrentUrl().contains("jewelry-watches"))
            System.out.println("Jewelry & Watches page verification Passed!");
        else System.out.println("Jewelry & Watches page verification Failed!");

        sale = driver.findElement(By.xpath("//li[@data-category='SALE']"));
        action.moveToElement(sale).build().perform();
        driver.findElement(By.xpath("//a[@href='/sale/shoes-socks']")).click();
        if (driver.getCurrentUrl().contains("shoes-socks"))
            System.out.println("Shoes & Socks page verification Passed!");
        else System.out.println("Shoes & Socks page verification Failed!");

        sale = driver.findElement(By.xpath("//li[@data-category='SALE']"));
        action.moveToElement(sale).build().perform();
        driver.findElement(By.xpath("//div[@data-curr-subsection='SALE']//a[@href='/sale/accessories']")).click();
        if (driver.getCurrentUrl().contains("accessories"))
            System.out.println("SHOP ALL Accessories page verification Passed!");
        else System.out.println("SHOP ALL Accessories page verification Failed!");

        //TOYS
        System.out.println("\nTOYS\n");

        sale = driver.findElement(By.xpath("//li[@data-category='SALE']"));
        action.moveToElement(sale).build().perform();
        driver.findElement(By.xpath("//a[@href='/sale/cars-trains-rc-toys']")).click();
        if (driver.getCurrentUrl().contains("cars-trains-rc-toys"))
            System.out.println("Cars, Trains & RC Toys page verification Passed");
        else System.out.println("Cars, Trains & RC Toys page verification Failed");

        sale = driver.findElement(By.xpath("//li[@data-category='SALE']"));
        action.moveToElement(sale).build().perform();
        driver.findElement(By.xpath("//a[@href='/sale/dolls']")).click();
        if (driver.getCurrentUrl().contains("dolls"))
            System.out.println("Dolls page verification Passed!");
        else System.out.println("Dolls page verification Failed!");

        sale = driver.findElement(By.xpath("//li[@data-category='SALE']"));
        action.moveToElement(sale).build().perform();
        driver.findElement(By.xpath("//a[@href='/sale/play-sets']")).click();
        if (driver.getCurrentUrl().contains("play-sets"))
            System.out.println("Play Sets page verification Passed!");
        else System.out.println("Play Sets page verification Failed!");

        sale = driver.findElement(By.xpath("//li[@data-category='SALE']"));
        action.moveToElement(sale).build().perform();
        driver.findElement(By.xpath("//a[@href='/sale/plush-stuffed-animals']")).click();
        if (driver.getCurrentUrl().contains("plush-stuffed-animals"))
            System.out.println("Plush & Stuffed Animals page verification Passed!");
        else System.out.println("Plush & Stuffed Animals page verification Failed!");

        sale = driver.findElement(By.xpath("//li[@data-category='SALE']"));
        action.moveToElement(sale).build().perform();
        driver.findElement(By.xpath("//div[@data-curr-subsection='SALE']//a[@href='/sale/toys']")).click();
        if (driver.getCurrentUrl().contains("toys"))
            System.out.println("SHOP ALL Toys page verification Passed!");
        else System.out.println("SHOP ALL Toys page verification Failed!");

    }
}