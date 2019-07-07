import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Aziza {
    public static void main(String[] args) throws InterruptedException{
        AzizaTestOne();
        AzizaTestTwo();
        AzizaTestThree();
    }

    public static void AzizaTestOne() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://disney.com");
        WebElement menu = driver.findElement(By.xpath("//button[@class='goc-logo-image']/span"));
        menu.click();
        Thread.sleep(2000);
        WebElement DisneyStyleButton = driver.findElement(By.xpath("//a[@href='https://style.disney.com/']"));
        DisneyStyleButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        if(driver.getCurrentUrl().equals("https://style.disney.com/")){
            System.out.println("Url verification PASSED");
        }
        else{
            System.out.println("Url verification FAILED");
        }
        String [] arr = {"beauty","fashion", "living", "news", "video","shop"};
        driver.findElement(By.xpath("//a[@href='https://style.disney.com/beauty/']")).click();
        if(driver.getCurrentUrl().contains(arr[0])){
            System.out.println("Navigate to "+ arr[0]+ " page is PASSED");
        }
        else{
            System.out.println("Navigate to "+ arr[0]+ " page is FAILED");
        }
        driver.findElement(By.xpath("//a[@href='https://style.disney.com/fashion/']")).click();
        if(driver.getCurrentUrl().contains(arr[1])){
            System.out.println("Navigate to "+ arr[1]+ " page is PASSED");
        }
        else{
            System.out.println("Navigate to "+ arr[1]+ " page is FAILED");
        }
        driver.findElement(By.xpath("//a[@href='https://style.disney.com/living/']")).click();
        if(driver.getCurrentUrl().contains(arr[2])){
            System.out.println("Navigate to "+ arr[2]+ " page is PASSED");
        }
        else{
            System.out.println("Navigate to "+ arr[2]+ " page is FAILED");
        }
        driver.findElement(By.xpath("//a[@href='https://style.disney.com/news/']")).click();
        if(driver.getCurrentUrl().contains(arr[3])){
            System.out.println("Navigate to "+ arr[3]+ " page is PASSED");
        }
        else{
            System.out.println("Navigate to "+ arr[3]+ " page is FAILED");
        }
        driver.findElement(By.xpath("//a[@href='https://video.disney.com/disney-style?bypass_cache=11%20']")).click();
        driver.navigate().back();
        if(driver.getCurrentUrl().contains(arr[4])){
            System.out.println("Navigate to "+ arr[4]+ " page is PASSED");
        }
        else{
            System.out.println("Navigate to "+ arr[4]+ " page is FAILED");
        }
        driver.findElement(By.xpath("//a[@href='https://style.disney.com/shop/']")).click();
        if(driver.getCurrentUrl().contains(arr[5])){
            System.out.println("Navigate to "+ arr[5]+ " page is PASSED");
        }
        else{
            System.out.println("Navigate to "+ arr[5]+ " page is FAILED");
        }
    }

    public static void AzizaTestTwo() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://disney.com");
        WebElement menu = driver.findElement(By.xpath("//button[@class='goc-logo-image']/span"));
        menu.click();
        Thread.sleep(2000);

        WebElement DisneyStyleButton = driver.findElement(By.xpath("//a[@href='https://style.disney.com/']"));
        DisneyStyleButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement searchButton = driver.findElement(By.xpath("//button[@class='tm-header-search-btn']"));
        searchButton.click();

        boolean b = driver.findElement(By.id("tm-search-input")).isEnabled();

        if(b){
            System.out.println("Search button is ENABLED");
            driver.findElement(By.id("tm-search-input")).sendKeys("tshirt" + Keys.ENTER);
            if(driver.getCurrentUrl().contains("tshirt")){
                System.out.println("The Search Functionality test case is PASSED");
            }
            else{
                System.out.println("The Search Functionality test case is FAILED");
            }


        }
        else{
            System.out.println("Search button is DISABLED");
        }
    }

    public static void AzizaTestThree() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://disney.com");
        WebElement menu = driver.findElement(By.xpath("//button[@class='goc-logo-image']/span"));
        menu.click();
        Thread.sleep(2000);

        WebElement DisneyStyleButton = driver.findElement(By.xpath("//a[@href='https://style.disney.com/']"));
        DisneyStyleButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        List<WebElement> socialMedia = driver.findElements(By.xpath("//div[@class='tm-social']"));

        // boolean social = driver.
        for (int i = 0; i <socialMedia.size(); i++) {

            driver.findElement(By.xpath("//div[@class='tm-social']"));
            WebElement faceBook = driver.findElement(By.xpath("//div[@class='tm-social']/a[1]"));
            faceBook.click();
            String faceBookText = faceBook.getText();

            WebElement insta = driver.findElement(By.xpath("//div[@class='tm-social']/a[2]"));
            insta.click();

            WebElement youTube = driver.findElement(By.xpath("//div[@class='tm-social']/a[3]"));
            youTube.click();

            WebElement twitter = driver.findElement(By.xpath("//div[@class='tm-social']/a[4]"));
            twitter.click();

            WebElement tumblr = driver.findElement(By.xpath("//div[@class='tm-social']/a[5]"));
            tumblr.click();

            if(socialMedia.get(i).isDisplayed()){
                System.out.println("Verification of social media pages is Passed");
            }
            else{
                System.out.println("Verification of social media pages is Failed");
            }
            driver.navigate().back();
        }
    }

}
